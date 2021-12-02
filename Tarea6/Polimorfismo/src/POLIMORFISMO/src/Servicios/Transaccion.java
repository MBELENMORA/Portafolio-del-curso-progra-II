package Servicios;

import Interfaces.Elegible;
import Entidades.Persona;

public abstract class Transaccion implements Elegible {
    public class Compras implements Elegible {
        public void compra(Persona cliente) {

        }

        @Override
        public int ElegirOpcion() {
            return 0;
        }
    }

}
