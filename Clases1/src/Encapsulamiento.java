public class Encapsulamiento {
    //SET ES ESTABLECER 
    private int edad;
    private String nombre;
                       //El atributo con el que se va a inicializar 
    public void SetEdad(int edad){
          this.edad = edad;
    }
    //GET ES MOSTRAR LA EDAD  
    public int GetEdad(){
        return edad;
    }
    public void Setnombre (String nombre){
        this.nombre = nombre;

    }
    public String Getnombre(){
        return nombre;
        
    }
}
