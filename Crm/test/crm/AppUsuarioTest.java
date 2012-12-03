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
    
    //creacion de usuario
    @Test
    public void testRegistrarUsuario() throws Exception {
        String dni = "45263659";
        String nombre = "Juan";
        String apellidopaterno = "Perez";
        String apellidomaterno = "Loza";
        String usuario = "u201212";
        String correo = "u201212@gmail.com";
        String fechaingreso = "21/10/2011";
        String cargo = "Tecnico";
        String rol = "soporte";
        String contrasena = "12345678";
        String creadopor = "Carlos";
        String fechadecreacion = "21/10/2011";
        String actualizadopor = "";
        String fechadeactualizacion = "";
        
        boolean rpta = false;
        
        AppUsuario usu = new AppUsuario();
        
         rpta=usu.RegistrarUsuario(dni, nombre, apellidopaterno, apellidomaterno, usuario, correo, fechaingreso, cargo, rol,
                contrasena, creadopor, fechadecreacion, actualizadopor, fechadeactualizacion);
                
        Usuario nuevo = usu.BuscarUsuario(usuario);
        
        //crea el usuario
        
        
        System.out.println(nuevo.getUsuario());
        
        assertEquals(true, rpta);
    }
    
}
