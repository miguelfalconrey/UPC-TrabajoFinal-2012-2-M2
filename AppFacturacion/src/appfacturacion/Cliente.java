/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appfacturacion;

/**
 *
 * Clase Abstracta que es clase base
 * de Persona y Empresa
 */
public abstract class Cliente {
    protected String codigo;
    protected String direccion;

    public Cliente(String codigo, String direccion) {
        this.codigo = codigo;
        this.direccion = direccion;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
