package Cuentas;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import Excep.Excepciones;
import Cliente.*;

public class CuentaJoven extends CuentaParticulares {
	
	public CuentaJoven()	{
		super();
		this.cadenaCuenta= "J"+ObCadenaCuenta();
	}
	protected double Comision() {
		return 0.02;
	}
	public void setClient(ClienteParticular client) {
		
		try {
		Excepciones.compEdadJoven(this.date.compareTo(client.getFechaNacimiento().toLocalDate()));
		super.setClient(client);
		}catch(ArithmeticException e) {
		System.out.println("Usuario no valido.");
		}
		
		}
	public void IngresarDinero(double ingreso) {
		try {
		Excepciones.IngresoJoven(this.saldo, ingreso);	
		super.IngresarDinero(ingreso);
		}catch(ArithmeticException e) {
			System.out.println("Cantidad no valida");
		}
		}
	public void SacarDinero(double retir) {
		try {
		Excepciones.SacarJoven(saldo, retir);
		super.SacarDinero(retir);
		}catch (ArithmeticException e) {
			System.out.println("No se puede sacar esa cantidad.");
		}
	}

}
