public class IngresarClientes
{
	public static int cc=0;
    public static float tcs=0;
    public static float tc=0;
    public static Clientes MayorV =new Clientes("0","0","0",0);
    public static Clientes MenorV =new Clientes("0","0","0",-223);
    private static int salp=0;
    
     public static int Ingresar()
       {
       	 do
       	   {
       	   	
       	   	 tc=0;salp=0;
       	   	System.out.println("Codigo: ");
       	    String Cod=LeerT.Leer();
       	    if (Cod.equals("0"))
       	        return 0;
       	    System.out.println("Nombre: ");
       	    String Nombre=LeerT.Leer();	
       	    System.out.println("Fecha: ");
       	    String Fecha=LeerT.Leer();
 
       	    System.out.println("Codigo del producto: ");
       	    String Cod2=LeerT.Leer();
       	    if (Cod2.equals("0"))
       	           salp=1;     
       	     while(salp==0){
       	     	  System.out.println("Cantidad: ");
       	          int cantidad=LeerT.LeerEnt();	
       	          System.out.println("Valor: ");
       	          float valor=LeerT.LeerDecF();	
                  tc=tc+(valor*cantidad);
                  System.out.println("Codigo del producto: ");
       	          String Cod3=LeerT.Leer();
                  if (Cod3.equals("0"))
       	           salp=1;       	
               }
       	      Clientes CLI = new Clientes(Cod,Nombre,Fecha,tc);
       	      MayorV= FuncionesV.VentaMayor(MayorV,CLI);
              MenorV= FuncionesV.VentaMenor(MenorV,CLI);
       	    cc++;tcs=tcs + tc;
       	    FuncionesV.Imprimir(CLI);
       	    
       	}while(true);
      }
}