package boletinCRUD.ejer1;

import java.util.HashSet;

public class AlumnoCRUD {
	/**
	 * Atributo para almacenar los alumnos
	 */
	private static HashSet<Alumno> alumnos = new HashSet<Alumno>();
	
	/**
	 * Metodo que imprime los alumnos almacenados
	 */
	public static void imprimeAlumnos() {
		for(Alumno a : alumnos) {
			System.out.println(a);
		}
	}
	
	/**
	 * Metodo para añadadir alumno al conjunto
	 * @param Objeto Alumno
	 * @return Devuelve un booleano si se realiza con exito
	 */
	public static boolean añadirAlumno(Alumno a) {
		return alumnos.add(a);
	}
	
	public static void Alumno
	
	// Metodo para eliminar un alumno
	public static boolean borrarAlumno(Alumno a) {
		return alumnos.remove(a);
	}
	
	
	
}
