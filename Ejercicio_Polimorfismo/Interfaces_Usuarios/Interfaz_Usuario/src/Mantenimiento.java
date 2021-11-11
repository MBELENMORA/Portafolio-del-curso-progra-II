public abstract class Mantenimiento {

    private String Usuario;

    public Mantenimiento(String usuario) {
        setUsuario(usuario);
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        this.Usuario = usuario;
    }
}
