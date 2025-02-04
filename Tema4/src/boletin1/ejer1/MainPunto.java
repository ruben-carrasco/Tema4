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
		System.out.println(pun1.x + " " + pun1.y);
		System.out.println(pun2.x + " " + pun2.y);
		System.out.println(pun3.x + " " + pun3.y);
		
		// Modificar
		pun1.x += 1;
		pun1.y -= 1;
		
		pun2.x *= 2;
		pun2.y %= 2;
		
		pun3.x /= 3;
		
		System.out.println();
		
		// Mostrar coordenadas
		System.out.println(pun1.x + " " + pun1.y);
		System.out.println(pun2.x + " " + pun2.y);
		System.out.println(pun3.x + " " + pun3.y);
	
	}

}
