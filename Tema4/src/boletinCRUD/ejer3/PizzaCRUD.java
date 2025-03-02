package boletinCRUD.ejer3;

import java.util.ArrayList;

public class PizzaCRUD {
	/**
	 * Lista que almacena las objetos Pizza
	 */
	private static ArrayList<Pizza> pizzas = new ArrayList<>();
	
	/**
	 * Funcion para mostrar el listado de las pizzas
	 */
	public static void imprimePizzas() {
		for(Pizza pizza : pizzas) {
			System.out.println(pizza);
		}
	}
	
	/**
	 * Funcion para añadir una pizza a la lista
	 * @param piz Objeto Pizza a agregar
	 * @return boolean que es true si de agrega y false si no
	 */
	public static boolean nuevoPedido(Pizza piz) {
		return pizzas.add(piz);
	}
	
	/**
	 * Funcion para poner el estado de una pizza en servida si existe
	 * @param piz Objeto Pizza del que se realizara el cambio
	 * @return boolean que es true si se cambia el estado
	 */
	public static boolean servida(Pizza piz) {
		boolean res = false;
		int indice = pizzas.indexOf(piz);
		if (indice >= 0) {
			pizzas.get(indice).setEstado("SERVIDA");
			res = true;
		}
		return res;
	}
}
