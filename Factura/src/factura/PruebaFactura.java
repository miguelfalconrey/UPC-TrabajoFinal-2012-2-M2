
package factura;

import java.util.Scanner;

public class PruebaFactura {

public static void main( String args[] )  {
    
 String cadena;   
 int cantidad;   
 double valor;

 Factura factura = new Factura( "0" , "Ninguna" , 0 , 0.0 );
 System.out.printf( "\nNúmero de pieza: %s" , factura.obtenerNumDePieza() );
 System.out.printf( "\nDescripción de la pieza: %s" , factura.obtenerDescDePieza() );
 System.out.printf( "\nCantidad del artículo: %d" , factura.obtenerQtyArticulo() );
 System.out.printf( "\nValor unitario del artículo: %f" , factura.obtenerVlrArticulo() );
 
 Scanner entrada = new Scanner( System.in );
 
 System.out.print( "\nEscriba el número de pieza: " );
 cadena = entrada.nextLine();
 factura.establecerNumDePieza( cadena );
 
 System.out.print( "\nEscriba la descripción de la pieza: " );
 cadena = entrada.nextLine();
 factura.establecerDescPieza( cadena );
 
 System.out.print( "\nEscriba la cantidad del artículo: " );
 cantidad = entrada.nextInt();
 factura.establecerQtyArticulo( cantidad );
 
 System.out.print( "\nEscriba el valor del artículo: " );
 valor = entrada.nextDouble();
 factura.establecerVlrArticulo( valor );
 factura.obtenerMontoFactura();
 
 System.out.println();
 System.out.println();
 
 
}    
    
}
