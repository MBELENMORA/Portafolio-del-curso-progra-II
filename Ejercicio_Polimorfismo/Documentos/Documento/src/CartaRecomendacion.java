public class CartaRecomendacion extends Curriculum{

    private String Persona;

    public CartaRecomendacion(String nombre, String carrera, String experiencia, String persona) {
        super(nombre, carrera, experiencia);
        setPersona(persona);
    }

    public String getPersona() {
        return Persona;
    }

    public void setPersona(String persona) {
        this.Persona = persona;
    }
    public String Datos(){
        return "NOMBRE: " + Nombre + "CARRERA: " + Carrera  +
        "EXPERIENCIA LABORAL: " + Experiencia + "PERSONA RECOMENDADA: " + Persona;
    }
    


  

}
