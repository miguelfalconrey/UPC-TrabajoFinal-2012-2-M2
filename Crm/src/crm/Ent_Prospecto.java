/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crm;

/**
 *
 * @author gerald
 */
public class Ent_Prospecto extends Ent_Cliente {
    
    //Atributos de la clase
    
    // private boolean estadoprospecto;
    
    private String EstadoProspecto;

    public Ent_Prospecto(String EstadoProspecto, String Nombres,
            String ApellidoPaterno, String ApellidoMaterno,
            String correo, String dni, String telefono, String fechaContacto) {
            super(Nombres, ApellidoPaterno, ApellidoMaterno, correo, dni, telefono, fechaContacto);
            this.EstadoProspecto = EstadoProspecto;
    }

    public String getEstadoProspecto() {
        return EstadoProspecto;
    }

    public void setEstadoProspecto(String EstadoProspecto) {
        this.EstadoProspecto = EstadoProspecto;
    }
    
      
}
