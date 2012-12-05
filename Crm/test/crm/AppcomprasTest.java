/*
 * Test AppCompras
 */
package crm;

import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

/**
 * @author gerald
 */
public class AppcomprasTest {

    Appcompras com = new Appcompras();
    //creacion de usuario

    @Test
    public void testRegistrarCompra() throws Exception {
        String[] Tipodoc = {"FV", "BV"};
        String[] Numdoc = {"001-234", "002-567"};
        String[] Moneda = {"Soles", "Dolares"};
        String[] Fechaemision = {"12/11/2012", "22/10/2012"};
        String[] Formapago = {"Contado", "Credito"};
        String[] Detalle = {"Notebook", "Tablet"};

        boolean rpta = false;

        for (int i = 0; i < Tipodoc.length; i++) {
        rpta = com.RegistrarCompra(Tipodoc[i], Numdoc[i], Moneda[i], 
               Fechaemision[i], Formapago[i], Detalle[i]);
        }
        Compra nuevo = com.BuscarCompra("001-234");       
        assertEquals(true, rpta);
    }

    
    @Test
    public void testEliminarCompra() throws Exception {
        testRegistrarCompra(); //Llamando al primer test
        String Numdoc = "001-234";
        com.eliminarcompra(Numdoc);
//        com.eliminarcompra("001-234x");                   //Generar error
        Compra nuevo = com.BuscarCompra(Numdoc);
        assertNull("La compra " + Numdoc + " no existe.", nuevo);
    }

    
    @Test
    public void testModificarCompra() throws Exception {
        testRegistrarCompra(); //Llamando al primer test
        String Tipodoc = "BV";
        String Numdoc = "777-888";
        String Moneda = "Euros";
        String Fechaemision = "03/12/2012";
        String Formapago = "Factura 30d";
        String Detalle = "Servidor";
        
        usu.editarcompra(Tipodoc, Numdoc, Moneda, Fechaemision, Formapago, Detalle);
        
//        //usu.eliminarusuario("u2012333d");                      //Generar error
        Compra editar = usu.BuscarCompra(Tipodoc);
        assertEquals(NumDoc,editar.getNumdoc());
        assertEquals(Moneda,editar.getMoneda());
        assertEquals(estad0,editar.getActualizadopor());
    }
//
//    @Test
//    public void testValidarUsuarioContrasena() throws Exception {
//    testRegistrarUsuario();
//    
//    String usuario="u2012333";
//    //String usuario="u2012333xxx";                            //Generar error
//    String contrasena="654321";
//    boolean rpta = false;
//    
//    rpta=usu.validarusuariocontrasena(usuario,contrasena);
//    assertEquals(true, rpta);
//    }
 
}