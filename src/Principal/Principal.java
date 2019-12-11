/**
 * 
 */
package Principal;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

import clases.*;


/**
 * @author MARIO LUZARDO
 *
 */
public class Principal {

	/**
	 * @Main
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * @Atrib 
		 */
		int x=0,y=0;
		String nombre;
		String apellido;
		int cedula;
		Direccion direccion;
		String calle;
		String ciudad;
		int codigoPostal;
		String pais;
		boolean salir=true;
		Persona vec []=null;
		Scanner in = new Scanner(System.in);
		/**
		 * TODO Auto-generated method stub
		 */
		for(;;){
			System.out.println("\t\t Menu \n"
					+ "1.- Crear y Modificar  (Estudiantes y Profesores)\n"
					+ "2.- Mostrar datos\n"
					+ "3.- Buscar persona\n");	
			x = in.nextInt();
			switch(x) {
				case 1:
					do {	
						System.out.println("Cuantos Estudiantes o Profesores desea crear?");
						y=in.nextInt();
						vec = new Persona[y];
						for(int i=0;i<vec.length;i++) {
							System.out.print("Nombre: ");
							nombre = in.next();
							System.out.print("Apellido: ");
							apellido = in.next();
							System.out.print("Cedula: ");
							cedula = in.nextInt();
							System.out.print("Calle: ");
							calle = in.next();
							System.out.print("Ciudad: ");
							ciudad = in.next();
							System.out.print("Codigo Postal: ");
							codigoPostal = in.nextInt();
							System.out.print("pais: ");
							pais = in.next();
							System.out.print("1.- Estudiante\n2.- Profesor");
							y=in.nextInt();
							direccion = new Direccion (calle,ciudad,codigoPostal,pais);
							if(y==1) {
								vec[i]= new Estudiante(nombre, apellido, cedula, direccion);
							}else {
								System.out.println("Elija el tipo de profesor \n"
										+ "1.-Titular a Tiempo Completo  \n"
										+ "2.-Titular a Medio Tiempo\n"
										+ "3.-Contrato Ocasional con Relacion de Dependencia\n"
										+ "4.-Contrato Ocasional sin relacion de Dependencia\n");
								y=in.nextInt();
								switch(y) {
									case 1:
										vec[i]=new Profesor(nombre, apellido, cedula, direccion,"Titular a Tiempo Completo");
										break;
									case 2:
										vec[i]=new Profesor(nombre, apellido, cedula, direccion,"Titular a Medio Tiempo");
										break;
									case 3:
										vec[i]=new Profesor(nombre, apellido, cedula, direccion,"Contrato Ocasional con Relacion de Dependencia");
										break;
									case 4:
										vec[i]=new Profesor(nombre, apellido, cedula, direccion,"Contrato Ocasional sin relacion de Dependencia");
										break;
									default:
										System.out.println("Numero erroneo");
										break;
								}
							}
							System.out.println("Desea modificar modificar esta Persona? \n 1.- Si \n 2.- NO");
							y=in.nextInt();
							if(y==1){
								i--;
							}
						}
						
					}while(salir!=true);
					break;
				case 2:
					if(vec==null) {
						
						for(int i=0;i<vec.length;i++) {
							vec[i].mostrar();
						}
					}else {
						System.out.print("Aun no se a creado una persona");
					}
					break;
				case 3:
					if(vec!=null) {	
						System.out.println("Desea buscar por:\n 1.- Codigo\n 2.- Numero de Cedula\n");
						y=in.nextInt();
						int dato=0;
						if(y==1) {
							System.out.println("Codigo: ");
							dato=in.nextInt();
							for(int i=0;i<vec.length;i++) {
								
							}
							
						}else {
							System.out.println("Numero de Cedula: ");
							dato=in.nextInt();
						}
					}else {
						System.out.println("Aun no crea ninguna persona ");
					}
					break;

			}
			Profesor b = new Profesor();
			//Estudiante a = new Estudiante();
			
			//System.out.print("hola"+b.tipoPersona(b));
		}
	}

}
