/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appfacturacion;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author pcsiecon
 */
public class ClienteTest {
    
    public ClienteTest() {
    }
    
    @Test
    public void personaEsunTipoDeCliente(){
        // Arrange
        String codigo = "C001";
        String dni = "23272090";
        String nombre = "Estanislao";
        String apellidos = "Contreras Chávez";
        String direccion = "Av. Alameda Sur 1320";        
        
        // Act
        Cliente cliente = new Persona(codigo, dni, nombre, apellidos, direccion);
        
        // Assert
        assertNotNull(cliente);
        assertEquals(codigo, cliente.getCodigo());
        // Para que el objeto generico cliente reconozca
        // los metodos especificos de Persona, tenemos que hacer
        // type casting
        //  ((Clase) objeto)
        assertEquals(dni, ((Persona)cliente).getDni());
        assertEquals(nombre, ((Persona)cliente).getNombre());
        assertEquals(apellidos, ((Persona)cliente).getApellidos());
        assertEquals(direccion, cliente.getDireccion());        
        
    }
    
    @Test
    public void empresaEsUnTipoDeCliente(){
       
        // Arrange
        String codigo = "CL002";
        String ruc = "129401228";
        String razonSocial = "Extreme IT Solutions SAC";
        String direccion = "Av. Primavera 2550";
        
        // Act
        Cliente cliente = new Empresa(codigo, ruc, razonSocial, direccion);
        
        // Assert
        assertNotNull(cliente);
        assertEquals(codigo, cliente.getCodigo());
        assertEquals(ruc, ((Empresa)cliente).getRuc());
        assertEquals(razonSocial, ((Empresa)cliente).getRazonSocial());
        assertEquals(direccion, cliente.getDireccion());                
    }


}
