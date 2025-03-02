package boletinCRUD.ejer4;

import java.util.HashSet;

public class DiscoCRUD {
	/**
	 * Coleccion que almacena los objetos Disco
	 */
	private static HashSet<Disco> discos = new HashSet<Disco>();

	/**
	 * Funcion para listar los discos
	 */
	public static void listarDiscos() {
		for (Disco disco : discos) {
			System.out.println(disco);
			System.out.println("----------------------");
		}
	}

	/**
	 * Funcionm para agregar objeto Disco al conjunto
	 * 
	 * @param disco Disco a agregar
	 * @return boolean true si se conside agregar
	 */
	public static boolean nuevoDisco(Disco disco) {
		return discos.add(disco);
	}

	/**
	 * Funcio para eliminar un disco del conjunto
	 * 
	 * @param disco Disco a eliminar
	 * @return boolean true si se conside agregar el disco o false si no
	 */
	public static boolean borrarDisco(Disco disco) {
		return discos.remove(disco);
	}
}