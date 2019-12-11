/**
 * 
 */
package clases;

/**
 * @author CYBER-SERVER
 *
 */
public abstract class Persona {
  //atrib 
  String nombre;
  String apellido;
  int cedula;
  //contrucctores
  Direccion direccion;
  public Persona(){
    this.nombre=" ";
    this.apellido=" ";
    this.cedula=0;
    this.direccion = new Direccion();
  }
  public Persona(String nombre,String apellido,int cedula,Direccion direccion){
    this.nombre = nombre;
    this.apellido = apellido;
    this.cedula = cedula;
    this.direccion = direccion;
  }
  //metodos
  public void setNombre(String nombre) {
	  this.nombre=nombre;
  }
  public String getNombre() {
	  return this.nombre;
  }
  public void setApellido(String apellido) {
	  this.apellido=apellido;
  }
  public String getApellido() {
	  return this.apellido;
  }
  public void setCedula(int cedula) {
	  this.cedula = cedula;
  }
  public int getCedula() {
	  return this.cedula;
  }
  public void setDireccion(Direccion direccion) {
	  this.direccion = direccion;
  }
  public Direccion getDireccion() {
	  return this.direccion;
  }
  
}
