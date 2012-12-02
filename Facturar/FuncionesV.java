public class FuncionesV
  {
  	public static  void Imprimir(Clientes es)
	  {
	  	System.out.println("Cliente: "+ es.Cedula+" \t"+es.Cliente+" \n Fecha"+es.FechaCompra+" \n Total Compra: "+es.ValorCompra);
	  }
    public static float VentasDia()
      {
      	return IngresarClientes.tcs;
      }
    public static Clientes VentaMayor(Clientes Contenedor,Clientes Instanc)
      {
      	
        if (Contenedor.ValorCompra<Instanc.ValorCompra)
           	 Contenedor=Instanc;
           
            return Contenedor;  
      }
    public static Clientes VentaMenor(Clientes Contenedor,Clientes Instanc)
      {
      	 if (Contenedor.ValorCompra==-223) return Instanc;
      	 if (Contenedor.ValorCompra>Instanc.ValorCompra) Contenedor=Instanc;
         return Contenedor;  
      }  

  }