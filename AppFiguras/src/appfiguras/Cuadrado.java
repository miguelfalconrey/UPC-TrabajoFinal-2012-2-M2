/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appfiguras;

/**
 *
 * @author alumnos
 */
public class Cuadrado extends Figura {
    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
        
    }
    
}
