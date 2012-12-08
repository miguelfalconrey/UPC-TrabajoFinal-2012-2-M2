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
    
    AppProspecto pro = new AppProspecto();

    @Test
    public void testRegistrarProspecto() throws Exception {

        String[] nombres = {"David", "Carmen"};
        String[] apellidopaterno = {"Tapia", "Galvez"};
        String[] apellidomaterno = {"Estrada", "Marquez"};
        String[] dni = {"45269832", "10235896"};
        String[] correo = {"d_tapia00@hotmail.com", "carmencita25@gmail.com"};
        String[] telefono = {"1233858", "981153256"};
        String[] fechaContacto = {"21/12/2009", "01/01/2011"};
        boolean[] estado = {true, true};
        // boolena[] estado = {true, false};
        
        
        for (int i = 0; i < dni.length; i++) {
            pro.Registrar(nombres[i], apellidopaterno[i], apellidomaterno[i], correo[i],
                    dni[i], telefono[i], fechaContacto[i], estado[i]);
        }
        
        for (int i = 0; i < dni.length; i++) {
            Prospecto nuevo = pro.buscarProspecto(dni[i]);
            assertNotNull(nuevo);
        }

    }

    @Test
    public void testEliminarProspecto() throws Exception {
        testRegistrarProspecto(); //Llamando al primer test
        String dni = "45269832";
        pro.eliminarProspecto(dni);
        //pro.eliminarProspecto("u2012333d");                   //Generar error
        Prospecto nuevo = pro.buscarProspecto(dni);
        assertNull("El prospecto " + dni + " no existe.", nuevo);
    }

    
    @Test
    public void testEditarProspecto() throws Exception {
        testRegistrarProspecto(); //Llamando al primer test
        
        String nombres = "David";
        String apellidopaterno = "Tapia";
        String apellidomaterno = "Estrada";
        String dni = "45269832";
        String correo = "tapia2000@systemstec.com";
        String telefono = "981150893";
        String fechaContacto = "21/12/2009";
        boolean estado =  false;
        
        pro.editarProspecto(nombres, apellidopaterno, apellidomaterno, correo,
                          dni, telefono, fechaContacto, estado);
        
        //usu.eliminarProspecto("u2012333d");                      //Generar error
        Prospecto editar = pro.buscarProspecto(dni);
        assertEquals(correo,editar.getCorreo());
        assertEquals(telefono,editar.getTelefono());
        assertEquals(estado,editar.getEstado());
    }
    
    
    
    
    
    
}
