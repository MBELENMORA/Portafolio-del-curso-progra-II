public class CartaRenucia extends Curriculum{

    private String Motivo;

    public CartaRenucia(String nombre, String carrera, String experiencia, String Motivo) {
        super(nombre, carrera, experiencia);
        this.setMotivo(Motivo);
    }

    public String getMotivo() {
        return Motivo;
    }

    public void setMotivo(String motivo) {
        this.Motivo = motivo;
    }
    public String Datos (){
        return "NOMBRE: " + Nombre + "CARRERA: " + Carrera  + "EXPERIENCIA LABORAL: "
         + Experiencia + "EL MOTIVO DE RENUNCIA: " + Motivo;
    }
    }

    

