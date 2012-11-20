/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crm;

/**
 *
 * @author gerald
 */
public class Ent_Cliente {
    
    private String Nombres;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private String correo;
    private String dni;
    private String telefono;
    private String fechaContacto;

    public Ent_Cliente(String Nombres, String ApellidoPaterno, String ApellidoMaterno,
            String correo, String dni, String telefono, String fechaContacto) {
        this.Nombres = Nombres;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.correo = correo;
        this.dni = dni;
        this.telefono = telefono;
        this.fechaContacto = fechaContacto;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String ApellidoMaterno) {
        this.ApellidoMaterno = ApellidoMaterno;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaContacto() {
        return fechaContacto;
    }

    public void setFechaContacto(String fechaContacto) {
        this.fechaContacto = fechaContacto;
    }
    
      
    
}
