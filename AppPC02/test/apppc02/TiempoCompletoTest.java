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
public class TiempoCompletoTest {
    
    public TiempoCompletoTest() {
    }

    
    @Test
    public void tiempoCompletoDebeCrearse()
    {
         //Arrange
        String codigo = "TC018";
        String nombre = "Isabel Avila";
        String titulo = "Enfermmera";
        int aniosExperiencia = 40;
        int horas = 177;
        String universidadOrigen = "Universidad de San Marcos";
        String CIP = "CPI29722385";
        //Act
        TiempoCompleto tiempocompleto = new TiempoCompleto(codigo, nombre, titulo, aniosExperiencia, horas, universidadOrigen, CIP);
        //Assert
        assertNotNull(tiempocompleto);
        assertEquals(codigo,tiempocompleto.getCodigo());
        assertEquals(nombre, tiempocompleto.getNombre());
        assertEquals(titulo,tiempocompleto.getTitulo());
        assertEquals(aniosExperiencia,tiempocompleto.getAniosExperiencia());
        assertEquals(horas,tiempocompleto.getHoras());
        assertEquals(universidadOrigen,tiempocompleto.getUniversidadOrigen());
        assertEquals(CIP,tiempocompleto.getCIP());
    
    }
    
    @Test
    public void tiempoCompletoDebeCalcularTotalMensualAPagar()
    {
    
          //Arrange
        TiempoCompleto tiempocompleto = new TiempoCompleto("TC018", "Isabel Avila", "Enfermmera", 40, 177, "Universidad de San Marcos", "CPI29722385");
        //Act
        double precioPorHora = tiempocompleto.calcularPrecioPorHora();
        double totalCalculado = tiempocompleto.calcularTotalMensual();
        //Assert
        double totalEsperado = 177*precioPorHora;
        
        assertEquals(totalCalculado, totalEsperado,0.00);
        
        
        
    
    }
    
    
    
}
