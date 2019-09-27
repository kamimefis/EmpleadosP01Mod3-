package cl.duoc;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestMontoBono {

    public TestMontoBono() {
    }
    
    @Test
    public void testMontoBono(){
        System.out.println("MontoBono");
        String rut = "88888888";
        BussEmpleado instance = new BussEmpleado();
        assertTrue(instance.Buscar(rut).montoBono()== 500000);
        
    }
    
}
