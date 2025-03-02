package boletin1part3.ejer4;

public class ParseToBoolean {
	/**
	 * Metodo que pasa un entero 0 o 1 a false o true
	 * @param arg Entero a pasar a booleano
	 * @return buleano Numero convertido a boolean
	 */
	public static boolean parseToBoolean(int arg) {
		boolean buleano = false;
		// Si no es 0, buleano es true
		if (arg != 0)
			buleano = true;
		return buleano;
	}
	
	/**
	 * Metodo que convierte un String true o false en su respectivo boolean
	 * @param arg String true o false
	 * @return buleano Boolean respectivo al String introducido
	 */
	public static boolean parseToBoolean(String arg) {
		boolean buleano = false;
		
		// Metodo de la clase Boolean que pasa un String a boolean
		buleano = Boolean.parseBoolean(arg);
		
		return buleano;
	}

}
