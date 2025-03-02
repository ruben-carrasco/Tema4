package boletinCRUD.ejer4;

import java.util.Scanner;

public class MainDisco {
	public static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		// Creo un objeto CRUD
		DiscoCRUD discos = new DiscoCRUD();
		// Creo una variable para almacenar la opción seleccionada por el usuario
		int opc;
		// Variables para los atributos de un objetos disco.
		int codigo; // Codigo del disco
		String autor; // Autor del disco
		String titulo; // Titulo del disco
		int duracion; // Duracion del disco
		String genero; // Genero del disco

		do {
			// Muestro el menu
			menu();
			// Pido una opcion al usuario
			System.out.println("Introduzca una opcion: ");
			opc = reader.nextInt();
			// Reinicio el buffer
			reader.nextLine();

			// Switch con las opciones
			switch (opc) {
			case 1 -> discos.listarDiscos();
			case 2 -> {
				// Se pide el codigo
				codigo = pedirCodigo();
				// Se pide el autor
				System.out.println("Introduzca el autor:");
				autor = reader.nextLine();
				// Se pide el titulo
				System.out.println("Introduzca el titulo:");
				titulo = reader.nextLine();
				// Se pide la duracion
				System.out.println("Introduzca la duracion:");
				duracion = reader.nextInt();
				reader.nextLine();
				// Se pide el genero
				System.out.println("Introduzca el genero:");
				genero = reader.nextLine();
				// Creo el objeto
				Disco dis = new Disco(codigo, autor, titulo, duracion, genero);
				// Agrego el disco
				System.out.println(DiscoCRUD.nuevoDisco(dis) ? "Exito" : "Error");
			}

			case 3 -> {
				// Pido el codigo y lo almaceno
				codigo = pedirCodigo();
				// Creo un objeto Disco
				Disco dis = new Disco(codigo);
				//Borro el disco
				System.out.println(DiscoCRUD.borrarDisco(dis) ? "Exito" : "Error");
			}
			case 4 -> {
				System.out.println("Saliendo...");

			}
			default -> System.out.println("Introduzca una opcion valida");
			}
		} while (opc != 4);

	}

	// Metodo para mostrar menu
	public static void menu() {
		System.out.println("COLECCION DE DISCOS");
		System.out.println("====================");
		System.out.println("1. Listado.");
		System.out.println("2. Nuevo disco.");
		System.out.println("3. Borrar disco.");
		System.out.println("4. Salir.");
	}
	
	// Metodo para pedir el codigo
	public static int pedirCodigo() {
		int codigo;
		System.out.println("Introduzca el codigo del disco: ");
		codigo = reader.nextInt();
		reader.nextLine();
		return codigo;
	}
}