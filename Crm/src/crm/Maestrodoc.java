package crm;


public class Maestrodoc {

    private int Codigo;

    private int Codprov;

    private String Numdoc;

    private String Detalle;

    private String Fechaemision;

    private String Formapago;

    private int Total;

    private String Fecemision;

    private String Fechacancelacion;

    private String Moneda;

    private double Subtotal;

    private double Igv;

    private String Observaciones;

    private String Tipodoc;

    private int Codpro;

    private String Estado;

    public Maestrodoc(int Codigo, int Codprov, String Numdoc, String Detalle, String Fechaemision, String Formapago, int Total, String Fecemision, String Fechacancelacion, String Moneda, double Subtotal, double Igv, String Observaciones, String Tipodoc, int Codpro, String Estado) {
        this.Codigo = Codigo;
        this.Codprov = Codprov;
        this.Numdoc = Numdoc;
        this.Detalle = Detalle;
        this.Fechaemision = Fechaemision;
        this.Formapago = Formapago;
        this.Total = Total;
        this.Fecemision = Fecemision;
        this.Fechacancelacion = Fechacancelacion;
        this.Moneda = Moneda;
        this.Subtotal = Subtotal;
        this.Igv = Igv;
        this.Observaciones = Observaciones;
        this.Tipodoc = Tipodoc;
        this.Codpro = Codpro;
        this.Estado = Estado;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public int getCodprov() {
        return Codprov;
    }

    public void setCodprov(int Codprov) {
        this.Codprov = Codprov;
    }

    public String getNumdoc() {
        return Numdoc;
    }

    public void setNumdoc(String Numdoc) {
        this.Numdoc = Numdoc;
    }

    public String getDetalle() {
        return Detalle;
    }

    public void setDetalle(String Detalle) {
        this.Detalle = Detalle;
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

    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }

    public String getFecemision() {
        return Fecemision;
    }

    public void setFecemision(String Fecemision) {
        this.Fecemision = Fecemision;
    }

    public String getFechacancelacion() {
        return Fechacancelacion;
    }

    public void setFechacancelacion(String Fechacancelacion) {
        this.Fechacancelacion = Fechacancelacion;
    }

    public String getMoneda() {
        return Moneda;
    }

    public void setMoneda(String Moneda) {
        this.Moneda = Moneda;
    }

    public double getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(double Subtotal) {
        this.Subtotal = Subtotal;
    }

    public double getIgv() {
        return Igv;
    }

    public void setIgv(double Igv) {
        this.Igv = Igv;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public String getTipodoc() {
        return Tipodoc;
    }

    public void setTipodoc(String Tipodoc) {
        this.Tipodoc = Tipodoc;
    }

    public int getCodpro() {
        return Codpro;
    }

    public void setCodpro(int Codpro) {
        this.Codpro = Codpro;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public void Caltot () {
    }

    public void Fechavencimiento () {
    }

    public void Altacompra () {
    }

    public void Buscar () {
    }

}

