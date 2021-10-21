public class Armadura extends Personaje{
    private Material material;
    public String Color;

    public Armadura(short PuntosMagia, short PuntosVida, short PuntosFuerza, short PuntosAgilidad) {
        super(PuntosMagia, PuntosVida, PuntosFuerza, PuntosAgilidad);
        //TODO Auto-generated constructor stub
    }
   public Material getMaterial(){
       return this.material;
   }

    
    
  
}
