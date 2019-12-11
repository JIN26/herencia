/**
 * 
 */
package clases;

/**
 * @author CYBER-SERVER
 *
 */
public class Profesor extends Persona implements Ipersona{
  //atrib
  private String tipo;
  
  //constructores
  public Profesor(){
    this.tipo = " ";
  }
  public Profesor(String nombre,String apellido,int cedula,Direccion direccion,String tipo){
	  super(nombre,apellido,cedula,direccion);
	  this.tipo = tipo;
  }
  //metodos
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
}
