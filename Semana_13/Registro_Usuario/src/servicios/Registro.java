package servicios;

import java.util.List;
import java.util.ArrayList;
import Entidades.Cajero;
import Entidades.Cliente;
import Entidades.Usuario;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

/**
 *
 * @author María Belén
 */
public class Registro {

    List<Usuario> usuario = new ArrayList<Usuario>();
    private Object usuarios;

 
    public void agregar(Cliente cliente, Usuario Cliente) {
        this.usuario.add(Cliente);
    }

    public void agregar(Cajero cajero, Usuario Cajero) {
        this.usuario.add(Cajero);
    }

    public Usuario buscar(final String valor) {
        return usuario
                .stream()
                .filter(u -> 
                        (u.getNombre().contains(valor)|| 
                         u.getApellido().contains(valor)|| 
                         u.getIdentificacion().contains(valor)))
                         .findFirst().orElse(null);
    }

    public List<Usuario> verTodo() {
        return this.usuario;
    }
    public List<Usuario> verClientes(){ 
        return this.usuario
                .stream()
                .filter(u -> u instanceof Cliente)
                .collect(Collectors.toList());
     }
    public List<Usuario> verCajeros(){
        return this.usuarios
                .stream()
                .filter(u -> u instanceof Cajero)
                .collect(Collectors.toList());
    }

    public boolean modificar(final Usuario usuario) {
        final AtomicBoolean modificado = new AtomicBoolean(false);
        this.usuario.forEach(u -> {
            if (u.getIdentificacion().equalsIgnoreCase(usuario.getIdentificacion())) {
                u.setApellido(usuario.getApellido());
                u.setNombre(usuario.getNombre());
                modificado.set(true);
            }
        });
        return modificado.get();
    }

    public boolean eliminar(final Usuario usuario) {
        final int elementos = this.usuario.size();
        this.usuario
                = this.usuarios
                .stream()
                .filter(u
                        -> !u.getIdentificacion()
                        .equalsIgnoreCase(
                                usuario.getIdentificacion()))
                .collect(Collectors.toList());
        return this.usuario.size() != elementos;
    }

}
