package cl.duoc;

import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class TestModificar {

    public TestModificar() {
    }
    
    @Test
    public void testModificar() {
        System.out.println("Modificar");
        //Empleado empleado= new Empleado("99999999", "Soraya", 52, 9);
        BussEmpleado instance= new BussEmpleado();  
        //instance.Crear(empleado);
        boolean esperado= true;
        Empleado empleado= new Empleado("99999999", "Carlos", 33, 9);
        boolean obtenido= instance.Modificar(empleado);
        Assert.assertEquals(esperado, obtenido); 
        
        
    }
    
}
