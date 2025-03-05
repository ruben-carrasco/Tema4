package boletin1part4.ejer1;

public class Hora {
	/**
	 * Atributo que almacena la hora
	 */
	private int hora;
	
	/**
	 * Atributo que almacena el minuto
	 */
	private int minuto;
	
	/**
	 * Atributo que almacena el segundo
	 */
	private int segundo;

	/**
	 * Constructor con todos los atributos
	 * @param hora hora de la hora
	 * @param minuto minuto de la hora
	 * @param segundo segundo de la hora
	 */
	public Hora(int hora, int minuto, int segundo) {
		if (hora < 24) {
			this.hora = hora;
		}
		if (minuto < 60) {
			this.minuto = minuto;
		}
		if (segundo < 60) {
			this.segundo = segundo;
		}
	}
	
	/**
	 * @return Devuelve la hora
	 */
	public int getHora() {
		return hora;
	}

	/**
	 * @param hora La hora que se va a establecer
	 */
	public void setHora(int hora) {
		this.hora = hora;
	}

	/**
	 * @return Devuelve el minuto
	 */
	public int getMinuto() {
		return minuto;
	}

	/**
	 * @param minuto el minuto que se va a establecer
	 */
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	/**
	 * @return devuelve el segundo
	 */
	public int getSegundo() {
		return segundo;
	}

	/**
	 * @param segundo el segundo que se va a establecer
	 */
	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
	/**
	 * Metodo para incrementar un segundo
	 */
	public void incrementaSegundo() {
		this.segundo++;
		
		if (this.segundo == 60) {
			this.segundo = 0;
			this.minuto++;
			if (this.minuto == 60) {
				this.minuto = 0;
				this.hora++;
				if (this.hora == 24) {
					this.hora = 0;
				}
			}
		}
		
		
	}
	
	
	
	

}
