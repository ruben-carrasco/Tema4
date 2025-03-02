package boletin1part3.ejer5;

import java.util.Random;

public class NumerosAleatorios {

	/**
	 * Metodo que imprime una cantidad de numeros random entre 0 y 1
	 * 
	 * @param cantidadRand Cantidad de numros que se imprimiran
	 */
	public static void numerosAleatorios(int cantidadRand) {
		int cont = 0;
		while (cont < cantidadRand) {
			System.out.println(Math.random()); // Imprime un numero random entre 0 y 1
			cont++;
		}
	}
	
	/**
	 * Metodo que imprime por pantalla una cantidad de numeros random enteros entre 0 y otro
	 * introducido por el usuario incluido
	 * @param cantidad Cantidad de numeros a imprimer
	 * @param valorMax Valor maximo que tomara un numero
	 */
	public static void numerosAleatorios(int cantidad, int valorMax) {
		// Creamos un objeto random
		Random rand = new Random();
		int cont = 0;
		while (cont < cantidad) {
			System.out.println(rand.nextInt(0, valorMax + 1)); // Imprime un numero random entre 0 y valorMax incluido
			cont++;
		}
	}
	
	/**
	 * Metodo que imprime por pantalla una cantidad de numeros random enteros entre un valor min y otro max
	 * introducidos por el usuario incluido
	 * @param cantidad Cantidad de numeros a imprimer
	 * @param valorMin Valor minimo que tomara un numero
	 * @param valorMax Valor maximo que tomara un numero
	 */
	public static void numerosAleatorios(int cantidad, int valorMin, int valorMax) {
		// Creamos un objeto random
		Random rand = new Random();
		int cont = 0;
		while (cont < cantidad) {
			System.out.println(rand.nextInt(valorMin, valorMax + 1)); // Imprime un numero random entre valorMin y valorMax incluido
			cont++;
		}
	}
}
