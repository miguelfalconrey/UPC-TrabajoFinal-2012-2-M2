/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crm;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gerald
 */
public class AppProspectoTest {
    
    public AppProspectoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Registrar method, of class AppProspecto.
     */
    @Test
    public void testRegistrar() throws Exception {
        System.out.println("Registrar");
        String EstadoProspecto = "";
        String Nombres = "";
        String ApellidoPaterno = "";
        String ApellidoMaterno = "";
        String correo = "";
        String dni = "";
        String telefono = "";
        String fechaContacto = "";
        AppProspecto instance = new AppProspecto();
        instance.Registrar(EstadoProspecto, Nombres, ApellidoPaterno, ApellidoMaterno, correo, dni, telefono, fechaContacto);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    
    
    
    /**
     * Test of getCantidadProspectos method, of class AppProspecto.
     */
    @Test
    public void testGetCantidadProspectos() {
        System.out.println("getCantidadProspectos");
        AppProspecto instance = new AppProspecto();
        int expResult = 0;
        int result = instance.getCantidadProspectos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class AppProspecto.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        String dni = "";
        AppProspecto instance = new AppProspecto();
        Ent_Prospecto expResult = null;
        Ent_Prospecto result = instance.buscar(dni);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
