public class Ensalada extends Producto{

    private String Sencilla;


    public Ensalada(String cantidad, String precio, String porcion, String Sencilla) {
        super(cantidad, precio, porcion);
        this.Sencilla = Sencilla;
    }

    @Override
    public String Mostrar(){
        return "CANTIDAD: " + Cantidad + " PRECIO: " + Precio +
         " PORCION: " + Porcion + " TIPO DE ENSALADA: " + Sencilla;
    }
    
}
