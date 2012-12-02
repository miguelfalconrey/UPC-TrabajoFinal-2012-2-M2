
package apppc02;

public class MedioTiempo extends Profesor{
    
    public String universidadOrigen;

    public MedioTiempo(String codigo, String nombre, String titulo, int aniosExperiencia, int horas, String universidadOrigen) {
        super(codigo, nombre, titulo, aniosExperiencia, horas);
        this.universidadOrigen = universidadOrigen;
    }

    /**
     * @return the universidadOrigen
     */
    public String getUniversidadOrigen() {
        return universidadOrigen;
    }

    /**
     * @param universidadOrigen the universidadOrigen to set
     */
    public void setUniversidadOrigen(String universidadOrigen) {
        this.universidadOrigen = universidadOrigen;
    }

   public double calcularPrecioPorHora() {
    
       
        double valorhora = 0;
        if (aniosExperiencia <= 5)
                valorhora = 50;
        else if (aniosExperiencia > 5 )
                valorhora = 70;
        
        return valorhora;
       
    }
    
    public double calcularTotalMensual() {
        //Calcular total por hora
        double calcularPrecioHora = calcularPrecioPorHora();
        return calcularPrecioHora*horas;
    }
    
    

   
    
    
}
