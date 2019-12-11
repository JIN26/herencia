package clases;

/**
 * 
 * @author MARIO LUZARDO
 *
 */
public interface Ipersona {
	/**
	 * 
	 * @param estudiante
	 * @return
	 */
	default String tipoPersona(Estudiante estudiante){
		return "Estudiante";
	}
	/**
	 * 
	 * @param profesor
	 * @return
	 */
	default String tipoPersona(Profesor profesor){
		return "Profesor";
	}
	
}
