package boletin1part2.ejer2;

public class Libro {
	/**
	 * Enumerado que almacena los diferentes generos
	 */
	enum Genero {
		NARRATIVO, LÍRICO, DRAMÁTICO, DIDÁCTICO, POÉTICO, DEFECTO
	}

	/**
	 * Atributo que almacena el titulo del libro
	 */
	private String titulo = "";
	/**
	 * Atributo que almacena el nombre del autor
	 */
	private String autor = "";
	/**
	 * Atributo que almacena el numero de ejemplares
	 */
	private int ejemplares = 0;
	/**
	 * Atributo que almacena el numero de ejemplares prestados
	 */
	private int prestados = 0;
	/**
	 * Atributo que almacena el genero del libro
	 */
	private Genero genero = Genero.DEFECTO;

	/**
	 * Constructor con el titulo y autor
	 * 
	 * @param titulo Titulo del libro
	 * @param autor  Autor del libro
	 */
	public Libro(String titulo, String autor) {
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
		if (autor != null && !titulo.isBlank()) {
			this.autor = autor;
		}
	}

	/**
	 * Constructor con el titulo, autor, ejemplares y prestados del libro
	 * 
	 * @param titulo     Titulo del libro
	 * @param autor      Autor del libro
	 * @param ejemplares Ejemplares del libro
	 * @param prestados  Ejemplares prestados del libro
	 */
	public Libro(String titulo, String autor, int ejemplares, int prestados) {
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
		if (autor != null && !titulo.isBlank()) {
			this.autor = autor;
		}
		if (ejemplares >= 0) {
			this.ejemplares = ejemplares;
		}
		if (prestados >= 0) {
			this.prestados = prestados;
		}
	}

	/**
	 * Constructor con el titulo, autor, ejemplares, prestados del libro y genero
	 * 
	 * @param titulo     Titulo del libro
	 * @param autor      Autor del libro
	 * @param ejemplares Ejemplares del libro
	 * @param prestados  Ejemplares prestados del libro
	 * @param genero     Genero del libro
	 */
	public Libro(String titulo, String autor, int ejemplares, int prestados, String genero) {
		genero = genero.toUpperCase();
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
		if (autor != null && !titulo.isBlank()) {
			this.autor = autor;
		}
		if (ejemplares >= 0) {
			this.ejemplares = ejemplares;
		}
		if (prestados >= 0) {
			this.prestados = prestados;
		}
		switch (genero) {
		case "NARRATIVO", "LÍRICO", "DRAMÁTICO", "DIDÁCTICO", "POÉTICO" -> {
			this.genero = Genero.valueOf(genero);
		}
		}
	}

	/**
	 * Get que nos devuelve el titulo del libro
	 * 
	 * @return Titulo del libro
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Get que nos devuelve el autor del libro
	 * 
	 * @return Autor del libro
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Get que nos devuelve los ejemplares del libro
	 * 
	 * @return Numero de ejemplares del libro
	 */
	public int getEjemplares() {
		return ejemplares;
	}

	/**
	 * Set para cambiar el numeros de ejemplares de un libro
	 * 
	 * @param ejemplares Numero de ejemplares
	 */
	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	/**
	 * Get que nos devuelve los prestados del libro
	 * 
	 * @return Numero de ejemplares prestados del libro
	 */
	public int getPrestados() {
		return prestados;
	}

	/**
	 * Set para cambiar el numeros de ejemplares prestados de un libro
	 * 
	 * @param prestados Numero de ejemplares prestados
	 */
	public void setPrestados(int prestados) {
		this.prestados = prestados;
	}

	/**
	 * Get que devuelve el genero del libro
	 * 
	 * @return Genero que tiene el libro
	 */
	public Genero getGenero() {
		return genero;
	}

	/**
	 * Set para cambiar el genero de un libro en caso de que no lo tenga asignado
	 * 
	 * @param genero
	 */
	public void setGenero(String genero) {
		genero = genero.toUpperCase();
		switch (genero) {
		case "NARRATIVO", "LÍRICO", "DRAMÁTICO", "DIDÁCTICO", "POÉTICO" -> {
			this.genero = Genero.valueOf(genero);
		}
		}
	}

	/**
	 * Metodo prestamo, resta a ejemplares el numero de libros que se van a prestar,
	 * si es mayor o igual a 0 se sacan de ejemplares y se añaden a prestados. El
	 * booleano que devuelve pasa a true
	 * 
	 * @param prestados Cantidad de libros que se prestarán
	 * @return exito Devuelve true en caso de que se haga el prestamo
	 */
	public boolean prestamo(int prestados) {
		boolean exito = false;
		if (this.ejemplares - prestados >= 0) {
			this.ejemplares -= prestados;
			this.prestados += prestados;
			exito = true;
		}
		return exito;
	}
	
	/**
	 * Metodo devolucion, resta a prestados el numero de libros que se van a devolver,
	 * si es mayor o igual a 0 se sacan de prestados y se añaden a ejemplares. El
	 * booleano que devuelve pasa a true
	 * @param devueltos Numero de libros que vamos a devolver
	 * @return exito Booleano que es true si se hace la devolucion
	 */
	public boolean devolucion(int devueltos) {
		boolean exito = false;
		if (this.prestados - devueltos >= 0) {
			this.prestados -= devueltos;
			this.ejemplares += devueltos;
			exito = true;
		}
		return exito;
	}

	/**
	 * Metodo toString que devuelve una cadena con la información del libro
	 */
	public String toString() {
		String res;

		res = "Titulo: " + titulo + "\n";
		res += "Autor: " + autor + "\n";
		res += "Ejemplares: " + ejemplares + "\n";
		res += "Prestados: " + prestados + "\n";
		res += "Genero: " + genero + "\n";

		return res;
	}

	/**
	 * Metodo que nos compara si dos libros son iguales, lo son si el titulo y autor
	 * coincide en ambos
	 */
	public boolean equals(Object obj) {
		boolean itEquals = false;
		Libro book = (Libro) obj;
		if (this.titulo == book.titulo && this.autor == book.autor) {
			itEquals = true;
		}
		return itEquals;
	}

}
