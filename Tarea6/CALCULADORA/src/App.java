import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String Res;
        do {
            Res = JOptionPane.showInputDialog(null, "INGRESE LA OPCION" +
                    "\n1- SUMA \n2- RESTA \n3- MULTIPLICAION \n4- DIVISION \n5- SALIR");
            switch (Res) {
                case "1": {
                    Operaciones operaciones = new Operaciones();
                    operaciones.Suma(0, 0);
                    break;
                }
                case "2": {
                    Operaciones operaciones = new Operaciones();
                    operaciones.Resta(0, 0);
                    break;
                }
                case "3": {
                    Operaciones operaciones = new Operaciones();
                    operaciones.Multiplicacion(0, 0);
                    break;
                }
                case "4": {
                    Operaciones opreaciones = new Operaciones();
                    opreaciones.Division(0, 0);
                    break;
                }
            }

        } while (!Res.equals("5"));
    }
}
