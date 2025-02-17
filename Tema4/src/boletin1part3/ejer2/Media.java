package boletin1part3.ejer2;

public class Media {
	/**
	 * Metodo que da la media dos numeros enteros
	 * 
	 * @param num1 Primer numero
	 * @param num2 Segundo numero
	 * @return media La media de ambos
	 */
	public static double media(int num1, int num2) {
		// Almacena la media
		double media = 0;

		// mediamos y almacenamos en variable
		media = (double) (num1 + num2) / 2;

		// Devolvemos la media
		return media;
	}

	/**
	 * Metodo que da la media tres numeros enteros
	 * 
	 * @param num1 Primer numero
	 * @param num2 Segundo numero
	 * @return media La media de todos
	 */
	public static double media(int num1, int num2, int num3) {
		// Almacena la media
		double media = 0;

		// mediamos y almacenamos en variable
		media = (double) (num1 + num2 + num3) / 3;

		// Devolvemos la media
		return media;
	}

}
