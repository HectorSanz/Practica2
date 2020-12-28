package Cuentas;
import Cliente.ClienteEmpresa;
import Cliente.ClienteEmpresa.razonsocial;
import Cliente.ClienteEmpresa.tipoEmpresa;
import Cliente.Clientes;
import Excep.Excepciones;
import Excep.tipocuen;

public class CuentaEmpresas extends Cuenta{
	ClienteEmpresa cliente;
	public CuentaEmpresas() {
		super();
		this.cadenaCuenta= "E"+ObCadenaCuenta();
	}
	
	public void setClient(Clientes client) {
		try {
		tipocuen.clienteemp(client);
		cliente=(ClienteEmpresa) client;
			super.setClient(client);	
		}catch(tipocuen e){	
			System.out.println(e);	
	}
}
	public void SacarDinero(double retir) {
		try {
		Excepciones.SacarEmpresa(cliente.gettEmpresa(), cliente, retir);	
		super.SacarDinero(retir);
		retir*=Comision();
		this.saldo-=retir;
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
	}
	protected double Comision() {
		if(saldo<5000)
		return 0.1;
		else {
			return 1;
		}
	}

}
