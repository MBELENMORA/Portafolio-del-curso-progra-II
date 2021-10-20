public class Constantes {
            //FINAL ES UNA CONSTANTE NO SE PODRA CAMBIAR
    private final String nombre;
    private int edad; 

  public Constantes (String nombre, int edad){
      this.nombre = nombre;
      this.edad = edad;

  }
   public void mostrarDatos(){
       System.out.println("El nombre es: " + nombre);
       System.out.println("La edad es: " + edad);
   }
   public int getEdad(){
       return edad;
   }
   public void setEdad(){
       this.edad = edad;
   }

    public class Constantes1 {

    public void main(String [] args ){

        Constantes persona1 = new Constantes("ANA ", 19);
       

        persona1.mostrarDatos();
    }

    }
     
    
}
