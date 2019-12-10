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
  private int const Codigo;
  
  //constructores 
  public Estudiante(){
    super();
    this.codigo = 0;
  }
  public Estuante(int Codigo){
    this.codigo = codigo;
  }
  //metodos
  public void setCodigo(int Codigo){
    this.codigo=codigo;
  }
  public int getCodigo(){
    return this.codigo;
  }
}
