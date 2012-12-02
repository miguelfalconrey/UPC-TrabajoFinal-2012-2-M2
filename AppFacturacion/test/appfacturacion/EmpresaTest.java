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
public class EmpresaTest {
    
    public EmpresaTest() {
    }
    
    @Test
    public void empresaDebeCrearseConCodigoRucRazonsocialDireccion(){
        // Arrange
        String codigo = "CL002";
        String ruc = "129401228";
        String razonSocial = "Extreme IT Solutions SAC";
        String direccion = "Av. Primavera 2550";
        
        // Act
        Empresa empresa = new Empresa(codigo, ruc, razonSocial, direccion);
        
        //Assert
        assertNotNull(empresa);
        assertEquals(codigo, empresa.getCodigo());
        assertEquals(ruc, empresa.getRuc());
        assertEquals(razonSocial, empresa.getRazonSocial());
        assertEquals(direccion, empresa.getDireccion());
    
    }
            


}
