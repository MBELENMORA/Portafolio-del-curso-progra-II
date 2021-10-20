public class App {
    //ATRIBUTOS SON CARACTERISTICAS DEL OBJETO
    String color;
    String marca;
    int Km;
    
    //METODOS SON ACCIONES 
  public static void main (String [] args){
   App App1 = new App();

   App1.color = "Blanco";
   App1.marca= "Audi";
   App1.Km= 0;
   
   System.out.println("El color deñ coche es "+ App1.color);
   //Se puede poner otros atributos y metodos en una misma clase

   App App2 = new App();
   App2.color = "Rojo";
   App2.Km = 100;
   App2.marca= "Ferrari";
   System.out.println("La marca del coche es " + App2.marca);
  }
    

}
