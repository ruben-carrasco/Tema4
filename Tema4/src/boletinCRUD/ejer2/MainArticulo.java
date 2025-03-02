package boletinCRUD.ejer2;

import java.util.Scanner;

public class MainArticulo {
	/**
	 * Objeto Scanner
	 */
	public static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		// Variables para almacenar los datos del arituculo
		String nombre; // Nombre del articulo
		double precio; // Precio del articulo
		int stock; // Stock del articulo
		// Variable que almacen la cantidad de stock a añadir o sacar.
		int cantidadMer;
		// Variable que almacena la opcion del menu
		String opc;

		// Bucle para el menu
		do {
			// Imprimimos el menu
			menu();
			// Pedimos al usuario una opcion del menu
			System.out.println("Introduzca una opcion: ");
			opc = reader.next().toLowerCase();
			
			// Limpiamos Buffer
			reader.nextLine();

			// Switch con las distintas opciones
			switch (opc) {
			case "a" -> {
				ArticuloCRUD.listarArticulos();
			}
			case "b" -> {
				// Pedimos el nombre del articulos
				nombre = pedirNombre();
				// Pedimos el precio
				System.out.println("Introduzca el precio del articulo: ");
				precio = reader.nextInt();
				// Pedimos el Stock
				System.out.println("Introduzca el stock del articulo: ");
				stock = reader.nextInt();
				// Creamos el Articulo
				Articulo art = new Articulo(nombre, precio, stock);
				// Lo añadimos
				System.out.println(ArticuloCRUD.altaArticulo(art) ? "Exito" : "Error");
				;
			}
			case "c" -> {
				// Pedimos el nombre del articulos
				nombre = pedirNombre();
				// Creamos el Articulo
				Articulo art = new Articulo(nombre);
				// Lo eliminamos
				System.out.println(ArticuloCRUD.bajaArticulo(art) ? "Exito" : "Error");
				;
			}
			case "d" -> {
				// Pedimos el nombre del articulos
				nombre = pedirNombre();
				// Pedimos el precio
				System.out.println("Introduzca el precio del articulo: ");
				precio = reader.nextInt();
				// Creamos el Articulo
				Articulo art = new Articulo(nombre);
				// Lo modificamos
				System.out.println(ArticuloCRUD.modificarArticulo(art, precio) ? "Exito" : "Error");
				;
			}
			case "e" -> {
				// Pedimos el nombre del articulos
				nombre = pedirNombre();
				// Pedimos el Stock
				System.out.println("Introduzca la entrada de mercancia del articulo: ");
				cantidadMer = reader.nextInt();
				// Creamos el Articulo
				Articulo art = new Articulo(nombre);
				// Añadimos la mercancia
				System.out.println(ArticuloCRUD.entradaMercancia(art, cantidadMer) ? "Exito" : "Error");
			}
			case "f" -> {
				// Pedimos el nombre del articulos
				nombre = pedirNombre();
				// Pedimos el Stock a sacar
				System.out.println("Introduzca la salida de mercancia del articulo: ");
				cantidadMer = reader.nextInt();
				// Creamos el Articulo
				Articulo art = new Articulo(nombre);
				// Sacamos la mercancia
				System.out.println(ArticuloCRUD.salidaMercancia(art, cantidadMer) ? "Exito" : "Error");
			}
			case "g" -> {
				System.out.println("Saliendo...");
			}
			default -> {
				System.out.println("Introduzca una opcion valida");
			}
			}

		} while (!opc.equals("g"));

		// Cierro el Scanner
		reader.close();
	}

	/**
	 * Metodo para imprimir el menu
	 */
	public static void menu() {
		System.out.println("GESTISIMAL");
		System.out.println();
		System.out.println("a. Listado");
		System.out.println("b. Alta");
		System.out.println("c. Baja");
		System.out.println("d. Modificacion");
		System.out.println("e. Entrada de mercancia");
		System.out.println("f. Salida de mercancia");
		System.out.println("g. Salir");
	}

	/**
	 * Metodo para pedir el nombre de un articulo
	 * 
	 * @return Devuelve el nombre de un articulo
	 */
	public static String pedirNombre() {
		String nombre;
		System.out.println("Introduzca el nombre del articulo: ");
		nombre = reader.nextLine();
		return nombre;
	}

}
