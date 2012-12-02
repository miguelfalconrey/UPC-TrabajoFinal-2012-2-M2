/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appfiguras;

/**
 *
 * @author alumnos
 */
public class Rectangulo extends Figura{
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    
    public double calcularArea(){
    return base * altura;
    }
    
}
