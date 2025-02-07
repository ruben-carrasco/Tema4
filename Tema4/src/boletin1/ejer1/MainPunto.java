package boletin1.ejer1;

public class MainPunto {
	public static void main(String[] args) {
		// Creamos los objetos
		Punto pun1;
		Punto pun2;
		Punto pun3;
		
		//Coordendas pun1
		pun1 = new Punto(5,0);
		//Coordendas pun2
		pun2 = new Punto(10,10);
		//Coordendas pun3
		pun3 = new Punto(-3,7);
		
		// Mostrar coordenadas
		System.out.println(pun1);
		System.out.println(pun2);
		System.out.println(pun3);
		
		// Modificar
		pun1.setX(pun1.getX() + 1);
		pun1.setY(pun1.getY() - 1);
		
		pun2.setX(pun2.getX() * 2);
		pun2.setY(pun2.getY() / 1);
		
		pun3.setX(pun3.getX() / 3);
		
		System.out.println();
		
		// Mostrar coordenadas
		System.out.println(pun1);
		System.out.println(pun2);
		System.out.println(pun3);
		
		System.out.println();
		
		// Metodo para modificar coordenadas
		pun1.setXY(1, 0);
		System.out.println(pun1);
		// Desplazar coordenadas
		pun1.desplaza(2, 6);
		System.out.println(pun1);
		// Calcular distancia
		System.out.println(pun1.distancia(pun3));
	
	}

}
