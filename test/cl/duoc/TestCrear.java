package cl.duoc;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestCrear {

    public TestCrear() {
    }

    @Test
    public void testCrear() {
        System.out.println("Crear");
        Empleado empleado= new Empleado("13", "Camila", 31, 3);
        BussEmpleado instance= new BussEmpleado();
        boolean esperado= true;
        boolean obtenido= instance.Crear(empleado);
        assertEquals(esperado, obtenido);

    }

}
