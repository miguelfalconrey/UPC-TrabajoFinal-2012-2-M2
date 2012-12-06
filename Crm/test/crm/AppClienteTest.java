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
    
    AppCliente cli = new AppCliente();
    
    @Test
    public void testRegistrar() throws Exception {
        
        String[] nombres = {"Juan", "Carlos"};
        String[] apellidopaterno = {"Perez", "Lopez"};
        String[] apellidomaterno = {"Loza", "Giraldo"};
        String[] dni = {"12345678", "87654321"};
        String[] correo = {"u201212@gmail.com", "u2012333@hotmail.com"};
        String[] telefono = {"987566321", "8524569"};
        String[] fechaContacto = {"21/05/2010", "30/01/2011"};
        boolean[] estado = {true,false};
        

        boolean rpta = false;

        for (int i = 0; i < dni.length; i++) {
        rpta = cli.Registrar(nombres[i], apellidopaterno[i], apellidomaterno[i], dni[i],
                correo[i], telefono[i], fechaContacto[i], estado[i]);
        }
        Cliente nuevo = cli.buscar("12345678");       
        assertEquals(true, rpta);
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
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class AppCliente.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        String dni = "";
        AppCliente instance = new AppCliente();
        Cliente expResult = null;
        Cliente result = instance.buscar(dni);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
