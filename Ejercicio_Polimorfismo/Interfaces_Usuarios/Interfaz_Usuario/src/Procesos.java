public abstract class Procesos {
    private String Nombre;

    public Procesos(String nombre) {
        setNombre(nombre);
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

}
