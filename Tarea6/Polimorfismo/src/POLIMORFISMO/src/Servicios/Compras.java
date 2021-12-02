package Servicios;

import Interfaces.Elegible;
import Menus.MenusCompra;
import Entidades.Cliente;

public class Compras implements Elegible {
    public void compra(Cliente cliente) {
        MenusCompra menu = new MenusCompra();

    }

    @Override
    public int ElegirOpcion() {
        return 0;
    }
}
