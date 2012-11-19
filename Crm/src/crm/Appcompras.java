package crm;

import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class Appcompras {

    private ArrayList<Maestrodoc> doc; //Se declara
      
    
    public Appcompras() {
    doc = new ArrayList<Maestrodoc>();
            
    }
    
public ArrayList<Maestrodoc> getdoc(){
    return doc;
}
    
private void ingresardato(int Codigo, int Codprov, String Numdoc, String Detalle, String Fechaemision, String Formapago, int Total, String Fecemision, String Fechacancelacion, String Moneda, double Subtotal, double Igv, String Observaciones, String Tipodoc, int Codpro, String Estado){
    getdoc().add(new Maestrodoc(Codigo, Codprov, Numdoc, Detalle, Fechaemision, Formapago, Total, Fecemision, Fechacancelacion, Moneda, Subtotal, Igv, Observaciones, Tipodoc, Codpro, Estado));
        
}
    

  
}
