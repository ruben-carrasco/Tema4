package boletin1.ejer3;

public class MainRectangulo {
	public static void main(String[] args) {
		Rectangulo rec1;
		Rectangulo rec2;
		int perimetro;
		int area;
		
		// Asignamos coordenadas
		rec1 = new Rectangulo(0,0,5,5);
		
		// Rectangulo 2
		rec2 = new Rectangulo(7,9,2,3);
		
		// Mostrar coordenadas
		System.out.println("Coordenadas rectangulo 1: " + "("+rec1.x1+","+rec1.y1+")" + "("+rec1.x2+","+rec1.y2+")");
		System.out.println("Coordenadas rectangulo 2: " + "("+rec2.x1+","+rec2.y1+")" + "("+rec2.x2+","+rec2.y2+")");
		
		// Perimetro Rec1
		perimetro = 2 * (Math.abs(rec1.x2 - rec1.x1) + Math.abs(rec1.y2 - rec1.y1));	
		// Area Rec2
		area = Math.abs(rec1.x2 - rec1.x1) * Math.abs(rec1.y2 - rec1.y1);
		
		// Mostramos los resultados del rectangulo 1
		System.out.println("Perimetro rectangulo 1: " + perimetro);
		System.out.println("Area rectangulo 1: " + area);
		
		// Perimetro Rec2
		perimetro = 2 * (Math.abs(rec2.x2 - rec2.x1) + Math.abs(rec2.y2 - rec2.y1));	
		// Area Rec2
		area = Math.abs(rec2.x2 - rec2.x1) * Math.abs(rec2.y2 - rec2.y1);
		
		// Mostramos los resultados del rectangulo 1
		System.out.println("Perimetro rectangulo 2: " + perimetro);
		System.out.println("Area rectangulo 2: " + area);
		
		
	}

}
