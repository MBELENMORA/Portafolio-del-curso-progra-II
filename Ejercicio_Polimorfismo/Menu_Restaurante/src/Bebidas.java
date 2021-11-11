public class Bebidas extends Producto{

    private String Tipo;

    public Bebidas(String cantidad, String precio, String porcion,String Tipo) {
        super(cantidad, precio, porcion);
        this.Tipo = Tipo;
    }

    public String getTipo() {
        return Tipo;
    }

    @Override
    public String Mostrar(){
        return "CANTIDAD: " + Cantidad + " PRECIO: " + Precio + " PORCION: " + 
        Porcion + " TIPO DE BEBIDA " + Tipo;

    }

    
    
}
