package cl.duoc;

import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class TestEliminar {

    public TestEliminar() {
    }
    
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        String rut= "13";
        BussEmpleado instance= new BussEmpleado();  
        boolean esperado= true;
        boolean obtenido= instance.Eliminar(rut);
        Assert.assertEquals(esperado, obtenido);
        
        
    }
}
