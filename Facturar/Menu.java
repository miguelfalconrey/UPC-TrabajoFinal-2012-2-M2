public class Menu
	{
	 
	 public static void main(String[] args)	
  			{ 
  			  int continuar=1;
  			  do {
  			  	 
  			  	  System.out.println("##################################");
  			  	  System.out.println("##  1. Ingresar Factura         ##");
                  System.out.println("##  2. Total Ingresos           ##");
                  System.out.println("##  3. Venta Mayor,Venta Menor  ##");
                  System.out.println("##  4. Salir                    ##");
                  System.out.println("##################################");
                  
                  int opcion=LeerT.LeerEnt();  	
  			  switch (opcion)
  			      {case 1: 
  			          IngresarClientes x =new IngresarClientes();
  			          x.Ingresar();
  			       break;     
  			       case 2:System.out.println("Total en ventas: "+ FuncionesV.VentasDia());;break;
  			       case 3:
  			             System.out.println("Mayor Venta  :"+IngresarClientes.MayorV.Cedula+"\t"+IngresarClientes.MayorV.Cliente+"\n Fecha: "+IngresarClientes.MayorV.FechaCompra+"\n Valor: "+IngresarClientes.MayorV.ValorCompra);
  			             System.out.println("Menor Venta  :"+IngresarClientes.MenorV.Cedula+"\t"+IngresarClientes.MenorV.Cliente+"\n Fecha: "+IngresarClientes.MenorV.FechaCompra+"\n Valor: "+IngresarClientes.MenorV.ValorCompra);
  			       break;
  			       case 4:continuar=0;break;
  			       default://nada
  			      } 
  			       
  			   }while(continuar==1);
  			}
 	}	