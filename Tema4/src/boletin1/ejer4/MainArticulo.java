package boletin1.ejer4;

import java.util.Scanner;

public class MainArticulo {
	public static void main(String[] args) {
		Articulo art1;
		Articulo art2;
		Articulo art3;
		Articulo art4;
		int descuento;

		Scanner sc = new Scanner(System.in);

		// Asignar valores a los atributos
		art1 = new Articulo("Manzana", 3, 20);
		art2 = new Articulo("Pera", -3, -4);
		art3 = new Articulo("", 3, 40);
		art4 = new Articulo(null, 3, 40);

		// Resultados
		resultado(art1, 20);
		resultado(art2, 10);
		resultado(art3, 30);
		resultado(art4, 5);

		// Vender articulos
		art1.vender(2);
		resultado(art1, 20);

		// Añadir articulos
		art2.almacenar(5);
		resultado(art2, 10);
	}

	/**
	 * Funcion que muestra los resultados
	 * 
	 * @param nombre del producto
	 * @param precio del producto
	 * @param iva    del producto
	 */
	public static void resultado(Articulo art, int descuento) {

		// Mostrar info del producto
		System.out.println("Info del producto: ");
		System.out.println(art);

		// Calculamos el pvp
		System.out.println("El PVP de " + art.getNombre() + " es: " + art.getPVP());

		// Calcular descuento
		System.out.println("El PVP con descuento de " + art.getNombre() + " es: " + art.getPVPDescuento(descuento));
		System.out.println();
	}

}
