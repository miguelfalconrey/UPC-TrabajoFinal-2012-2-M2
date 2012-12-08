package crm;

import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

public class AppRolesTest {

    AppRoles ar = new AppRoles();   //Llamado aplicacion central//

    @Test
    public void testRegistrarRoles() throws Exception {
//        String[] nombre = {"", "Supervisor"};   //Generar error al querer registrar en blanco
        String[] nombre = {"Administrador", "Supervisor"};
        String[] descripcion = {"Control Total", "Lectura"};
        String[] creadopor = {"Miguel", "Gerald"};
        String[] creadoel = {"01/12/2012", "01/12/2012"};
        String[] actualizadopor = {"", ""};
        String[] actualizadoel = {"", ""};

        boolean rpta = false;

        for (int i = 0; i < nombre.length; i++) {
            ar.RegistrarRoles(nombre[i], descripcion[i], creadopor[i],
                creadoel[i], actualizadopor[i], actualizadoel[i]);
        }
        for (int i = 0; i < nombre.length; i++) {
            Roles nuevo = ar.buscar(nombre[i]);
            assertNotNull(nuevo);
        }
    }

    // Test Clase Permisos //
    @Test
    public void testRegistrarPermisos() throws Exception {  
        testRegistrarRoles();
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
//            Permisos permiso = ar.buscarPermisos("xVentas");  // Generar error
            Permisos permiso = ar.buscarPermisos(modulo[i]);
            assertNotNull(permiso);
        }
    }

    @Test
    public void testEliminarPermisos() throws Exception {
        testRegistrarPermisos(); //Llamando al primer test
        String modulo = "Ventas";
        ar.eliminarpermiso("xVentas"); //Generar error
//        ar.eliminarpermiso(modulo);
        Permisos nuevo = ar.buscarPermisos(modulo);
        assertNull("El aplicativo " + modulo + " no ha sido eliminado.", nuevo);
    }

    @Test
    public void testModificarPermisos() throws Exception {
        testRegistrarPermisos(); //Llamando al primer test
        String nombre = "Jefe";
        String modulo = "Compras";
        boolean adicionar = true;
        boolean editar = true;
        boolean eliminar = true;

        ar.editarpermiso(nombre, modulo, adicionar, editar, eliminar);
        Permisos editarpermisos = ar.buscarPermisos(modulo);
      
// assertEquals("No se puede modificar el nombre",nombre,editarpermisos.getModulo()); //Generar error
              
        assertEquals(nombre,editarpermisos.getNombre());
        assertEquals(modulo,editarpermisos.getModulo());
        assertEquals(adicionar,editarpermisos.getAdicionar());
        assertEquals(editar,editarpermisos.getEditar());
        assertEquals(eliminar,editarpermisos.getEliminar());
    }
}
