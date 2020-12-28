package Excep;
import Cuentas.Cuenta.*;
import Cliente.ClienteEmpresa;
import Cliente.ClienteEmpresa.razonsocial;
import Cliente.ClienteEmpresa.tipoEmpresa;
import Cliente.ClienteParticular;
import Cliente.Clientes;
import java.lang.Exception;
public class Excepciones {
	
	
	
	
	
	
	
	
	//Excepciones Cuentas
	//Tipo de cuenta

	//De edad
	 public static void compEdadJoven(int edad) {
	if(edad<=18 || edad>=34) 
		throw new ArithmeticException();
	}
	 public static void compTerceraEdad(int edad) {
			if(edad>65) 
				throw new ArithmeticException();
			}
	 //Ingresar
	 public static void IngresoPart(double ingreso) {
		 if(ingreso<10)
			 throw new ArithmeticException();
	 }
	 public static void IngresoJoven(double saldo,double ingreso) {
		 if(saldo+ingreso>15000 || ingreso>saldo)
			 throw new ArithmeticException();
	 }
	 public static void IngresoTerceraEdad(double ingreso) {
		 if(ingreso>1000)
			 throw new ArithmeticException();
	 }
	 //Sacar
	 public static void Sacar(double saldo,double retirar) {
		 if(saldo-retirar<0) 
			 throw new ArithmeticException();
	 }
	 public static void SacarJoven(double saldo,double retirar) {
		 if(retirar>saldo*0.5) 
			 throw new ArithmeticException();
	 }
	 public static void SacarTerceraEdad(double saldo,double retirar) {
		 if(saldo-retirar <-1000)
			 throw new ArithmeticException();
	 }
	 public static void SacarEmpresa(tipoEmpresa tipo,ClienteEmpresa cli,double retirar) {
		if(tipoEmpresa.Pyme.equals(tipo) && cli.getFacturacionAnual()*0.1<retirar)
			 throw new ArithmeticException();
	 }
}