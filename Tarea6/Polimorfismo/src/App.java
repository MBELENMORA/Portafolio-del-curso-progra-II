import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String Nombre;
        Nombre = JOptionPane.showInputDialog(null,
                "SELECCIONE UNA OPCION:" + "\n 1) CLIENTE\n 2) CAJERO \n3) ADMINISTRADOR \n4)SALIR");
        do {
            switch (Nombre.toLowerCase()) {
            case "1": {
                Rol roll = new Rol();
                roll.Variable1();
            }
            case "2": {
                Rol roll = new Rol();
                roll.Variable2();
            }
            case "3": {
                Rol roll = new Rol();
                roll.Variable3();
            }
            }
        } while (!Nombre.equals("4"));
    }
}
