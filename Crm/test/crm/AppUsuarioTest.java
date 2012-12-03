/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crm;

import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

/**
 *
 * @author gerald
 */
public class AppUsuarioTest {

    AppUsuario usu = new AppUsuario();
    //creacion de usuario

    @Test
    public void testRegistrarUsuario() throws Exception {
        String[] dni = {"45", "34"};
        String[] nombre = {"Juan", "Carlos"};
        String[] apellidopaterno = {"Perez", "Lopez"};
        String[] apellidomaterno = {"Loza", "Giraldo"};
        String[] usuario = {"u201212", "u2012333"};
        String[] correo = {"u201212@gmail.com", "u2012333@hotmail.com"};
        String[] fechaingreso = {"21/10/2011", "21/12/2012"};
        String[] cargo = {"Tecnico", "Administrador"};
        String[] rol = {"soporte", "Service"};
        String[] contrasena = {"12345678", "654321"};
        String[] creadopor = {"Carlos", "Adminweb"};
        String[] fechadecreacion = {"21/10/2011", "22/12/2012"};
        String[] actualizadopor = {"", ""};
        String[] fechadeactualizacion = {"", ""};

        boolean rpta = false;

        for (int i = 0; i < dni.length; i++) {

            rpta = usu.RegistrarUsuario(dni[i], nombre[i], apellidopaterno[i], apellidomaterno[i], usuario[i], correo[i], fechaingreso[i], cargo[i], rol[i],
                    contrasena[i], creadopor[i], fechadecreacion[i], actualizadopor[i], fechadeactualizacion[i]);
        }

        Usuario nuevo = usu.BuscarUsuario("u2012333");
        //crea el usuario        

        assertEquals(true, rpta);
    }

    @Test
    public void testEliminarUsuario() throws Exception {
        testRegistrarUsuario(); //Llamando al primer test

        String usuario = "u2012333";
        usu.eliminarusuario(usuario);
        //usu.eliminarusuario("u2012333d"); //Generar error
        Usuario nuevo = usu.BuscarUsuario(usuario);
        assertNull("El usuario " + usuario + " no existe.", nuevo);
    }
    
    @Test
    public void testModificarUsuario() throws Exception {
        testRegistrarUsuario(); //Llamando al primer test

        String dni = "34";
        String nombre = "Carlos";
        String apellidopaterno = "Lopez";
        String apellidomaterno = "Giraldo";
        String usuario = "u2012333";
        String correo = "u2012333@hotmail.com";
        String fechaingreso = "21/12/2012";
        String cargo = "Helpdesk";
        String rol =  "Super";
        String contrasena = "654321";
        String creadopor = "Adminweb";
        String fechadecreacion = "22/12/2012";
        String actualizadopor = "Miguel";
        String fechadeactualizacion = "24/12/2012";
        
        usu.editarusuario(dni, nombre, apellidopaterno, apellidomaterno, usuario,
                correo, fechaingreso, cargo, rol,
                    contrasena, creadopor, fechadecreacion, actualizadopor, fechadeactualizacion);
        //usu.eliminarusuario("u2012333d"); //Generar error
        Usuario editar = usu.BuscarUsuario(usuario);
        assertEquals(cargo,editar.getCargo());
        assertEquals(rol,editar.getRol());
        assertEquals(actualizadopor,editar.getActualizadopor());
    
    }

    @Test
    public void testValidarUsuarioContrasena() throws Exception {
    testRegistrarUsuario();
    
    String usuario="u2012333";
    String contrasena="654321";
    boolean rpta = false;
    
    rpta=usu.validarusuariocontrasena(usuario,contrasena);
    assertEquals(true, rpta);
            
    }
    
    
}
