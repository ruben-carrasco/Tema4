package boletin1.ejer2;

// Clase persona
public class Persona {
	// Atributos
	int dni;
	String nombre;
	String apellidos;
	int edad;
	
	/**
	 * Constructor para objetos Persona
	 * @param dni de la persona
	 * @param nombre de la persona 
	 * @param apellidos de la persona 
	 * @param edad de la persona
	 */
	Persona(int dni,String nombre,String apellidos,int edad){
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
}
