public class Pulperia {

    private String ClienteCredito;
    private String VentasContado;
    private String VentasCredito;

    public Pulperia(String ClientesCredito, String VentasContado, String VentasCredito) {
        this.setClienteCredito(ClientesCredito);

    }

    public String getClienteCredito() {
        return ClienteCredito;
    }

    public void setClienteCredito(String clienteCredito) {
        this.ClienteCredito = clienteCredito;
    }

    public String getVentasContado() {
        return VentasContado;
    }

    public void setVentasContado(String ventasContado) {
        this.VentasContado = ventasContado;
    }

    public String getVentasCredito() {
        return VentasCredito;
    }

    public void setVentasCredito(String ventasCredito) {
        this.VentasCredito = ventasCredito;
    }

}
