package boletin1.ejer1;
/**
 * Clase que nos permite crear puntos con coordenadas y metodos para modificarlos
 */
public class Punto { // Representa un punto de dos dimensiones en un plano
	/**
	 * Coordenada x
	 */
	private int x; 
	/**
	 * Coordenada y
	 */
	private int y; 
	
	/**
	 * Constructor que crea objeto punto de dos dimensiones en un plano
	 * @param x coordenada x
	 * @param y coordenada y
	 */
	public Punto(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Get para acceder al atributo x
	 * @return Devuelve el valor de x
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Get para acceder al atributo y
	 * @return Devuelve el valor de y
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Set para modificar el atributo x
	 * @param x Coordenada x
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * Set para modificar el atributo y
	 * @param y Coordenada y
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * Modifica ambas coordenadas
	 * @param x Coordenada x
	 * @param y Coordenada y
	 */
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Desplaza las coordenadas del punto
	 * @param dx
	 * @param dy
	 */
	public void desplaza(int   dx,   int   dy) {
		x += dx;
		y += dy;
	}
	
	/**
	 * Calcula la distancia entre el propio punto y otro pasado por parametro
	 * @param punto que vamos a comparar
	 * @return Devuelve la distancia
	 */
	public double distancia(Punto p) {
		// Almacena la distancia entre dos puntos
		double distancia;
		// Formula para calcular la distancia
		distancia = Math.sqrt(Math.pow((p.x - this.x),2)+Math.pow((p.y - this.y),2));
		return distancia;
	}
	
	/**
	 * Devuelve coordenadas
	 */
	public String toString() {
		// Almacena un String con las coordenadas
		String coordenadas;
		coordenadas = "(" + x + "," + y + ")";
		return coordenadas;
	}
	
	
}
