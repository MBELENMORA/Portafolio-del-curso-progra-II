import javax.swing.JOptionPane;

public class Operaciones{
int op= 0;
    public void Suma(int a, int b){
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE PRIMER NUMERO: "));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE SEGUNDO NUMERO"));
        op = a + b;
        JOptionPane.showMessageDialog(null, "LA SUMA ES: " + op);

    }
    public void Resta (int a, int b){
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE PRIMER NUMERO: "));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE SEGUNDO NUMERO"));
        op = a - b;
        JOptionPane.showMessageDialog(null, "LA RESTA ES: " + op);

    }
    public void Multiplicacion (int a, int b){
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE PRIMER NUMERO: "));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE SEGUNDO NUMERO"));
        op = a * b;
        JOptionPane.showMessageDialog(null, "LA MULTIPLICACION ES: " + op);
    }
    public void Division (int a, int b){
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE PRIMER NUMERO: "));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE SEGUNDO NUMERO"));
        op = a / b;
        JOptionPane.showMessageDialog(null, "LA DIVISION ES: " + op);
    }
}