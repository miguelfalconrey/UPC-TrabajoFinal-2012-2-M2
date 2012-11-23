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
public class AppClienteTest {
    
    public AppClienteTest() {
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
     * Test of Registrar method, of class AppCliente.
     */
    @Test
    public void testRegistrar() throws Exception {
        System.out.println("Registrar");
        String Nombres = "";
        String ApellidoPaterno = "";
        String ApellidoMaterno = "";
        String correo = "";
        String dni = "";
        String telefono = "";
        String fechaContacto = "";
        AppCliente instance = new AppCliente();
        instance.Registrar(Nombres, ApellidoPaterno, ApellidoMaterno, correo, dni, telefono, fechaContacto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCantidadClientes method, of class AppCliente.
     */
    @Test
    public void testGetCantidadClientes() {
        System.out.println("getCantidadClientes");
        AppCliente instance = new AppCliente();
        int expResult = 0;
        int result = instance.getCantidadClientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class AppCliente.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        String dni = "";
        AppCliente instance = new AppCliente();
        Ent_Cliente expResult = null;
        Ent_Cliente result = instance.buscar(dni);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
