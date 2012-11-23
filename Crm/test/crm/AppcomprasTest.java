/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crm;

import java.util.ArrayList;
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
public class AppcomprasTest {
    
    public AppcomprasTest() {
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
     * Test of getdoc method, of class Appcompras.
     */
    @Test
    public void testGetdoc() {
        System.out.println("getdoc");
        Appcompras instance = new Appcompras();
        ArrayList expResult = null;
        ArrayList result = instance.getdoc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getarticulo method, of class Appcompras.
     */
    @Test
    public void testGetarticulo() {
        System.out.println("getarticulo");
        Appcompras instance = new Appcompras();
        ArrayList expResult = null;
        ArrayList result = instance.getarticulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
}
