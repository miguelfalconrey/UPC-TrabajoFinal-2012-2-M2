package crm;


public class Proveedor {

    private String Codpro;

    private String Rucprov;

    private String Razonsocial;

    private String Direccion;

    private String Telefono;

    private String Contacto;

    public String getCodpro() {
        return Codpro;
    }

    public void setCodpro(String Codpro) {
        this.Codpro = Codpro;
    }

    public String getRucprov() {
        return Rucprov;
    }

    public void setRucprov(String Rucprov) {
        this.Rucprov = Rucprov;
    }

    public String getRazonsocial() {
        return Razonsocial;
    }

    public void setRazonsocial(String Razonsocial) {
        this.Razonsocial = Razonsocial;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getContacto() {
        return Contacto;
    }

    public void setContacto(String Contacto) {
        this.Contacto = Contacto;
    }

    public Proveedor(String Codpro, String Rucprov, String Razonsocial, String Direccion, String Telefono, String Contacto) {
        this.Codpro = Codpro;
        this.Rucprov = Rucprov;
        this.Razonsocial = Razonsocial;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Contacto = Contacto;
    }

    
}

