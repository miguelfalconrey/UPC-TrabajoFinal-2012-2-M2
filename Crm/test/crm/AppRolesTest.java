package crm;

import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

public class AppRolesTest {

    AppRoles ar = new AppRoles();

    @Test
    public void testRegistrarRoles() throws Exception {
        String[] nombre = {"Administrador", "Supervisor"};
        String[] descripcion = {"Control Total", "Lectura"};
        String[] creadopor = {"Miguel", "Gerald"};
        String[] creadoel = {"01/12/2012", "01/12/2012"};
        String[] actualizadopor = {"", ""};
        String[] actualizadoel = {"", ""};

        boolean rpta = false;

        for (int i = 0; i < nombre.length; i++) {
            ar.RegistrarRoles(nombre[i], descripcion[i], creadopor[i], creadoel[i], actualizadopor[i], actualizadoel[i]);
        }


        for (int i = 0; i < nombre.length; i++) {
            Roles rol = ar.buscar(nombre[i]);
            assertNotNull(rol);
        }

    }

    
    // Test Clase Permisos //
    
    @Test
    public void testRegistrarPermisos() throws Exception {
        testRegistrarPermisos();
        String[] nombre = {"Administrador", "Supervisor"};
        String[] modulo = {"Ventas", "Compras"};
        boolean[] adicionar = {true, false};
        boolean[] editar = {true, true};
        boolean[] eliminar = {true, true};

        boolean rpta = false;

        for (int i = 0; i < nombre.length; i++) {
            ar.RegistrarPermisos(nombre[i], modulo[i], adicionar[i], editar[i], eliminar[i]);
        }


        for (int i = 0; i < nombre.length; i++) {
            Permisos permiso = ar.buscarPermisos(nombre[i]);
            assertNotNull(permiso);
        }
    }

    @Test
    public void testEliminarPermiso() throws Exception {
        testRegistrarPermisos(); //Llamando al primer test
        String nombre = "Administrador";
        pe.eliminarpermiso(nombre);
//        //ar.eliminarpermiso("u2012333d");                   //Generar error
        Permisos nuevo = pe.BuscarPermisos(nombre);
        assertNull("El permiso " + nombre + " no existe.", nuevo);
    }


    @Test
    public void testModificarPermiso() throws Exception {
        
        String[] nombre = {"Jefe"};
        String[] modulo = {"Demo"};
        boolean[] adicionar = {true};
        boolean[] editar = {true};
        boolean[] eliminar = {true};
        
        
        ar.editarpermiso(nombre, modulo, adicionar, editar, eliminar);
        
        //usu.eliminarpermiso("u2012333d");                      //Generar error
        Permisos editar = ar.buscarPermisos(nombre);
        assertEquals(modulo,editar.getModulo());
 //       assertEquals(adicionar.getRol());
//        assertEquals(editar,editar.get());
    }
    
    

}
