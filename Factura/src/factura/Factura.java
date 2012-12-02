/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factura;

public class Factura {

    private String numDePieza;
    private String descPieza;
    private int qtyArticulo;
    private double vlrArticulo;

    public Factura(String pNumDePieza, String pDescPieza, int pQtyArticulo, double pVlrArticulo) {
        numDePieza = pNumDePieza;
        descPieza = pDescPieza;
        
        if ( pQtyArticulo > 0 ){
            qtyArticulo = pQtyArticulo;           
        }
        if ( pVlrArticulo > 0.0 ){
          vlrArticulo = pVlrArticulo;  
        }
    }

    public void establecerNumDePieza( String pNumDePieza ){
        numDePieza = pNumDePieza;
        }
    
    public String obtenerNumDePieza(){
        return numDePieza;
        }
    
    public void establecerDescPieza ( String pDescPieza ){
        descPieza = pDescPieza;
        }
    
    public String obtenerDescDePieza(){
        return descPieza;
        }
    
    public void establecerQtyArticulo ( int pQtyArticulo ){
        qtyArticulo = pQtyArticulo;
        }
    
    public int obtenerQtyArticulo(){
        return qtyArticulo;
        }
    
    public void establecerVlrArticulo ( double pVlrArticulo ){
        vlrArticulo = pVlrArticulo;
        }
    
    public double obtenerVlrArticulo(){
        return vlrArticulo;
        }
    
    
    public void obtenerMontoFactura(){
        if (obtenerQtyArticulo() <0 ){
            qtyArticulo = 0;            
        }
        if (obtenerVlrArticulo() <0.0 ){
            vlrArticulo = 0.0;            
        }
        
        System.out.printf( "\n ********** FERRETERÍA **********" );
        System.out.printf( "\n ***** Factura *****\n\n" );
        System.out.printf( "Número de pieza: %s" , obtenerNumDePieza() );
        System.out.printf( "\nDescripción de la pieza: %s" , obtenerDescDePieza() );
        System.out.printf( "\nCantidad del artículo: %d" , obtenerQtyArticulo() );
        System.out.printf( "\nValor unitario del artículo: %f" , obtenerVlrArticulo() );
        
        System.out.printf( "\n\nEl total a pagar es: %f" , ( obtenerQtyArticulo() * obtenerVlrArticulo()));
        
        
    }
    
    
    }

