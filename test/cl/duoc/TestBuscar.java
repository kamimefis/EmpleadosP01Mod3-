package cl.duoc;

import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class TestBuscar {

    public TestBuscar() {
    }

    @Test
    public void testBuscar() {
        System.out.println("Buscar");
        String rut = "88888888";
        BussEmpleado instance = new BussEmpleado();
        String obtenido= instance.Buscar(rut).getRut();
        assertEquals(rut, obtenido);
    }
}
