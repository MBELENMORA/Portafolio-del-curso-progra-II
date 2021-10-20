import javax.swing.JOptionPane;

public class OperacionMetodos {
 //ATRIBUTOS
 int numero1;
 int numero2;
 int suma;
 int resta;
 int multiplicacion;
 int division;
 
 // METODO PARA PEDIRLE AL USUARIO LOS NUMEROS
 public void leernumeros(){
     numero1= Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NUMERO"));
     numero2= Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NUMERO"));
  }
 //METODO PARA SUMAR AMBOS NUMEROS
 public void sumar (){
     suma= numero1 + numero2;
 }
 public void restar (){
    resta= numero1 - numero2;
  }
 public void multiplicacion (){
    multiplicacion= numero1 * numero2;
  }
 public void division (){
    division= numero1 / numero2; 
}
  public void MostrarResultados(){
      System.out.println("LA SUMA ES: " + suma);
      System.out.println("LA RESTA ES: " + resta);
      System.out.println("LA MULTIPLICACION ES: " + multiplicacion);
      System.out.println("LA DIVISION ES: " + division);
     
  }
}

