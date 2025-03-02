package boletin1part3.ejer6;

public class FuncionesMatematicas {
	/**
	 * Realiza el sumatorio de numero (suma de todos los numeros entre 1 y n)
	 * 
	 * @param numero Numero del que realizaremos el sumatorio
	 * @return suma El sumatorio de numero
	 */
	public static int sumatorio(int numero) {
		int suma = 0;
		if (numero == 1) {
			suma = 1;
		} else {
			suma = numero + sumatorio(numero - 1);
		}
		return suma;
	}

	/**
	 * Realiza la potencia de un numero de forma recursiva
	 * 
	 * @param a Base
	 * @param n Exponente
	 * @return potencia Resultado de la potencia
	 */
	public static double potencia(double a, int n) {
		double potencia = 0;
		if (n == 0) {
			potencia = 1;
		} else {
			potencia = 2 * potencia(2, n - 1);
		}
		return potencia;
	}
	
	/**
	 * Realiza la serie Fibonacci de un numero
	 * @param numero Numero del que se realiza
	 * @return fibonacci Resultado de la sucesion
	 */
	public static int serieFibonacci(int numero) {
		int fibonacci = 0;
		if (numero == 0) {
			fibonacci = 1;
		} else if (numero == 1) {
			fibonacci = 1;
		} else {
			fibonacci = serieFibonacci(numero - 1) + serieFibonacci(numero - 2);
		}
		return fibonacci;
	}

}
