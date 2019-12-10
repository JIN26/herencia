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
}
