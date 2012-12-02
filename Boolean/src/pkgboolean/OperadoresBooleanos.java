
package pkgboolean;

public class OperadoresBooleanos {
  
public static void main (String[] args) {

boolean x = true;
boolean y = false;
boolean a1 = x && x;
boolean a2 = x && y;
boolean a3 = y && x;
boolean a4 = y && y;

System.out.println("Tabla de la verdad");
System.out.println( x + " AND " + x + " = " + a1 );
System.out.println( x + " AND " + y + " = " + a1 );
System.out.println( y + " AND " + x + " = " + a1 );
System.out.println( y + " AND " + y + " = " + a1 );

System.out.println (" ------------------------- ");
boolean A = true;
boolean B = false;
System.out.println("A = " + A);
System.out.println("B = " + B);
System.out.println("A | B = " + (A|B));
System.out.println("A & B = " + (A&B));
System.out.println("!A | B = " + (!A));
System.out.println("A ^ B = " + (A^B));
System.out.println("(A | B)&A = " + ((A|B)&A));

  }
      
}
