package clases;

public interface Ipersona {
	default String tipoPersona(Estudiante estudiante){
		return "Estudiante";
	}
	
	default String tipoPersona(Profesor profesor){
		return "Profesor";
	}
	
}
