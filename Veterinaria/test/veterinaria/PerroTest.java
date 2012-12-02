
package veterinaria;

import junit.framework.Assert;
import org.junit.Test;


public class PerroTest {

    @Test //Para indicar que es un test
    
    public void PerroDebeTenerUnNombre(){//el nombre del metodo, debe ser descriptivo
    
        Perro perro = new Perro("Fifi");
        Assert.assertEquals("Fifi", perro.getNombre());
        
        
                
    }   
    
     @Test 
     public void PerropuedeTenerUnNombreYRaza(){
        
        Perro perro = new Perro ("Rambo", "Poodle");
        Assert.assertEquals("Poodle", perro.getRaza());
    }     
    
    
    
}
