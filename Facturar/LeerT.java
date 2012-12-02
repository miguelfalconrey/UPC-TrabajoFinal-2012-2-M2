import java.io.*;
public class LeerT
	{
	 public static InputStreamReader isr=new InputStreamReader(System.in);
	 public static BufferedReader br=new BufferedReader(isr);
	 
	     public static String Leer()
  			{ String Dato=" ";
  			   try {
  			         Dato= br.readLine();
  			          br.skip(System.in.available());
  				     }
  				        catch( IOException Err ) 
  				        {
  				        
  				        }	   					    
  				return Dato;     
  			 }
  	      public static int LeerEnt()
  	         {  
  	             int n= Integer.parseInt(Leer());
  	             return n;
  	         } 
  	      public static float LeerDecF()
  	         {  
  	             Float f= new Float(Leer());
  	             return (f.floatValue());
  	         } 
  	      public static char LeerTecla()
  	         {  
  	            try {
  	                   char n= (char)System.in.read();
  	                  }
  			   catch( IOException Err ) 
  				        {
  				        
  				        }	   			
  	             return 0;
  	         } 
 	}	

