package boletinCRUD.ejer2;

import java.util.ArrayList;

public class ArticuloCRUD {
	/**
	 * Atributo que almacena un listado de los articulos
	 */
	private static ArrayList<Articulo> articulos = new ArrayList<>();
	
	/**
	 * Metodo que lista los articulos
	 */
	public static void listarArticulos() {
		for (Articulo art : articulos) {
			System.out.println(art);
		}
	}
	
	/**
	 * Metodo para añadir un articulo al listado
	 * 
	 * @param art Articulo a añadir
	 */
	public static boolean altaArticulo(Articulo art) {
		return articulos.add(art);
	}

	/**
	 * Metodo para eliminar un articulo al listado
	 * 
	 * @param art Articulo a eliminar
	 */
	public static boolean bajaArticulo(Articulo art) {
		return articulos.remove(art);
	}

	/**
	 * Funcion que modifica el precio de un articulo
	 * 
	 * @param art
	 * @param precio
	 * @return
	 */
	public static boolean modificarArticulo(Articulo art, double precio) {
		boolean res = false;
		int indice = articulos.indexOf(art);
		if (indice >= 0) {
			articulos.get(indice).setPrecio(precio);
			res = true;
		}
		return res;
	}
	
	/**
	 * Funcion que almacena stock de un determinado articulo
	 * @param art
	 * @param cantidad
	 * @return
	 */
	public static boolean entradaMercancia(Articulo art, int cantidad) {
		boolean res = false;
		int indice = articulos.indexOf(art);
		if (indice >= 0) {
			articulos.get(indice).almacenar(cantidad);
			res = true;
		}
		return res;
	}
	
	/**
	 * Funcion que saca mercancia de determinado articulo
	 * @param art
	 * @param cantidad
	 * @return
	 */
	public static boolean salidaMercancia(Articulo art, int cantidad) {
		boolean res = false;
		int indice = articulos.indexOf(art);
		if (indice >= 0) {
			res = articulos.get(indice).vender(cantidad);
		}
		return res;
	}

}
