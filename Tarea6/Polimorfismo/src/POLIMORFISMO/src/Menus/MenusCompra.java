package Menus;

public class MenusCompra extends Menu{
    @Override
    public void mostrarMenu(){
        super.mostrarMenu();
        System.out.println("1 PARA VER LOS ELECTRONICOS.  2 PARA VERLOS ACCERORIOS." 
          + "3 PARA VER LAS CAMISETAS.   4 PARA VOLVER");
    }
}
