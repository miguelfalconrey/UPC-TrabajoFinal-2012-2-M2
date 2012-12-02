
package apppc02;

/**
 *
 * @author alumnos
 */
public class Auxiliar extends Profesor{

    public Auxiliar(String codigo, String nombre, String titulo, int aniosExperiencia, int horas) {
        super(codigo, nombre, titulo, aniosExperiencia, horas);
    }
      
    public double calcularPagoMensual() {
        //Calcular total por hora
        return 40*horas;
    }
    
    
}
