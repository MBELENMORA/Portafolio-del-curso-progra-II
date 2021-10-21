package test.Servicios;

import static org.junt.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;
import Entidades.Libro;
import Servicios.Libreria;
    
public class LibreriaTest {
    @Test
    public void testPrestarLibroQueNoSeHaPrestado(){
        libro milibro = new Libro("MOBY DICK", "HNERMAN MELVILLE");
        Libreria miLibreria = new Libreria();
        try {
            miLibreria.prestar(miLibro);
            assertTrue(true);
        }catch(Exception ex){
            fail();
        }
    }
    @Test
    public void testPrestarLibroPrestado(){
        Libro miLibro = new Libro ("MOBY DICK","HNERMAN MELVILLE");
        miLibro.setPrestado(true);
        Libreria miLibreria = new Libreria();
        try{
            miLibro.prestar(miLibro);
            fail();
        }catch(Exception ex){
            assertTrue(true);
        }
    }
}
