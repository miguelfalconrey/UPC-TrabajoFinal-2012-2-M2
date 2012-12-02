/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appfiguras;

/**
 *
 * @author alumnos
 */
public class Circulo extends Figura{
    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea(){
        return 3.1416*radio*radio;
    }
    
}
