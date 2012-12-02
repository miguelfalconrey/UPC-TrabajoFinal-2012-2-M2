/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appfacturacion;

/**
 *
 * @author pcsiecon
 */
public class Persona extends Cliente {
    private String dni;
    private String nombre;
    private String apellidos;

    public Persona(String codigo, String dni, String nombre, String apellidos, String direccion) {
        // super permite invocar a metodos de la clase base
        // en este caso esta ejecutandose el constructor de Cliente
        super(codigo, direccion);
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    
            
    
}
