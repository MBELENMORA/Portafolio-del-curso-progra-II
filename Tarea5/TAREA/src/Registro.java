import javax.swing.JOptionPane;

public class Registro extends Pulperia {
    String Nombre;
    String Telefono;
    String Correo;
    int id = 0;
    String ver;
    String fecha;
    String pago;

    public Registro(String ClientesCredito, String VentasContado, String pago, String VentasCredito, String Nombre,
            String Telefono, String Correo, int id, String ver, String fecha) {
        super(ClientesCredito, VentasContado, VentasCredito);
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.id = id;
        this.Correo = Correo;
        this.ver = ver;
        this.fecha = fecha;
        this.pago = pago;
    }

    public void ClientesCredito() {
        Nombre = JOptionPane.showInputDialog(null, "NOMBRE: ");
        Telefono = JOptionPane.showInputDialog(null, "TELEFONO; ");
        Correo = JOptionPane.showInputDialog(null, "CORREO ELECTRONICO: ");
        id = Integer.parseInt(JOptionPane.showInputDialog(null, "ID: "));

        JOptionPane.showMessageDialog(null, "Nombre es: " + Nombre + " \nNumero de telefono: " + Telefono
                + "\n Correo electronico: " + Correo + "\n ID de cliente: " + id);

    }

    public void VentasContado() {
        Nombre = JOptionPane.showInputDialog(null, "NOMBRE: ");
        Telefono = JOptionPane.showInputDialog(null, "TELEFONO; ");
        Correo = JOptionPane.showInputDialog(null, "CORREO ELECTRONICO: ");
        id = Integer.parseInt(JOptionPane.showInputDialog(null, "ID: "));

        ver = JOptionPane.showInputDialog(null, "LAS VENTAS SON");
        fecha = JOptionPane.showInputDialog(null, "FECHA DE LA VENTA");
        pago = JOptionPane.showInputDialog(null, "FORMA DE PAGO");
        JOptionPane.showMessageDialog(null,
                "CANTIDAD DE VENTAS AL CONTADO: " + ver + "\nFECHA: " + fecha + "\nPAGO: " + pago);
    }

    public String VentasCredito() {
        Registro re = new Registro("","", "", "", "", "", "", 0, "", "");
        re.ClientesCredito();


        return VentasCredito();
    }

}
