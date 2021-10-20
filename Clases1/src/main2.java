import javax.swing.JOptionPane;

public class main2 {
    public static void main (String []args){
       int n1 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NUMERO"));
       int n2 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NUMERO"));

       ParametrosYargumentos Pa = new ParametrosYargumentos();
       Pa.sumar(n1, n2);  //ESTOS SON LOS ARGUMENTOS ENTRE PARENTESIS 
       Pa.restar(n1, n2);
       Pa.multiplicacion(n1, n2);
       Pa.division(n1, n2);
       Pa.MostrarResultados();



    }
}
