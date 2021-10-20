public class ParametrosYargumentos {
    //ATRIBUTOS
 int numero1;
 int numero2;
 int suma;
 int resta;
 int multiplicacion;
 int division;
   //METODOS           //PARAMETROS
 public void sumar (int numero1, int numero2){
    suma = numero1 + numero2;
 }
public void restar (int numero1, int numero2){
   resta = numero1 - numero2;
 }
public void multiplicacion (int numeor1, int numero2){
   multiplicacion = numero1 * numero2;
 }
public void division (int numero1, int numeor2){
   division = numero1 / numero2;
 }
 public void MostrarResultados(){
    System.out.println("LA SUMA ES: " + suma);
    System.out.println("LA RESTA ES: " + resta);
    System.out.println("LA MULTIPLICACION ES: " + multiplicacion);
    System.out.println("LA DIVISION ES: " + division);
 }

}



