/**
 * 
 */
package clases;

/**
 * @author MARIO LUZARDO
 *
 */
public class Profesor extends Persona implements Ipersona{
	
	/**
	 * @Atrib
	 */
	private String tipo;
	/**
	 * @Constructores @Default
	 */
	 public Profesor(){
		 this.tipo = " ";
	 }
	 /**
	  * @Constructores
	  * @param nombre
	  * @param apellido
	  * @param cedula
	  * @param direccion
	  * @param tipo
	  */
	 public Profesor(String nombre,String apellido,int cedula,Direccion direccion,String tipo){
		 super(nombre,apellido,cedula,direccion);
		 this.tipo = tipo;
	 }
	 /**
	  * @Metodos
	  */
	 /**
	  * 
	  * @return this.tipo to get
	  */
	 public String getTipo() {
		 return tipo;
	 }
	 /**
	  * 
	  * @param tipo the this.tipo to set
	  */
	 public void setTipo(String tipo) {
		 this.tipo = tipo;
	 }
}
