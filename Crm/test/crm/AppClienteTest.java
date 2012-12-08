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
    public void testRegistrarCliente() throws Exception {
//        String[] nombres = {"", "Carlos"};  //Generar error al pretender ingresar nulo
        String[] nombres = {"Juan", "Carlos"};
        String[] apellidopaterno = {"Perez", "Lopez"};
        String[] apellidomaterno = {"Loza", "Giraldo"};
        String[] dni = {"12345678", "87654321"};
        String[] correo = {"u201212@gmail.com", "u2012333@hotmail.com"};
        String[] telefono = {"987566321", "988524569"};
        String[] fechaContacto = {"21/05/2010", "30/01/2011"};
        boolean[] estado = {true, true};
        // boolean[] estado = {true, false};
        
        
        for (int i = 0; i < dni.length; i++) {
            cli.Registrar(nombres[i], apellidopaterno[i], apellidomaterno[i], correo[i],
                    dni[i], telefono[i], fechaContacto[i], estado[i]);
        }
        
        for (int i = 0; i < dni.length; i++) {
            Cliente nuevo = cli.buscar(dni[i]);
            assertNotNull(nuevo);
        }

    }

    @Test
    public void testEliminarCliente() throws Exception {
        testRegistrarCliente(); //Llamando al primer test
        String dni = "12345678";
       // cli.eliminarCliente(dni);
        cli.eliminarCliente("u2012333d");                   //Generar error
        Cliente nuevo = cli.buscar(dni);
        assertNull("El usuario " + dni + " no existe.", nuevo);
    }

    
    @Test
    public void testEditarCliente() throws Exception {
        testRegistrarCliente(); //Llamando al primer test
        
        String nombres = "Juan";
        String apellidopaterno = "Perez";
        String apellidomaterno = "Loza";
        String dni = "12345678";
        String correo = "u2012333@hotmail.com";
        String telefono = "2255336";
        String fechaContacto = "21/05/2010";
        boolean estado =  false;
        
        cli.editarCliente(nombres, apellidopaterno, apellidomaterno, correo,
                       dni, telefono, fechaContacto, estado);
        
        Cliente editar = cli.buscar(dni); //Verificacion de la edicion

   //           assertEquals("u201212@gmail.com",editar.getCorreo()); //Generacion error, 
         // Se verifica que el objeto generado y el esperado sean iguales
      
        
        assertEquals(correo,editar.getCorreo());
        assertEquals(telefono,editar.getTelefono());
        assertEquals(estado,editar.getEstado());
    }
    
    
}
