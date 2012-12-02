/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appfacturacion;

/**
 *
 * @author pcsiecon
 */
public class Empresa extends Cliente{
    private String ruc;
    private String razonSocial;

    public Empresa(String codigo, String ruc, String razonSocial, String direccion) {
        super(codigo, direccion);
        this.ruc = ruc;
        this.razonSocial = razonSocial;
    }

    /**
     * @return the ruc
     */
    public String getRuc() {
        return ruc;
    }

    /**
     * @param ruc the ruc to set
     */
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    /**
     * @return the razonSocial
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * @param razonSocial the razonSocial to set
     */
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
                
    
}
