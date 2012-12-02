/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appfiguras;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author alumnos
 */
public class FiguraTest {
    
    public FiguraTest() {
    }

    @Test
    public void cuadradoEsUnTipoDeFigura(){
        
    //Arrange
        int lado =100;
        Figura figura = new Cuadrado (lado);
        //act
        double areaRetornada = figura.calcularArea();
        //assert
        double areaEsperada = lado * lado;
        assertEquals(areaEsperada,areaRetornada,0.0);
        
    }
    @Test
    public void circuloEsUnTipoDeFigura(){
        //Arrange
        int radio =30;
        Figura figura = new Circulo (radio);
        //act
        double areaRetornada = figura.calcularArea();
        //assert
        double areaEsperada = 3.1416 * radio * radio;
        assertEquals(areaEsperada,areaRetornada,0.0);
        
    }
    
    @Test
    public void rectanguloEsUnTipoDeFigura(){
        //Arrange
        int base =20;
        int altura =30;
        
        Figura figura = new Rectangulo (base,altura);
        //act
        double areaRetornada = figura.calcularArea();
        //assert
        double areaEsperada = base * altura;
        assertEquals(areaEsperada,areaRetornada,0.0);
        
    }
    
}
