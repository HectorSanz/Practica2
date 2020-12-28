package Cliente;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.crypto.Data;

public class ClienteParticular extends Clientes {
	private String nombre;
	private String apellidos;
	private Date fechaNacimiento;
	private double rentaAnual;
	public ClienteParticular() {
		
		super();
				
	}
	//Metodos
	@Override 
	boolean ValidacionIdent() {
		
		boolean correcto = false;

	    Pattern pattern = Pattern.compile("(\\d{1,8})([TRWAGMYFPDXBNJZSQVHLCKEtrwagmyfpdxbnjzsqvhlcke])");

	    Matcher matcher = pattern.matcher(identificacion);

	    if (matcher.matches()) {

	        String letra = matcher.group(2);

	        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

	        int index = Integer.parseInt(matcher.group(1));

	        index = index % 23;

	        String reference = letras.substring(index, index + 1);



	        if (reference.equalsIgnoreCase(letra)) {

	            correcto = true;

	        } else {

	            correcto = false;

	        }

	    } else {

	        correcto = false;

	    }

	    return correcto;	}

	 boolean ValidacionContra(String password) {
		int contadorn = 0;
		int contadorl = 0;
		if(password.length()<=4) {
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
	 //Getters y Setters
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * @return the fechaNacimiento
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento=Date.valueOf(fechaNacimiento);	
	}
	/**
	 * @return the rentaAnual
	 */
	public double getRentaAnual() {
		return rentaAnual;
	}
	/**
	 * @param rentaAnual the rentaAnual to set
	 */
	public void setRentaAnual(double rentaAnual) {
		this.rentaAnual = rentaAnual;
	}

	
	 
}