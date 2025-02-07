package boletin1.ejer4;

public class Articulo {
	// atributos: nombre, precio (sin IVA), iva (siempre será 21) y
	// cuantosQuedan (representa cuántos quedan en el almacén).
	private String nombre = "Por defecto";
	private double precio = 0;
	public final int IVA = 21;
	private int cuantosQuedan = 0;

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

	/**
	 * Obtiene el nombre del producto.
	 * 
	 * @return Nombre del producto.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Modifica el nombre del producto.
	 * 
	 * @param nombre Nuevo nombre del producto.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene el precio del producto.
	 * 
	 * @return Precio del producto.
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Modifica el precio del producto.
	 * 
	 * @param precio Nuevo precio del producto.
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	/**
	 * Obtiene la cantidad disponible del producto.
	 * 
	 * @return Cantidad disponible del producto.
	 */
	public int getCuantosQuedan() {
		return cuantosQuedan;
	}

	/**
	 * Modifica la cantidad disponible del producto.
	 * 
	 * @param cuantosQuedan Nueva cantidad disponible del producto.
	 */
	public void setCuantosQuedan(int cuantosQuedan) {
		this.cuantosQuedan = cuantosQuedan;
	}

	// Método getPVP que devuelva el precio de venta al público (PVP) con iva
	// incluido.
	public double getPVP() {
		double pvp;
		pvp = ((double) precio * IVA / 100) + precio;
		return pvp;
	}

	// Método getPVPDescuento que devuelva el PVP con un descuento pasado como
	// argumento.
	public double getPVPDescuento(int descuento) {
		double pvp;
		pvp = ((double) precio * IVA / 100) + precio;
		pvp
		return pvp;
	}

	// Método vender que actualiza los atributos del objeto tras vender una cantidad
	// ‘x’ (si esposible). Devolverá true si ha sido posible (false en caso
	// contrario).

	// Método almacenar que actualiza los atributos del objeto tras almacenar una
	// cantidad ‘x’.

	// Método toString() que devuelva la información del artículo por pantalla.

}
