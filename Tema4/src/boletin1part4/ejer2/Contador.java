package boletin1part4.ejer2;

public class Contador {
	/**
	 * Contador de la clase que se incrementará, decrementará
	 */
	private int cont;
	
	/**
	 * Constructor para establecer el entero con el que se 
	 * inicializa el contador
	 * 
	 * @param cont Numero con el que se inicializa el
	 *  contador al ser creado
	 */
	public Contador(int cont) {
		if (cont >= 0) {
			this.cont = cont;
		}
	}

	/**
	 * @return devuelve cont con el valor actual del contador
	 */
	public int getCont() {
		return cont;
	}

	/**
	 * @param cont valor nuevo que estableceremos al contador
	 */
	public void setCont(int cont) {
		if (cont >= 0) {
			this.cont = cont;
		}
	}
	
	/**
	 * Metodo que incrementa el objeto contador en 1 unidad
	 */
	public void incrementar() {
		this.cont++;
	}
	
	/**
	 * Metodo que decrementa el objeto contador en 1 unidad
	 * no permite que sea negativo
	 */
	public boolean decrementar() {
		boolean res = false;
		if (this.cont != 0) {
			this.cont--;
			res = true;
		}
		return res;
		
	}
	
	

}
