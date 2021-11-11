public class PlatoFuerte extends Producto {

    private String Vegetariano;
    private String Carnes;

    public PlatoFuerte(String cantidad, String precio, String porcion, String vegetariano, String carnes) {
        super(cantidad, precio, porcion);
        Vegetariano = vegetariano;
        Carnes = carnes;
    }

    public String getVegetariano(){
        return Vegetariano;
    }
    public String getCarnes(){
        return Carnes;
    }
    public String Mostrar(){
        return "CANTIDAD: " + Cantidad + " PRECIO: " + Precio + " PORCION: " + 
        Porcion + "VEGETARIANO: " + Vegetariano + "CARNE: " + Carnes;
    }

    
    
}
