package Cuentas;

import Cliente.ClienteParticular;
import Excep.Excepciones;

public class CuentaTerceraEdad extends CuentaParticulares {
	public CuentaTerceraEdad() {
		super();
		this.cadenaCuenta= "T"+ObCadenaCuenta();
		
	}
public void setClient(ClienteParticular client) {
		try {
		Excepciones.compTerceraEdad(this.date.compareTo(client.getFechaNacimiento().toLocalDate()));
		super.setClient(client);
		}catch(ArithmeticException e) {
		System.out.println("Usuario no valido.");
		}
		}
public void IngresarDinero(double ingreso) {
	try {
	Excepciones.IngresoTerceraEdad(ingreso);	
	super.IngresarDinero(ingreso);
	}catch(ArithmeticException e) {
		System.out.println("Cantidad no valida");
	}
	}
public void SacarDinero(double retir) {
	try {
	Excepciones.SacarTerceraEdad(saldo, retir);
	this.saldo-=retir;
	}catch (ArithmeticException e) {
		System.out.println("La cuenta no puede tener un descubierto de más de 1000€.");
	}
}

}
