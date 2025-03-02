package boletinCRUD.ejer3;

import java.util.Scanner;

public class MainPizza {
	/**
	 * Creamos el Scanner
	 */
	public static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		// Variables atributos del objeto
		int codigo; // Codigo de la pizza
		String tamaño; // Tamaño de la pizza
		String tipo; // Tipo de pizza

		// Opcion del menu
		String opc;

		do {
			// Mostramos el menu
			menu();
			// Pedimos una opcion al usuario
			System.out.println("Introduzca una opcion:");
			opc = reader.next().toLowerCase();
			
			// Switch con las opciones
			switch (opc) {
			case "a" -> {
				PizzaCRUD.imprimePizzas();
			}
			case "b" -> {
				// Pedimos el codigo
				codigo = pedirCodigo();
				reader.nextLine();
				// Pedimos el tamaño
				System.out.println("Introduzca el tamaño de la pizza: ");
				tamaño = reader.nextLine();
				// Pedimos el tipo
				System.out.println("Introduzca el tipo de pizza: ");
				tipo = reader.nextLine();
				// Creamos el objeto
				Pizza pizz = new Pizza(codigo, tamaño, tipo);
				// Agregamos la pizza
				System.out.println(PizzaCRUD.nuevoPedido(pizz) ? "Exito" : "Error");
			}
			case "c" -> {
				// Pedimos el codigo
				codigo = pedirCodigo();
				// Creamos el objeto
				Pizza pizz = new Pizza(codigo);
				// Cambiamos el estado
				System.out.println(PizzaCRUD.servida(pizz) ? "Exito" : "Error");
			}
			case "d" -> {
				System.out.println("Saliendo...");
			}
			default -> {
				System.out.println("Introduzca una opcion valida");
			}
			}

		} while (opc != "d");

		// Cerramos el Scanner
		reader.close();
	}

	/**
	 * Metodo para mostrar menu
	 */
	public static void menu() {
		System.out.println("PIZZERIA");
		System.out.println();
		System.out.println("a. Listado de pizzas");
		System.out.println("b. Nuevo pedido");
		System.out.println("c. Pizza servida");
		System.out.println("d. Salir");
	}

	/**
	 * Metodo para pedir codigo de pizza
	 * 
	 * @return codigo Codigo de la pizza introducido por el usuario
	 */
	public static int pedirCodigo() {
		int codigo;
		System.out.println("Introduzca el codigo de la pizza: ");
		codigo = reader.nextInt();
		return codigo;
	}
}
