package Cuentas;

import java.time.LocalDate;
import java.util.ArrayList;
import Excep.Excepciones;
import Cliente.*;

public abstract class Cuenta {
	private static int num=1;
	private int numCuenta;
	protected String cadenaCuenta;
	private Clientes client;
	protected double saldo;
	private ArrayList<String> opRealizadas = new ArrayList<>();
	 protected static final int MAXIMO_REINTEGRO=1000;
	 LocalDate date =LocalDate.now();
	
	
	//Constructor
	public Cuenta() {
		this.numCuenta =num;
		num++;
		this.saldo=0;
	}
	
	
	//Metodos
	  String ObCadenaCuenta() {
		String nc = "";
		for (int i = 0; i < 9-Integer.toString(this.numCuenta).length(); i++) {
			nc=nc+"0";	
			}
		nc=nc+this.numCuenta;
		return nc;
	}
	
	
	
	
	public void IngresarDinero(double ingreso) {
		this.saldo= this.saldo+ingreso;
		this.opRealizadas.add("Se ha ingresado: "+ ingreso);
	}
	
	public void SacarDinero(double retir) {
		try {
			Excepciones.Sacar(this.saldo, retir);
			this.saldo-=retir;
			this.opRealizadas.add("Se ha retirado: "+ retir);
		}catch(ArithmeticException e) {
			System.out.println("Cantidad no valida.");
		}
	}
	//Getters y Setters
	/**
	 * @return the numCuenta
	 */
	public int getNumCuenta() {
		return numCuenta;
	}


	/**
	 * @return the client
	 */
	public Clientes getClient() {
		return client;
	}


	/**
	 * @param client the client to set
	 */
	public void setClient(Clientes client) {
		this.client = client;
	}


	/**
	 * @return the cadenaCuenta
	 */
	public String getCadenaCuenta() {
		return cadenaCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
}
