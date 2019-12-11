/**
 * 
 */
package clases;

/**
 * @author MARIO LUZARDO
 *
 */
public abstract class Persona {
	
  /**
   * @Atrib
   */
  String nombre;
  String apellido;
  int cedula;
  /**
   * @Constructores @Default
   */
  Direccion direccion;
  public Persona(){
    this.nombre=" ";
    this.apellido=" ";
    this.cedula=0;
    this.direccion = new Direccion();
  }
  /**
   * @Constructores 
   * @param nombre
   * @param apellido
   * @param cedula
   * @param direccion
   */
  public Persona(String nombre,String apellido,int cedula,Direccion direccion){
    this.nombre = nombre;
    this.apellido = apellido;
    this.cedula = cedula;
    this.direccion = direccion;
  }
  /**
   * @Metodos
   */
  public void mostrar() {
		 System.out.println("\tDatos"
		 		+ "\nNombre: "+nombre
		 		+ "\nApellido: "+apellido
		 		+ "\ncedula: "+cedula);
		 direccion.mostrar();
  }
  /**
   * 
   * @param nombre the this.nombre to set
   */
  public void setNombre(String nombre) {
	  this.nombre=nombre;
  }
  /**
   * 
   * @return the this.nombre to get
   */
  public String getNombre() {
	  return this.nombre;
  }
  /**
   * 
   * @param apellido the this.apellido to set
   */
  public void setApellido(String apellido) {
	  this.apellido=apellido;
  }
  /**
   * 
   * @return the this.apellido to get
   */
  public String getApellido() {
	  return this.apellido;
  }
  /**
   * 
   * @param cedula the this.cedula to set
   */
  public void setCedula(int cedula) {
	  this.cedula = cedula;
  }
  /**
   * 
   * @return the this.cedula to get
   */
  public int getCedula() {
	  return this.cedula;
  }
  /**
   * 
   * @param direccion the this.direccion to set
   */
  public void setDireccion(Direccion direccion) {
	  this.direccion = direccion;
  }
  /**
   * 
   * @return the this.direccion to get
   */
  public Direccion getDireccion() {
	  return this.direccion;
  }
  
}
