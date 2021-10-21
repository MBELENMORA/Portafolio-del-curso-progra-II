public class Rol extends Entidad implements Imprimir{

    
    public int getId (){return this.Id;}

    public String getNombre ( ){return this.Nombre;}

    public void setId ( int valor){this.Id = valor;}

    public void setNombre ( String valor){this.Nombre=valor;}

    @Override
    public String Imprimir() {
        return"Id" + Integer.toString(this.Id) + "Rol" + this.Nombre;
    }
}

