
package Entidades;
import enums.Rol;
/**
 *
 * @author María Belén
 */
public class Cajero extends Usuario{
    public Cajero(){
        super(Rol.CAJERO);
    }
    public Cajero(String id, String nombre, String apellido){
        super(id, nombre, apellido);
    }
    
}
 