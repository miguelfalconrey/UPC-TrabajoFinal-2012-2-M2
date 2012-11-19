package crm;


public class Articulos {

    private String Codpro;

    private int Cantidad;

    private int Umedida;

    private String Descripcion;

    private int Stockinial;

    private int Preciounitario;

    private int Recibidos;

    private int Despachado;

    private int Total;

    private String Numdoc;

    private String Numeroitem;

    public void Totaldetalle () {
    }

    public Articulos(String Codpro, int Cantidad, int Umedida, String Descripcion, int Stockinial, int Preciounitario, int Recibidos, int Despachado, int Total, String Numdoc, String Numeroitem) {
        this.Codpro = Codpro;
        this.Cantidad = Cantidad;
        this.Umedida = Umedida;
        this.Descripcion = Descripcion;
        this.Stockinial = Stockinial;
        this.Preciounitario = Preciounitario;
        this.Recibidos = Recibidos;
        this.Despachado = Despachado;
        this.Total = Total;
        this.Numdoc = Numdoc;
        this.Numeroitem = Numeroitem;
    }

    public String getCodpro() {
        return Codpro;
    }

    public void setCodpro(String Codpro) {
        this.Codpro = Codpro;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public int getUmedida() {
        return Umedida;
    }

    public void setUmedida(int Umedida) {
        this.Umedida = Umedida;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getStockinial() {
        return Stockinial;
    }

    public void setStockinial(int Stockinial) {
        this.Stockinial = Stockinial;
    }

    public int getPreciounitario() {
        return Preciounitario;
    }

    public void setPreciounitario(int Preciounitario) {
        this.Preciounitario = Preciounitario;
    }

    public int getRecibidos() {
        return Recibidos;
    }

    public void setRecibidos(int Recibidos) {
        this.Recibidos = Recibidos;
    }

    public int getDespachado() {
        return Despachado;
    }

    public void setDespachado(int Despachado) {
        this.Despachado = Despachado;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }

    public String getNumdoc() {
        return Numdoc;
    }

    public void setNumdoc(String Numdoc) {
        this.Numdoc = Numdoc;
    }

    public String getNumeroitem() {
        return Numeroitem;
    }

    public void setNumeroitem(String Numeroitem) {
        this.Numeroitem = Numeroitem;
    }

    
}

