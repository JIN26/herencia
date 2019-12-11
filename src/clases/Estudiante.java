/**
 * 
 */
package clases;

/**
 * @author MARIO LUZARDO
 *
 */
public class Estudiante extends Persona implements Ipersona {
  
	/**
	 * @Atrib
	 */
	private static int conta=0;
	private int codigo;
  
	/**
	 * @Constructores @Default
	 */
	public Estudiante(){
		super();
		this.codigo = conta++;
	}
	/**
	 * @Constructores 
	 * @param nombre
	 * @param apellido
	 * @param cedula
	 * @param direccion
	 */
	public Estudiante(String nombre,String apellido,int cedula,Direccion direccion){
		super(nombre,apellido,cedula,direccion);
		this.codigo = conta++;
	}
	/**
	 * @Metodos
	 */
	/**
	 * 
	 * @param codigo the this.codigo to set
	 */
	public void setCodigo(int codigo){
		this.codigo=codigo;
	}
	/**
	 * 
	 * @return this.codigo to get
	 */
	public int getCodigo(){
		return this.codigo;
	}
}
