package Main;
import java.util.ArrayList;
import java.sql.Date;
import java.lang.*;
import java.lang.reflect.Array;

import Cliente.*;
import Cliente.ClienteEmpresa.razonsocial;
import Cuentas.CuentaEmpresas;
import Cuentas.CuentaJoven;
import Cuentas.CuentaParticulares;
import Cuentas.CuentaTerceraEdad;

public class Main {

	public static void main(String[] args) {
		ClienteEmpresa cliente1= new ClienteEmpresa();
		ClienteParticular cliente2= new ClienteParticular();
		ClienteEmpresa cliente3= new ClienteEmpresa();
		CuentaJoven c1 = new CuentaJoven();
		CuentaParticulares c2 = new CuentaParticulares();
		CuentaEmpresas c3 = new CuentaEmpresas();
		CuentaParticulares c4 = new CuentaParticulares();
		System.out.println(c1.getCadenaCuenta());
		System.out.println(c2.getCadenaCuenta());
		System.out.println(c3.getCadenaCuenta());
		System.out.println(c4.getCadenaCuenta());
		cliente2.setFechaNacimiento("2001-11-12");
		
		
		
	
	}

}