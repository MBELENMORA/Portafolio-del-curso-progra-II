public class Usuario extends Entidad implements Imprimir{

    public String apellido;
    public String correo;
    public String Telefono;
    public Rol rolDeUsuario;
    public Usuario  ( int Id){this.Id=Id;}
    public int getId ( ){return this.Id;}
    @Override
    public String Imprimir() {
        // TODO Auto-generated method stub
        return "Nombre de Usuario " + this.Nombre + "" + this.apellido;;
    }
}
