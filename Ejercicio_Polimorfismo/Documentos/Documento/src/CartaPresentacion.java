
public class CartaPresentacion extends Curriculum  {

    private int edad;
    private String Tiempo;

    public CartaPresentacion(String Nombre, String Carrera, String Experiencia, int edad, String Tiempo){
        super(Nombre, Carrera, Experiencia);
        this.setEdad(edad);
        this.setTiempo(Tiempo);


    }
    public String getTiempo() {
        return Tiempo;
    }
    public void setTiempo(String tiempo) {
        this.Tiempo = tiempo;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String Datos(){
        return "NOMBRE: " + Nombre + "CARRERA: " + Carrera  +
         "EXPERIENCIA LABORAL: " + Experiencia + "EDAD: " + "CUANTO TIEMPO LLEVA DE CARRERA: " + Tiempo;

    }




    
}
