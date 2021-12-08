package Entidades;

/**
 *
 * @author María Belén
 */
public abstract class Persona {

    protected String nombre;
    protected String apellido;
    protected String identificacion;

    public void setNOmbre(final String valor) {
        this.nombre = valor;
    }

    public void setApellido(final String valor) {
        this.apellido = valor;
    }

    public void setIdentificacion(final String valor) {
        this.identificacion = valor;
    }
    public String getNombre(){return this.nombre;}
    public String getApellido(){return this.apellido;}
    public String getIndentificacion(){return this.identificacion;}
    
}
