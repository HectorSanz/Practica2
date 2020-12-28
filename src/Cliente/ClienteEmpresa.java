package Cliente;
import java.util.Collections;
import java.lang.Integer;
import java.lang.String;
import java.sql.Date;


public class ClienteEmpresa extends Clientes{
	public enum razonsocial{SA,SL,SLNE,SLL,SAL,SC,SCom,SCoop};
	private String domicilioSocial;
	private String nombreEmpresa;
	public enum tipoEmpresa{Pyme,GranEmpresa}
	private double facturacionAnual;
	private Date fechaCreacion;
	private razonsocial rs;
	private tipoEmpresa tEmpresa;
	public ClienteEmpresa() {
		super();
		
	}

	@Override
	boolean ValidacionIdent() {
		//Comprobamos si la longuitud de la cadena es la correcta
		if(this.identificacion.length()!=9) {	return false;	}
		//Devuelve verdadero si el cif que se le pasa es valido
				boolean respuesta = false;//Tabla de caracter de control para cif extranjeros, organismos estatales y locales
				char tabla[] = {'J','A','B','C','D','E','F','G','H','I'};//en realidad la "J" debe estar en la ultima posición pero como
				int sumap=0; //las tablas en java cominezan en '0' la paso a la primera posicion
				int sumai=0;
				int p;
				int R;
				int dc;
				identificacion = identificacion.toUpperCase();
				try{
				sumap = Integer.parseInt(identificacion.substring(2,3))+Integer.parseInt(identificacion.substring(4,5))+Integer.parseInt(identificacion.substring
				(6,7));
				for(int i=1;i<=8;i++){
				p = 2 * Integer.parseInt(identificacion.substring(i,i+1));
				if (p>9){
				sumai += (p/10) + (p %10);
				}else{
				sumai += p;
				}
				i++;
				}
				R = sumap + sumai;//R es el resulrtado de las sumas de los productos
				dc = R % 10;//calculamos el digito de control que es el modulo de la suma de los productos
				dc = 10 - dc;//complemento a 10 del digito de control
				if (dc==10){//si el digito de control es 10 se le asigna el 0
				dc = 0;
				}
				if (Character.isLetter(identificacion.charAt(8)))
				{//si es un caracter el ultimo digito se compara con la tabla que debe ocupar la posicion del dc
				if (tabla[dc]==identificacion.charAt(8)){
				respuesta = true;
				}
				}else{//si no es el caracter de contro que debe coincidir con el ultimo digito
				if (dc==Integer.parseInt(identificacion.substring(8,9))){
				respuesta = true;
				}
				}
				}catch(ArithmeticException e){
				System.out.println("Division por cero");
				respuesta = false;
				}
				catch(IllegalArgumentException e) {
					respuesta = false;
				}
				return respuesta;

				
				
			}  
	
	
	
	
	
	
	
	  boolean ValidacionContra(String password) {
		  int contadorn = 0;
		  int contadorl = 0;		
		if(super.ValidacionContra(password) == true) {
		
		String letras = "qwertyuiopasdfghjklñzxcvbnmQWERTYUIOPASDFGHJKLÑZXCVBNM";
		String numeros = "0123456789";
		
	for (int j = 0; j < password.length(); j++) {
		if(contadorl!=1) {
			for (int a = 0; a < letras.length(); a++) {
				if(password.charAt(j) == letras.charAt(a)) {
					contadorl++;
				}
			}
		}
		if(contadorn!=1) {
			for (int a1 = 0; a1 < numeros.length(); a1++) {
					if(password.charAt(j) == numeros.charAt(a1)) {
					contadorn++;
					}		
			}
		}
			if (contadorl==1 && contadorn==1) {
				return true;
			}
		}
	}	
	return false;
	 
	  }
	  //Getters y setters

	/**
	 * @return the nombreEmpresa
	 */
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	/**
	 * @param nombreEmpresa the nombreEmpresa to set
	 */
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	/**
	 * @return the tEmpresa
	 */
	public tipoEmpresa gettEmpresa() {
		return tEmpresa;
	}

	/**
	 * @param tEmpresa the tEmpresa to set
	 */
	public void settEmpresa(tipoEmpresa tEmpresa) {
		this.tEmpresa = tEmpresa;
	}

	/**
	 * @return the fechaCreacion
	 */
	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = Date.valueOf(fechaCreacion);
	}

	/**
	 * @return the domicilioSocial
	 */
	public String getDomicilioSocial() {
		return domicilioSocial;
	}

	/**
	 * @param domicilioSocial the domicilioSocial to set
	 */
	public void setDomicilioSocial(String domicilioSocial) {
		this.domicilioSocial = domicilioSocial;
	}

	/**
	 * @return the facturacionAnual
	 */
	public double getFacturacionAnual() {
		return facturacionAnual;
	}

	/**
	 * @param facturacionAnual the facturacionAnual to set
	 */
	public void setFacturacionAnual(double facturacionAnual) {
		this.facturacionAnual = facturacionAnual;
	}

	/**
	 * @return the rs
	 */
	public razonsocial getRs() {
		return rs;
	}

	/**
	 * @param rs the rs to set
	 */
	public void setRs(razonsocial rs) {
		this.rs = rs;
	}
	  
}

