package Cliente;

import java.util.ArrayList;
import java.util.Date;

abstract public class Clientes {
	
	private static int nclientes=1;
	private  int ncliente;
	protected String identificacion;
	private Date fechaAlta;
	private String password;
	private String email;
		public Clientes() {		  
			this.ncliente=nclientes;	  
			nclientes++;
		}

		abstract boolean ValidacionIdent();


	
		 boolean ValidacionContra(String password) {
			if(password.length()>=6) {
			return true;
			}
			return false;
		}
		 //Getters y Setters de las diferentes atributos del padre.
		 public void setPassword(String password) {
			 if(ValidacionContra(password)==true)	
			 this.password = password;
				else {
					 System.out.println("Error al validar la contraseña");
				}
		}
		 
		public String getPassword() {
				
				return password;
			
		}

		/**
		 * @return the ncliente
		 */
		public int getNcliente() {
			return ncliente;
		}
		public String getIdentificacion() {
			return identificacion;
		}

		public void setIdentificacion(String identificacion) {
			this.identificacion = identificacion;
			if(ValidacionIdent()==false) {		
				System.out.println("Error al validar la identificacion.");
				this.identificacion = null;
			}
			
		}

}


