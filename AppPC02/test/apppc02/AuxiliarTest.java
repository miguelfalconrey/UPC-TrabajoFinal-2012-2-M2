
package apppc02;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author alumnos
 */
public class AuxiliarTest {
    
    public AuxiliarTest() {
    }

  @Test
  
  public void AuxiliarDebeRegistarse()
  {
     // Arrange
     String codigo="AX0022";
     String nombre="José Vega";
     String titulo="Ciencias de la comunicación";
     int aniosExperiencia=2;
     int horas= 120;
      // Act
      
      Profesor auxiliar=new Auxiliar(codigo,nombre,titulo, aniosExperiencia, horas);
      
      // Assert
      
      assertNotNull(auxiliar);
      assertEquals(codigo,auxiliar.getCodigo());
      assertEquals(nombre,auxiliar.getNombre());
      assertEquals(titulo,auxiliar.getTitulo());
      assertEquals(aniosExperiencia,auxiliar.getAniosExperiencia());
      assertEquals(horas,auxiliar.getHoras());
      
  }
  
  @Test
  
  public void auxiliarDebeCalcularPagoMensual()
  {
      
     // Arrange
     String codigo="AX0022";
     String nombre="José Vega";
     String titulo="Ciencias de la comunicación";
     int aniosExperiencia=2;
     int horas= 120;
      
      Auxiliar auxiliar=new Auxiliar(codigo,nombre,titulo, aniosExperiencia, horas);
      
       // Act
     double totalCalculado= auxiliar.calcularPagoMensual();
     double totalEsperado=120*40;
  
     // Assert 
     
     assertEquals(totalCalculado,totalEsperado,0.00);
     
     
  }
    
    
}
