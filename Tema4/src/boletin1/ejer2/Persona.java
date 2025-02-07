package boletin1.ejer2;

/**
 * Clase que nos permite crear objetos personas y metodos para modificarlas
 */
public class Persona {
	/**
	 * Almacena el dni de la persona
	 */
	private int dni;
	/**
	 * Almacena el nombre de la persona
	 */
	private String nombre;
	/**
	 * Almacena los apellidos de la persona
	 */
	private String apellidos;
	/**
	 * Almacena la edad de la persona
	 */
	private int edad;
	
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
	
	/**
	 * Get para acceder al valro de nombre
	 * @return Devuelve el nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Set para modificar el valor de nombre
	 * @param nombre El nombre de la persona. No puede ser null ni cadena vacía.
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) this.nombre = nombre;
	}
	
	/**
	 * Get para acceder a los apellidos de la persona
	 * @return Devuelve los apellidos de la persona
	 */
	public String getApellidos() {
		return apellidos;
	}
	
	/**
	 * Set para modificar el valor de apellidos
	 * @param apellidos Los apellidos de la persona. No puede ser null ni cadena vacía
	 */
	public void setApellidos(String apellidos) {
		if (apellidos != null && !apellidos.isBlank()) this.apellidos = apellidos;
	}
	
	/**
	 * Get para acceder a la edad de la persona
	 * @return Devuelve la edad de la persona
	 */
	public int getEdad() {
		return edad;
	}
	
	/**
	 * Set para modificar el valor de edad
	 * @param edad La edad de la persona. Debe ser mayor a 0
	 */
	public void setEdad(int edad) {
		if (edad > 0) this.edad = edad;
	}
	
	/**
	 * Get para acceder al dni de la persona
	 * @return Devuelve el dni de la persona
	 */
	public int getDni() {
		return dni;
	}
	
	/**
	 * Devuelve true si es mayor de edad (false si no).
	 * @return booleano que es true si es mayor
	 */
	public boolean esMayorEdad(){
		boolean mayoriaEdad = false;
		// Si es mayor o igual que 18 la edad, es true el booleano
		if(this.edad >= 18) {
			mayoriaEdad = true;
		}
		return mayoriaEdad;
		
	}
	
	/**
	 * Devuelve true si tiene 65 años o más (false si no).
	 * @return booleano que es true si es jubilado
	 */
	public boolean esJubilado() {
		boolean jubilado = false;
		// Si es mayor o igual que 65 la edad, es true el booleano
		if(this.edad >= 65) {
			jubilado = true;
		}
		return jubilado;
	}
	
	//Devuelve la diferencia de edad entre ‘this’ y p.
	public int diferenciaEdad(Persona p) {
		// Almacena la diferencia de edades entre los dos objetos
		int diferencia;
		diferencia = Math.abs(this.edad - p.edad);
		return diferencia;
		
	}
	
	//Devuelve una cadena con la información del objeto: “DNI:... Nombre:... etc.”
	public String toString() {
		String info = "";
		
		info += "Dni: " + this.dni;
		info += " Nombre: " + this.nombre;
		info += " Apellidos: " + this.apellidos;
		info += " Edad: " + this.edad;
		
		return info;
	}

	
	
}
