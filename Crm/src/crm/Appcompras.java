package crm;

import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class Appcompras {

    private ArrayList<Maestrodoc> doc; //Se declara
    private ArrayList<Articulos> articulo;  // Se declara el array
    
    public Appcompras() {
    doc = new ArrayList<Maestrodoc>();
    
            
    }
    
public ArrayList<Maestrodoc> getdoc(){
    return doc;
}
    
private void ingresardato(int Codigo, int Codprov, String Numdoc, String Detalle, String Fechaemision, String Formapago, int Total, String Fecemision, String Fechacancelacion, String Moneda, double Subtotal, double Igv, String Observaciones, String Tipodoc, int Codpro, String Estado){
    getdoc().add(new Maestrodoc(Codigo, Codprov, Numdoc, Detalle, Fechaemision, Formapago, Total, Fecemision, Fechacancelacion, Moneda, Subtotal, Igv, Observaciones, Tipodoc, Codpro, Estado));
        
}

public ArrayList<Articulos> getarticulo(){
    return articulo;
}

private void detalle(String Codpro, int Cantidad, int Umedida, String Descripcion, int Stockinial, int Preciounitario, int Recibidos, int Despachado, int Total, String Numdoc, String Numeroitem){
 getarticulo().add(new Articulos(Codpro, Cantidad, Umedida, Descripcion, Stockinial, Preciounitario, Recibidos, Despachado, Total, Numdoc, Numeroitem));    
    
}

    

  
}
