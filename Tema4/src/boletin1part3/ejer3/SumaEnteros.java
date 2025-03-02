package boletin1part3.ejer3;

public class SumaEnteros {

	/**
	 * Metodo que suma los numeros de n hasta 1
	 * 
	 * @param numero Numero hasta el que sumamos
	 * @return suma Se devuelve la Suma
	 */
	public static int sumaEnteros(int numero) {
		// Almacena la suma
		int suma = 0;
		// Caso base: Cuando el numero es 1, la suma es 1
		if (numero == 1) {
			suma = 1;
			// Formula
		} else {
			suma = numero + sumaEnteros(numero - 1);
		}

		// Se devuelve
		return suma;
	}

	/**
	 * Metodo que suma todos los numeros comprendidos entre num1 y num2
	 * 
	 * @param num1 Primer numero del rango
	 * @param num2 Ultimo numero del rango
	 * @return suma Suma de los numeros comprendidos entre num1 y num2
	 */
	public static int sumaEnteros(int num1, int num2) {
		// Almacena la suma
		int suma = 0;

		// Caso base: Cuando el numero es el ultimo, la suma es el ultimo numero
		if (num1 == num2) {
			suma = num2;
		} else { // Formula
			suma = num1 + sumaEnteros(num1 - 1, num2);
		}
		// Devuelve la suma
		return suma;
	}

}
