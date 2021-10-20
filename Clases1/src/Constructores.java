public class Constructores {
   // ATRIBUTOS
   String nombre;
   int edad;
   
   //METODO CONSTRUCTOR
   public  Constructores (String nombre, int edad){
     nombre=this.nombre; //EL THIS ES PARA DIFERENCIAR EN EL CASO QUE LOS ATRIBUTOS Y PARAMETROS TENGAN EL MISMO NOMBRE
     edad =this.edad;     // QUE ESTE EL THIS HACE REFERENCIA AL ATRIBUTO 


   }
   public void mostrarDatos(){
       System.out.print("el nombre es: " + nombre);
       System.out.println("El nombre es. " + edad);
   }
}
 
// SOBRECARGA DE CONSTRUCTORES ES CUANDO HAY MAS DE UN CONSTRUCTOR
// SE DIFERENCIA EN CADA CONSTRUCTOR PUEDE SER QUE EL PRMERO TENGA 2 CONSTRUCTORES Y EN OTRO 1 CONSTRUCTOR
// O QUE SEA DE DIFERENTE TIPO
