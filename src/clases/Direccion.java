package clases;

public class Direccion {
	//atrib
	private String calle;
	private String ciudad;
	private int codigoPostal;
	private String pais;
	
	//contructores
	public Direccion() {
		this.calle = " ";
		this.ciudad = " ";
		this.codigoPostal = 0;
		this.pais = " ";
	}
	public Direccion(String calle, String ciudad, int codigoPostal, String pais) {
		
		this.calle = calle;
		this.ciudad = ciudad;
		this.codigoPostal = codigoPostal;
		this.pais = pais;
	}
	
	//metodos
	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	/**
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * @return the codigoPostal
	 */
	public int getCodigoPostal() {
		return codigoPostal;
	}

	/**
	 * @param codigoPostal the codigoPostal to set
	 */
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}
}
