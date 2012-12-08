/*
 * Test AppUsuario
 */
package crm;

import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

/**
 * @author Miguel
 */
public class AppUsuarioTest {

    AppUsuario usu = new AppUsuario(); //Creacion de usuario
    
    @Test

    public void testRegistrarUsuario() throws Exception {
//        String[] dni = {"", "34324567"}; // Codigo de validacion error al ingresar DNI vacio
        String[] dni = {"45543456", "34324567"}; 
        String[] nombre = {"Juan", "Carlos"};
        String[] apellidopaterno = {"Perez", "Lopez"};
        String[] apellidomaterno = {"Loza", "Giraldo"};
        String[] usuario = {"u201212", "u2012333"};
        String[] correo = {"u201212@gmail.com", "u2012333@hotmail.com"};
        String[] fechaingreso = {"21/10/2011", "21/12/2012"};
        String[] cargo = {"Tecnico", "Administrador"};
        String[] rol = {"Soporte", "Call Center"};
        String[] contrasena = {"12345678", "87654321"};
        String[] creadopor = {"Alfredo", "Enrique"};
        String[] fechadecreacion = {"21/10/2011", "22/12/2012"};
        String[] actualizadopor = {"", ""};
        String[] fechadeactualizacion = {"", ""};

        for (int i = 0; i < dni.length; i++) {
        usu.RegistrarUsuario(dni[i], nombre[i], apellidopaterno[i], 
               apellidomaterno[i], usuario[i], correo[i], fechaingreso[i], 
               cargo[i], rol[i],contrasena[i], creadopor[i], fechadecreacion[i],
               actualizadopor[i], fechadeactualizacion[i]);
        }
        for (int i = 0; i < dni.length; i++){
        Usuario nuevo = usu.BuscarUsuario(usuario[i]);
        assertNotNull(nuevo); //verifica que el objeto no sea nulo, en cuyo caso la prueba será fallida. 
        }
    }

    
    @Test
    public void testEliminarUsuario() throws Exception {
        testRegistrarUsuario(); //Llamando al primer test para asegurarnos que se tenga un usuario registrado
        String usuario = "u2012333"; 
        //Registro debe ser igual al usuario registrado que queremos eliminar
        usu.eliminarusuario(usuario);
//       usu.eliminarusuario("u2012333x");        //Linea para generar error "Eliminar Usuario"
       Usuario nuevo = usu.BuscarUsuario(usuario);
       assertNull("El usuario " + usuario + " no existe.", nuevo);
    }

    
    @Test
    public void testModificarUsuario() throws Exception {
        testRegistrarUsuario(); //Llama al primer test para asegurarnos 
                                 //que se tenga un usuario registrado
        String dni = "45543456";  
        String nombre = "Carlos";
        String apellidopaterno = "Palomares";
        String apellidomaterno = "Giraldo";
        String usuario = "u2012333";                //Clave busqueda principal
        String correo = "u2012xxxx@hotmail.com";
        String fechaingreso = "21/12/2012";
        String cargo = "Supervisor";
        String rol =  "Super";
        String contrasena = "11654321";
        String creadopor = "Admin";
        String fechadecreacion = "22/12/2012";
        String actualizadopor = "Miguel";
        String fechadeactualizacion = "24/12/2012";
        
        usu.editarusuario(dni, nombre, apellidopaterno, apellidomaterno, usuario,
                         correo, fechaingreso, cargo, rol, contrasena, creadopor,
                         fechadecreacion, actualizadopor, fechadeactualizacion);
        
         Usuario editar = usu.BuscarUsuario(usuario); //Verificacion de la edicion

 //      assertEquals("Administrador",editar.getCargo()); //Generacion error, 
          //Se verifica que el objeto generado y el esperado sean iguales

        assertEquals(cargo,editar.getCargo()); //Comparar que se haya modificado
        assertEquals(rol,editar.getRol());
        assertEquals(actualizadopor,editar.getActualizadopor());
        
    }

    @Test
    public void testValidarUsuarioContrasena() throws Exception {
    testRegistrarUsuario();
    
    String usuario="u2012333";
//    String usuario="u2012333xxx";                            //Generar error
    String contrasena="87654321";
    boolean rpta = false;
    
    rpta=usu.validarusuariocontrasena(usuario,contrasena);
    assertEquals(true, rpta);
    }
 
}