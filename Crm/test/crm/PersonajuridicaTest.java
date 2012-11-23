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
public class PersonajuridicaTest {
    
    public PersonajuridicaTest() {
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
     * Test of getRazonsocial method, of class Personajuridica.
     */
    @Test
    public void testGetRazonsocial() {
        System.out.println("getRazonsocial");
        Personajuridica instance = null;
        String expResult = "";
        String result = instance.getRazonsocial();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRazonsocial method, of class Personajuridica.
     */
    @Test
    public void testSetRazonsocial() {
        System.out.println("setRazonsocial");
        String Razonsocial = "";
        Personajuridica instance = null;
        instance.setRazonsocial(Razonsocial);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRuc method, of class Personajuridica.
     */
    @Test
    public void testGetRuc() {
        System.out.println("getRuc");
        Personajuridica instance = null;
        String expResult = "";
        String result = instance.getRuc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRuc method, of class Personajuridica.
     */
    @Test
    public void testSetRuc() {
        System.out.println("setRuc");
        String Ruc = "";
        Personajuridica instance = null;
        instance.setRuc(Ruc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
