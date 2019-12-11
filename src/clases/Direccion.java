package clases;
/**
 * 
 * @author MARIO LUZARDO
 *
 */
public class Direccion {
	
	/**
	 * @Atrib
	 */
	private String calle;
	private String ciudad;
	private int codigoPostal;
	private String pais;
	/**
	 * @Constructores @Default
	 */
	public Direccion() {
		this.calle = " ";
		this.ciudad = " ";
		this.codigoPostal = 0;
		this.pais = " ";
	}
	/**
	 * @Constructores 
	 * @param calle
	 * @param ciudad
	 * @param codigoPostal
	 * @param pais
	 */
	public Direccion(String calle, String ciudad, int codigoPostal, String pais) {
		
		this.calle = calle;
		this.ciudad = ciudad;
		this.codigoPostal = codigoPostal;
		this.pais = pais;
	}
	/**
	 * @Metodos
	 */
	/**
	 * 
	 * @return the this.calle to get 
	 */
	public String getCalle() {
		return calle;
	}
	/**
	 * 
	 * @param calle the this.calle to set
	 */
	public void setCalle(String calle) {
		this.calle = calle;
	}

	/**
	 * @return the this.ciudad to get 
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * @param ciudad the this.ciudad to set
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * @return the codigoPostal to get
	 */
	public int getCodigoPostal() {
		return codigoPostal;
	}

	/**
	 * @param codigoPostal the this.codigoPostal to set
	 */
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	/**
	 * @return the this.pais to get
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * @param pais the this.pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}
	public void mostrar() {
		 
		System.out.println("\tDireccion"
			 		+ "\nCalle: "+calle
			 		+ "\nCiudad: "+ciudad
			 		+ "\nCodigo Postal: "+codigoPostal
			 		+ "\npais: "+pais);
	}
}
