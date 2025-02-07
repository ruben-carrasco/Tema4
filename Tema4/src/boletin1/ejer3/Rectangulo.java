package boletin1.ejer3;

public class Rectangulo {
	// Coordenadas del rectangulo
	private int x1 = 0;
	private int y1 = 0;
	private int x2 = 0;
	private int y2 = 0;

	/**
	 * 
	 * @param x1 coordenada x1
	 * @param y1 coordenada y1
	 * @param x2 coordenada x2
	 * @param y2 coordenada y2
	 */
	Rectangulo(int x1, int y1, int x2, int y2) {
		if (x1 < x2 && y1 < y2) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}
	}

	/**
	 * @return Devuelve la coordenada x1.
	 */
	public int getX1() {
		return x1;
	}

	/**
	 * Modifica la coordenada x1.
	 * 
	 * @param x1 Nueva coordenada x1 del rectángulo.
	 */
	public void setX1(int x1) {
		if (x1 < x2)
			this.x1 = x1;
	}

	/**
	 * @return Devuelve la coordenada y1.
	 */
	public int getY1() {
		return y1;
	}

	/**
	 * Modifica la coordenada y1.
	 * 
	 * @param y1 Nueva coordenada y1 del rectángulo.
	 */
	public void setY1(int y1) {
		if (y1 < y2)
			this.y1 = y1;
	}

	/**
	 * @return Devuelve la coordenada x2.
	 */
	public int getX2() {
		return x2;
	}

	/**
	 * Modifica la coordenada x2.
	 * 
	 * @param x2 Nueva coordenada x2 del rectángulo.
	 */
	public void setX2(int x2) {
		if (x2 > x1)
			this.x2 = x2;
	}

	/**
	 * @return Devuelve la coordenada y2.
	 */
	public int getY2() {
		return y2;
	}

	/**
	 * Modifica la coordenada y2.
	 * 
	 * @param y2 Nueva coordenada y2 del rectángulo.
	 */
	public void setY2(int y2) {
		if (y2 > y1)
			this.y2 = y2;
	}
	
	/**
	 * Establecer coordenadas x1 e y1
	 * @param x1 Coordenada x1
	 * @param y1 Coordenada y1
	 */
	public void setX1Y1(int x1, int y1) {
		this.x1 = x1;
		this.y1 = y1;
	}
	
	/**
	 * Establecer coordenadas x2 e y2
	 * @param x2 Coordenada x2
	 * @param y2 Coordenada y2
	 */
	public void setX2Y2(int x2, int y2) {
		this.x2 = x2;
		this.y2 = y2;
	}
	
	/**
	 * Establecer todas las coordenadas
	 * @param x1 Coordenada x1
	 * @param y1 Coordenada y1
	 * @param x2 Coordenada x2
	 * @param y2 Coordenada y2
	 */
	public void setAll(int x1, int y1,int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	/**
	 * Devuelve el perimetro
	 * @return Perimetro del rectangulo
	 */
	public int getPerimetro() {
		// Almacena perimetro
		int perimetro;
		// Calculo perimetro
		perimetro = 2 * (Math.abs(x2 - x1) + Math.abs(y2 - y1));	
		return perimetro;
	}
	
	public int getArea() {
		// Almacena are
		int area;
		// Calculo de area
		area = Math.abs(x2 - x1) * Math.abs(y2 - y1);
		return area;
	}
	
	/**
	 * Devuelve la info del rectangulo
	 */
	public String toString() {
		// Almacena la informacion
		String info;
		
		info = "Coordenadas rectangulo: (" + x1 + "," + y1 + ")" + "(" + x2 + "," + y2 + ")";
		
		return info;
	}
	

}
