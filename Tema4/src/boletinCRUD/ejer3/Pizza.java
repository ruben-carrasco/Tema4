package boletinCRUD.ejer3;

public class Pizza {
	/**
	 * Enum que almacena los distintos tamaños
	 */
	enum Tamaño {
		MEDIANA, FAMILIAR
	}

	/**
	 * Enum que almacena los distintos tipos
	 */
	enum Tipo {
		MARGARITA, CUATRO_QUESOS, FUNGHI
	}

	/**
	 * Enum que almacena los distintos estados
	 */
	enum Estado {
		PEDIDA, SERVIDA
	}

	/**
	 * Atributo que almanena el codigo para cada pizza
	 */
	private int codigo;

	/**
	 * Atributo que almacena el tamaño de la pizza
	 */
	private Tamaño tamaño;

	/**
	 * Atributo que almacena el tipo de pizza
	 */
	private Tipo tipo;

	/**
	 * Atributo que almacena el estado de la pizza
	 */
	private Estado estado = Estado.PEDIDA;
	
	/**
	 * Constructor solo con el codigo
	 * @param codigo
	 */
	public Pizza(int codigo) {
		this.codigo = codigo;
	}
	
	/**
	 * Constructor con codigo, tamaño y tipo de la pizza
	 * 
	 * @param codigo Codigo de al pizza
	 * @param tamaño Tamaño de la pizza
	 * @param tipo   Tipo de la pizza
	 */
	public Pizza(int codigo, String tamaño, String tipo) {
		tamaño = tamaño.toUpperCase();
		tipo = tipo.toUpperCase();
		if (codigo >= 0) {
			this.codigo = codigo;
		}
		switch (tamaño) {
		case "MEDIANA", "FAMILIAR" -> this.tamaño = Tamaño.valueOf(tamaño);
		}
		switch (tipo) {
		case "MARGARITA", "CUATRO_QUESOS", "FUNGHI" -> this.tipo = Tipo.valueOf(tipo);
		}
	}

	/**
	 * Get para saber el estado
	 * 
	 * @return Devuelve el estado de la pizza
	 */
	public Estado getEstado() {
		return estado;
	}

	/**
	 * Set para cambiar el estado
	 * 
	 * @param estado Nuevo estado de la pizza
	 */
	public void setEstado(String estado) {
		if (estado.equals("SERVIDA")) {
			this.estado = Estado.SERVIDA;
		}
	}
	
	/**
	 * Get para saber el codigo de la pizza
	 * @return Codigo de la pizza numerico
	 */
	public int getCodigo() {
		return codigo;
	}
	
	/**
	 * Get para saber el tamaño de la pizza
	 * @return Tamaño de la pizza
	 */
	public Tamaño getTamaño() {
		return tamaño;
	}
	
	/**
	 * Get para saber el tipo de la pizza
	 * @return Devuelve el tipo de la pizza
	 */
	public Tipo getTipo() {
		return tipo;
	}
	
	/**
	 * Metodo toString que devuelve la info de la pizza en cadena
	 */
	public String toString() {
		String res;
		res = codigo + ": " + tamaño + " - " + tipo + " - " + estado; 
		return res;
	}
	
	/**
	 * Metodo equals
	 */
	public boolean equals(Object obj) {
		Pizza pizz = (Pizza) obj;
		return this.codigo == pizz.codigo;
	}

}
