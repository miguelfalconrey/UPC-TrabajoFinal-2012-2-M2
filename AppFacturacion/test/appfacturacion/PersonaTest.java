/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appfacturacion;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author pcsiecon
 */
public class PersonaTest {
    
    public PersonaTest() {
    }
    
    @Test
    public void personaDebeCrearseConCodigoDniNombreApellidosDireccion(){        
        // Arrange
        String codigo = "C001";
        String dni = "23272090";
        String nombre = "Estanislao";
        String apellidos = "Contreras Chávez";
        String direccion = "Av. Alameda Sur 1320";        
        // Act
        Persona persona = new Persona(codigo, dni, nombre, apellidos, direccion);                
        // Assert
        assertNotNull(persona);
        assertEquals(codigo, persona.getCodigo());
        assertEquals(dni, persona.getDni());
        assertEquals(nombre, persona.getNombre());
        assertEquals(apellidos, persona.getApellidos());
        assertEquals(direccion, persona.getDireccion());        
    }


}
