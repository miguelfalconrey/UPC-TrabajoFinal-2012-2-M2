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
public class ProfesorTest {
    
    public ProfesorTest() {
    }

   @Test
    public void AuxiliarEsUnTipoDeProfesor(){
        //Arrange
        String codigo = "TP001";
        String nombre = "Eduardo Zegarra";
        String titulo = "Ing. Industrial";
        int aniosExperiencia = 5;
        int horas = 130;
        //Act
        Profesor auxiliar = new Auxiliar(codigo, nombre, titulo, aniosExperiencia, horas);
        //Assert
        assertNotNull(auxiliar);
        assertEquals(codigo,auxiliar.getCodigo());
        assertEquals(nombre, auxiliar.getNombre());
        assertEquals(titulo,auxiliar.getTitulo());
        assertEquals(aniosExperiencia,auxiliar.getAniosExperiencia());
        assertEquals(horas,auxiliar.getHoras());
        
    }
    
    @Test
    public void MedioTiempoEsUnTipoDeProfesor(){
         //Arrange
        String codigo = "MT0015";
        String nombre = "Ricardo Sanchez";
        String titulo = "Ing. Civil";
        int aniosExperiencia = 10;
        int horas = 166;
        String universidadOrigen = "UPN";
        //Act
        Profesor miedotiempo = new MedioTiempo(codigo, nombre, titulo, aniosExperiencia, horas,universidadOrigen);
        //Assert
        assertNotNull(miedotiempo);
        assertEquals(codigo,miedotiempo.getCodigo());
        assertEquals(nombre, miedotiempo.getNombre());
        assertEquals(titulo,miedotiempo.getTitulo());
        assertEquals(aniosExperiencia,miedotiempo.getAniosExperiencia());
        assertEquals(horas,miedotiempo.getHoras());
   
    
        
        
        
    }
    
    @Test
    
    public void TiempoCompletoEsUnTipoDeProfesor(){
        
          //Arrange
        String codigo = "TC018";
        String nombre = "Isabel Avila";
        String titulo = "Enfermmera";
        int aniosExperiencia = 40;
        int horas = 177;
        String universidadOrigen = "Universidad de San Marcos";
        String CIP = "CPI29722385";
        //Act
        Profesor tiempocompleto = new TiempoCompleto(codigo, nombre, titulo, aniosExperiencia, horas, universidadOrigen, CIP);
        //Assert
        assertNotNull(tiempocompleto);
        assertEquals(codigo,tiempocompleto.getCodigo());
        assertEquals(nombre, tiempocompleto.getNombre());
        assertEquals(titulo,tiempocompleto.getTitulo());
        assertEquals(aniosExperiencia,tiempocompleto.getAniosExperiencia());
        assertEquals(horas,tiempocompleto.getHoras());
       
    }
    
    
    
}
