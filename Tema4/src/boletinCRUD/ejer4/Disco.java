package boletinCRUD.ejer4;

import java.util.Objects;

/**
 * Clase Disco que almacenara discos con sus atributos
 */
public class Disco {

	enum Genero {
		ROCK, POP, JAZZ, BLUES
	}

	/**
	 * Codigo del disco
	 */
	int codigo;

	/**
	 * Autor del disco
	 */
	String autor = "Sin autor";

	/**
	 * Titulo del disco
	 */
	String titulo = "Sin titulo";

	/**
	 * Duracion del disco
	 */
	int duracion = 0;

	/**
	 * Genero del disco
	 */
	Genero genero;

	/**
	 * Constuctor con solo el codigo
	 * 
	 * @param codigo Codigo del disco
	 */
	public Disco(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * Constructor con todos los atributos de un disco
	 * 
	 * @param codigo   Codigo del disco
	 * @param autor    Autor del disco
	 * @param titulo   Titulo del disco
	 * @param duracion Duracion del disco
	 * @param genero   Genero del disco
	 */
	public Disco(int codigo, String autor, String titulo, int duracion, String genero) {
		genero = genero.toUpperCase();
		if (codigo > 0) {
			this.codigo = codigo;
		}
		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
		if (duracion > 0) {
			this.duracion = duracion;
		}
		switch (genero) {
		case "ROCK", "POP", "JAZZ", "BLUES" -> this.genero = Genero.valueOf(genero);
		}
	}

	/**
	 * Getter para obtener el codigo de un disco
	 * 
	 * @return codigo Codigo del disco
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Getter para obtener el autor de un disco
	 * 
	 * @return autor Autor del disco
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Getter para obtener el titulo del disco
	 * 
	 * @return titulo Titulo del disco
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Getter para obtener la duracion del disco
	 * 
	 * @return duracion Duracion del disco
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * Getter para obtener el genero de un disco
	 * 
	 * @return genero Genero del disco
	 */
	public Genero getGenero() {
		return genero;
	}

	/**
	 * Metodo toString
	 */
	public String toString() {
		String res = "";
		res = "Disco -> Autor: " + autor + " Titulo: " + titulo + " Duracion: " + duracion + " Genero: " + genero;
		return res;
	}

	/**
	 * Método equals
	 */
	public boolean equals(Object obj) {
		Disco dis = (Disco) obj;
		return this.codigo == dis.codigo;
	}
	
	/**
	 * Generamos un hashCode para el codigo del disco
	 */
	public int hashCode() {
		return Objects.hash(codigo);
	}
}
