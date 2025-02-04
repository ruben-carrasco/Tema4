package boletin1.ejer3;

public class Rectangulo {
	// Coordenadas del rectangulo
	int x1 = 0; 
	int y1 = 0; 
	int x2 = 0; 
	int y2 = 0;
	
	/**
	 * 
	 * @param x1 coordenada x1
	 * @param y1 coordenada y1
	 * @param x2 coordenada x2
	 * @param y2 coordenada y2
	 */
	Rectangulo(int x1, int y1, int x2, int y2){
		if(x1 < x2 && y1 < y2) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y1 = y1;
		} 
	}
	
}
