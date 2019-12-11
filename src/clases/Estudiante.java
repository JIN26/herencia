/**
 * 
 */
package clases;

/**
 * @author CYBER-SERVER
 *
 */
public class Estudiante extends Persona implements Ipersona {
  //atrib
	private static int conta=0;
	private int codigo;
  
  //constructores 
  public Estudiante(){
    super();
    this.codigo = conta++;
  }
  public Estudiante(String nombre,String apellido,int cedula,Direccion direccion){
	  super(nombre,apellido,cedula,direccion);
	  this.codigo = conta++;
  }
  //metodos
  public void setCodigo(int codigo){
    this.codigo=codigo;
  }
  public int getCodigo(){
    return this.codigo;
  }
}
