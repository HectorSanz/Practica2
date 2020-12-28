package Cuentas;

import Cliente.ClienteParticular;
import Cliente.Clientes;
import Excep.Excepciones;
import Excep.tipocuen;

public class CuentaParticulares extends Cuenta{
	public CuentaParticulares() {
		super();
		this.cadenaCuenta= "P"+ObCadenaCuenta();
		
	}
	public void setClient(Clientes client) {
		try {
			tipocuen.clientepar(client);
			super.setClient(client);	
	}catch(tipocuen e){	
			System.out.println(e);	
	}
}

	public void IngresarDinero(double ingreso) {
		try {
		Excepciones.IngresoPart(ingreso);
		super.IngresarDinero(ingreso);
		}catch(ArithmeticException e) {
			System.out.println("No se puede ingresar menos de 10.");
		}
	}
	public void SacarDinero(double retir) {
		super.SacarDinero(retir);
		retir*=Comision();
		this.saldo-=retir;
	}
	protected double Comision() {
		return 0.05;
	}
}
