public class Curriculum {
    
    protected String Nombre;
    protected String Carrera;
    protected String Experiencia;

    public Curriculum(String nombre, String carrera, String experiencia) {
        Nombre = nombre;
        Carrera = carrera;
        Experiencia = experiencia;
    }
   
    public String Datos(){
        return "NOMBRE: " + Nombre + "CARRERA: " + Carrera  + "EXPERIENCIA LABORAL: " + Experiencia;
    
    }
    public String getNombre(){
        return Nombre;
    }
    public String getCarrera(){
        return Carrera;
    }
public String getExperiencia(){
    return Experiencia;
}

}
