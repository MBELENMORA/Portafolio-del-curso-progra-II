import javax.swing.JOptionPane;

public class Rol {
    public enum Roles {
        Cliente, Cajero, Administrador;
    }

    public void Variable1() {
        JOptionPane.showMessageDialog(null, " ERES: Cliente");

    }

    public void Variable2() {
        JOptionPane.showMessageDialog(null, "ERES: Cajero");
    }

    public void Variable3() {
        JOptionPane.showMessageDialog(null, "ERES: Administrador");
    }

}