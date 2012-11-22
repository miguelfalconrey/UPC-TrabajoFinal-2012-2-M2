package crm;


public class Personajuridica {

    private String Razonsocial;

    private String Ruc;

    public String getRazonsocial() {
        return Razonsocial;
    }

    public void setRazonsocial(String Razonsocial) {
        this.Razonsocial = Razonsocial;
    }

    public String getRuc() {
        return Ruc;
    }

    public void setRuc(String Ruc) {
        this.Ruc = Ruc;
    }

    public Personajuridica(String Razonsocial, String Ruc) {
        this.Razonsocial = Razonsocial;
        this.Ruc = Ruc;
    }

    
    
}

