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
 * @author Miguel
 */
public class PersonanaturalTest {
    
    public PersonanaturalTest() {
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
     * Test of getNombre method, of class Personanatural.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Personanatural instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Personanatural.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String Nombre = "";
        Personanatural instance = null;
        instance.setNombre(Nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDni method, of class Personanatural.
     */
    @Test
    public void testGetDni() {
        System.out.println("getDni");
        Personanatural instance = null;
        String expResult = "";
        String result = instance.getDni();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDni method, of class Personanatural.
     */
    @Test
    public void testSetDni() {
        System.out.println("setDni");
        String Dni = "";
        Personanatural instance = null;
        instance.setDni(Dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
