package Excep;

import Cliente.ClienteEmpresa;
import Cliente.ClienteParticular;
import Cliente.Clientes;

public class tipocuen extends Exception{
	
		public tipocuen(String m)
		{
			super(m);
		}
		 public static void clientepar(Clientes clien)throws tipocuen{
			 if(!(clien instanceof ClienteParticular))  
				 throw new tipocuen("No se puede crear");
		 }
		 public static void clienteemp(Clientes clien)throws tipocuen{
			 if(!(clien instanceof ClienteEmpresa))  
				 throw new tipocuen("No se puede crear");
		 }
	
}
