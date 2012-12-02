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
public class FacturaTest {
    
    public FacturaTest() {
    }
    
    @Test
    public void facturaDebeCrearseConNumeroEmpresaFecha(){
        // Arrange
        int numero = 1001;
        Cliente cliente = new Empresa("CL002", "129401228", "Extreme IT Solutions SAC", "Av. Primavera 2550");
        String fecha = "12/09/2012";
        // Act
        Factura factura = new Factura(numero, cliente, fecha);
        // Assert
        assertNotNull(factura);
        assertEquals(numero, factura.getNumero());
        assertEquals(cliente, factura.getCliente());
        assertEquals(fecha, factura.getFecha());        
    }
    
    @Test
    public void facturaDebeCrearseConNumeroPersonaFecha(){
        // Arrange
        int numero = 1001;
        Cliente cliente = new Persona("CL001", "23272090", "Estanislao", "Contreras Chávez", "Av. Primavera 2550");
        String fecha = "12/09/2012";
        // Act
        Factura factura = new Factura(numero, cliente, fecha);
        // Assert
        assertNotNull(factura);
        assertEquals(numero, factura.getNumero());
        assertEquals(cliente, factura.getCliente());
        assertEquals(fecha, factura.getFecha());        
    }    
    
    @Test
    public void facturaDebeAdicionarDetalles(){        
        // Arrange
        int numero = 1001;
        Cliente cliente = new Empresa("CL003", "136522874", "UPC", "Av. Primavera S/n");
        String fecha = "12/09/2012";
        Factura factura = new Factura(numero, cliente, fecha);
        Producto producto = new Producto("P001", "iPad 3", 2000.00);
        int cantidad = 10;
        // Act
        factura.adicionarItem(cantidad, producto);        
        // Assert
        int itemsEsperados = 1;
        int itemsRetornados = factura.getNumeroItems();
        assertEquals(itemsEsperados, itemsRetornados);        
    }
    
    @Test
    public void facturaDebeCalcularTotalVenta(){
        
    }
    
    @Test
    public void facturaDebeCalculaIGV(){
    }
    
    @Test
    public void facturaDebeCalcularTotalAPagar(){
        
    }
    
    
    


}
