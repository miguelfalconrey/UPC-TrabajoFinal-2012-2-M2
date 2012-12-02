/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package apppc02;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author alumnos
 */
public class MedioTiempoTest {
   
    
    public MedioTiempoTest() {
    }
    
    @Test
    public void MedioTiempoDebeRegistrarse()
    {
    
       //Arrange
        String codigo = "MT0015";
        String nombre = "Ricardo Sanchez";
        String titulo = "Ing. Civil";
        int aniosExperiencia = 10;
        int horas = 166;
        String universidadOrigen = "UPN";
        //Act
        MedioTiempo miedotiempo = new MedioTiempo(codigo, nombre, titulo, aniosExperiencia, horas,universidadOrigen);
        //Assert
        assertNotNull(miedotiempo);
        assertEquals(codigo,miedotiempo.getCodigo());
        assertEquals(nombre, miedotiempo.getNombre());
        assertEquals(titulo,miedotiempo.getTitulo());
        assertEquals(aniosExperiencia,miedotiempo.getAniosExperiencia());
        assertEquals(horas,miedotiempo.getHoras());
        assertEquals(universidadOrigen,miedotiempo.getUniversidadOrigen());
    
    }
@Test
    public void medioTiempoDebeCalculaPagoMensual()       
    {
        
        //Arrange
        MedioTiempo miedotiempo = new MedioTiempo("MT0015", "Ricardo Sanchez", "Ing. Civil", 10, 166, "UPN");
        //Act
        
        double totalCalculado = miedotiempo.calcularTotalMensual();
        double totalEsperado = 166*miedotiempo.calcularPrecioPorHora();
        
        assertEquals(totalCalculado, totalEsperado,0.00);
    
        
    }
    
  
}
