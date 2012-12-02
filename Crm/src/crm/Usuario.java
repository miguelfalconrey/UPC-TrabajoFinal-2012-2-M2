/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crm;

/**
 *
 * @author gerald
 */
public class Usuario {

    private String dni;
    private String nombre;
    private String apellidopaterno;
    private String apellidomaterno;
    private String usuario;
    private String correo;
    private String fechaingreso;
    private String cargo;
    private String rol;
    private String contrasena;
    private String creadopor;
    private String fechadecreacion;
    private String actualizadopor;
    private String fechadeactualizacion;

    public Usuario(String dni, String nombre, String apellidopaterno, String apellidomaterno, 
            String usuario, String correo, String fechaingreso, String cargo, String rol, String contrasena,
            String creadopor, String fechadecreacion, String actualizadopor, String fechadeactualizacion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidopaterno = apellidopaterno;
        this.apellidomaterno = apellidomaterno;
        this.usuario = usuario;
        this.correo = correo;
        this.fechaingreso = fechaingreso;
        this.cargo = cargo;
        this.rol = rol;
        this.contrasena = contrasena;
        this.creadopor = creadopor;
        this.fechadecreacion = fechadecreacion;
        this.actualizadopor = actualizadopor;
        this.fechadeactualizacion = fechadeactualizacion;
    }
    
    

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidopaterno() {
        return apellidopaterno;
    }

    public void setApellidopaterno(String apellidopaterno) {
        this.apellidopaterno = apellidopaterno;
    }

    public String getApellidomaterno() {
        return apellidomaterno;
    }

    public void setApellidomaterno(String apellidomaterno) {
        this.apellidomaterno = apellidomaterno;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(String fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCreadopor() {
        return creadopor;
    }

    public void setCreadopor(String creadopor) {
        this.creadopor = creadopor;
    }

    public String getFechadecreacion() {
        return fechadecreacion;
    }

    public void setFechadecreacion(String fechadecreacion) {
        this.fechadecreacion = fechadecreacion;
    }

    public String getActualizadopor() {
        return actualizadopor;
    }

    public void setActualizadopor(String actualizadopor) {
        this.actualizadopor = actualizadopor;
    }

    public String getFechadeactualizacion() {
        return fechadeactualizacion;
    }

    public void setFechadeactualizacion(String fechadeactualizacion) {
        this.fechadeactualizacion = fechadeactualizacion;
    }
    
    
    
}
