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
		rec2 = new Rectangulo(2,2,4,8);
		
		// Mostrar coordenadas
		System.out.println(rec1);
		System.out.println(rec2);
		
		// Modificamos con setters las coordenadas
		rec1.setX1Y1(2, 4);
		rec2.setX2Y2(1, 0);
		System.out.println(rec2);
		rec2.setAll(1, 0, 10, 5);
		System.out.println(rec2);
		
		// Perimetro Rec1
		perimetro = rec1.getPerimetro();
		area = rec1.getArea();
		
		// Mostramos los resultados del rectangulo 1
		System.out.println("Perimetro rectangulo 1: " + perimetro);
		System.out.println("Area rectangulo 1: " + area);
		
		// Perimetro Rec2
		perimetro = rec1.getPerimetro();
		// Area Rec2
		area = rec2.getArea();
		
		// Mostramos los resultados del rectangulo 1
		System.out.println("Perimetro rectangulo 2: " + perimetro);
		System.out.println("Area rectangulo 2: " + area);
		
		
	}

}
