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
public class DetalleFacturaTest {
    
    public DetalleFacturaTest() {
    }
    
    @Test
    public void detalleDebeCrearseConCantidadProducto(){
        // Arrange
         int cantidad = 5;
         Producto producto = new Producto("P001", "iPhone 5", 1200.00);        
        // Act
         DetalleFactura detalle = new DetalleFactura(cantidad, producto);
        // Assert
         assertNotNull(detalle);
         assertEquals(cantidad, detalle.getCantidad());
         assertEquals(producto, detalle.getProducto());                         
    }
    
    @Test
    public void detalleDebeCalcularSubTotal(){
        // Arrange
         int cantidad = 5;
         Producto producto = new Producto("P001", "iPhone 5", 1200.00);
         DetalleFactura detalle = new DetalleFactura(cantidad, producto);        
        // Act
         double subTotalCalculado = detalle.calcularSubTotal();        
        // Assert
         double subTotalEsperado = cantidad * producto.getPrecio();
         assertEquals(subTotalEsperado, subTotalCalculado, 0.);
    }
       
}
