/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crm;

/**
 *
 * @author Miguel
 */
class Compra {

    private String Tipodoc;
    private String Numdoc;
    private String Moneda;
    private String Fechaemision;
    private String Formapago;
    private String Detalle;

    public Compra(String Tipodoc, String Numdoc, String Moneda, String Fechaemision, String Formapago, String Detalle) {
        this.Tipodoc = Tipodoc;
        this.Numdoc = Numdoc;
        this.Moneda = Moneda;
        this.Fechaemision = Fechaemision;
        this.Formapago = Formapago;
        this.Detalle = Detalle;
    }

    public String getTipodoc() {
        return Tipodoc;
    }

    public void setTipodoc(String Tipodoc) {
        this.Tipodoc = Tipodoc;
    }

    public String getNumdoc() {
        return Numdoc;
    }

    public void setNumdoc(String Numdoc) {
        this.Numdoc = Numdoc;
    }

    public String getMoneda() {
        return Moneda;
    }

    public void setMoneda(String Moneda) {
        this.Moneda = Moneda;
    }

    public String getFechaemision() {
        return Fechaemision;
    }

    public void setFechaemision(String Fechaemision) {
        this.Fechaemision = Fechaemision;
    }

    public String getFormapago() {
        return Formapago;
    }

    public void setFormapago(String Formapago) {
        this.Formapago = Formapago;
    }

    public String getDetalle() {
        return Detalle;
    }

    public void setDetalle(String Detalle) {
        this.Detalle = Detalle;
    }

    
    
    
}
