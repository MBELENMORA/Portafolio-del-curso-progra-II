public class Producto {
   protected String Cantidad;
   protected String Precio;
   protected String Porcion;

    public Producto(String cantidad, String precio, String porcion) {
        this.Cantidad = cantidad;
        this.Precio = precio;
        this.Porcion = porcion;
    }
    public String getCantidad(){
        return Cantidad;
    }
    public String getPrecio(){
        return Precio;
    }
    public String getPorcion(){
        return Porcion;
    }
    public String Mostrar(){
        return "CANTIDAD: " + Cantidad + " PRECIO: " + Precio + " PORCION: " + Porcion;
    }

}
