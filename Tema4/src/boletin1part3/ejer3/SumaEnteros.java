package boletin1part3.ejer3;

public class SumaEnteros {
	
	/**
	 * Metodo que suma los numeros de n hasta 1
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

}
