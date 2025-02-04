package boletin1.ejer4;

public class Articulo {
	// atributos: nombre, precio (sin IVA), iva (siempre será 21) y
	// cuantosQuedan (representa cuántos quedan en el almacén).
	String nombre = "Por defecto";
	int precio = 0;
	final int IVA = 21;
	int cuantosQuedan = 0;

	/**
	 * 
	 * @param nombre  Nombre del articulo
	 * @param precio  Precio del articulo
	 * @param cuantos Quedan stock del aritulo
	 */
	Articulo(String nombre, int precio, int cuantosQuedan) {
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
		
		if (precio >= 0) {
			this.precio = precio;
		} 
		
		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = precio;
		} 	

	}
}
