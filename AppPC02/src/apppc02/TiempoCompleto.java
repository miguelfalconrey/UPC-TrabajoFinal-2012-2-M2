package apppc02;

/**
 *
 * @author alumnos
 */
public class TiempoCompleto extends Profesor{
    
    public String universidadOrigen;
    public String CIP;

    public TiempoCompleto(String codigo, String nombre, String titulo, int aniosExperiencia, int horas, String universidadOrigen, String CIP ) {
        super(codigo, nombre, titulo, aniosExperiencia, horas);
        this.universidadOrigen = universidadOrigen;
        this.CIP = CIP;
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

    /**
     * @return the CIP
     */
    public String getCIP() {
        return CIP;
    }

    /**
     * @param CIP the CIP to set
     */
    public void setCIP(String CIP) {
        this.CIP = CIP;
    }
    
    
        public double calcularPrecioPorHora() {
   
        double valorhora = 0;
        if (aniosExperiencia <= 10)
                valorhora = 75;
        else if (aniosExperiencia > 10 )
                valorhora = 90;
        
        return valorhora;
       
    }
    
    public double calcularTotalMensual() {
        //Calcular total por hora
        double calcularPrecioHora = calcularPrecioPorHora();
        return calcularPrecioHora*horas;
    }
    
    
    
    
}
