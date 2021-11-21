import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String in;

        do {
            in = JOptionPane.showInputDialog(null, "SELECCIONE UNA OPCION:  \n 1- REGISTRO DE CLIENTE DE CREDITO "
                    + " \n 2- REGISTRO DE VENTAS DE CONTADO  \n 3- VENTAS DE CREDITO \n4- SALIR");
            switch (in.toLowerCase()) {
            case "1": {
                Registro registro = new Registro("", "", "", "", "", "", "", 0, "", "");
                registro.ClientesCredito();
            }
            case "2": {
                Registro registro = new Registro("", "", "", "", "", "", "", 0, "", "");
                registro.VentasContado();

            }
            case "3": {
                Registro registro = new Registro("", "", "", "", "", "", "", 0, "", "");
                registro.VentasCredito();
            }
            }
        } while (!in.equalsIgnoreCase("4"));
    }
}
