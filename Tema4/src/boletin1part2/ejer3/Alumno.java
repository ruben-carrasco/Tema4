package boletin1part2.ejer3;

public class Alumno {
	/**
	 * Atributo que almacena el nombre del alumno
	 */
	private String nombre = "";
	/**
	 * Atributo que almacena la nota media del alumno
	 */
	private double notaMedia = 0;
	
	/**
	 * Constructor con el nombre del alumno y su nota media
	 * @param nombre Nombre del alumno
	 * @param notaMedia Nota media que posee el alumno
	 */
	public Alumno(String nombre, double notaMedia) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (notaMedia >= 0) {
			this.notaMedia = notaMedia;
		}
	}
	
	/**
	 * Get para saber el nombre de la persona
	 * @return Devuelve el nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Set para cambiar el nombre del alumno
	 * @param nombre Nuevo nombre del alumno
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Get para saber su nota media
	 * @return Devuelve la nota media con decimales
	 */
	public double getNotaMedia() {
		return notaMedia;
	}
	
	/**
	 * Set para cambiar su nota media
	 * @param notaMedia Nueva nota media
	 */
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	
	/**
	 * Metodo toString para imprimir la información del alumno
	 */
	public String toString() {
		String res;
		res = nombre + " " + notaMedia;
		return res;
	}
	
	/**
	 * Metodo para saber si dos alumnos son iguales, devuelve true en caso de serlo
	 */
	public boolean equals(Object obj) {
		Alumno alum = (Alumno) obj;
		return this.nombre.equals(alum.nombre);
	}
	

}
