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
public class Ent_ProspectoTest {
    
    public Ent_ProspectoTest() {
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
     * Test of getEstadoProspecto method, of class Ent_Prospecto.
     */
    @Test
    public void testGetEstadoProspecto() {
        System.out.println("getEstadoProspecto");
        Ent_Prospecto instance = null;
        String expResult = "";
        String result = instance.getEstadoProspecto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEstadoProspecto method, of class Ent_Prospecto.
     */
    @Test
    public void testSetEstadoProspecto() {
        System.out.println("setEstadoProspecto");
        String EstadoProspecto = "";
        Ent_Prospecto instance = null;
        instance.setEstadoProspecto(EstadoProspecto);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
