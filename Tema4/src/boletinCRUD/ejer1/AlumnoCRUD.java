package boletinCRUD.ejer1;

import java.util.ArrayList;

public class AlumnoCRUD {
	/**
	 * Atributo para almacenar los alumnos
	 */
	private static ArrayList<Alumno> alumnos = new ArrayList<>();

	/**
	 * Metodo que imprime los alumnos almacenados
	 */
	public static void imprimeAlumnos() {
		for (Alumno a : alumnos) {
			System.out.println(a);
		}
	}

	/**
	 * Metodo para añadadir alumno al conjunto
	 * 
	 * @param Objeto Alumno
	 * @return Devuelve un booleano true si se realiza con exito
	 */
	public static boolean añadirAlumno(Alumno a) {
		// Se añade un objeto alumno a alumnos
		return alumnos.add(a);
	}

	/**
	 * Metodo para modificar la nota de un alumno
	 * 
	 * @param a    Objeto Alumno del que se modificara
	 * @param nota Nota que estableceremos para el alumno
	 * @return Devuelve un booleano true si se realiza con exito
	 */
	public static boolean modificaAlumno(Alumno a, double nota) {
		boolean res = false;
		// Posicion del objeto Alumno dentro del conjunto
		int indice = alumnos.indexOf(a);
		if (indice >= 0) {
			// Obtenemos el objeto Alumnos de la lista posicionado en indice y le hacemos un
			// set de la nota
			alumnos.get(indice).setNotaMedia(nota);
			res = true;
		}
		return res;
	}

	/**
	 * Metodo para eliminar un alumno
	 * 
	 * @param a Objeto Alumno
	 * @return Devuelve un booleano true si se realiza con exito
	 */
	public static boolean borrarAlumno(Alumno a) {
		return alumnos.remove(a);
	}

	// IMPORTANTE!!!!!!! EL REMOVE FUNCIONA COMPARANDO MEDIANTE EL ATRIBUTO
	// ESTABLECIDO EN EQUALS, PARA BORRAR UN OBJETO, EL INTRODUCIDO COMO PARAMETRO
	// DE ENTRADA DEBE TENER EL MISMO ATRIBUTO ASIGNADO EN EL EQUALS!!!

}
