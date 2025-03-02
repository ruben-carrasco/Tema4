package boletinCRUD.ejer1;

import java.util.Scanner;

public class MainAlumno {
	public static void main(String[] args) {
		
		// Creo las variables necesarias para almacenar: 
		int opc; // Opcion del menu
		String nombre; // Nombre de un objeto Alumno
		double notaMedia; // Nota de un objeto Alumno
		
		// Creo el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Bucle para el menu
		do {
			// Muestro el menu
			menu();
			// Pido la opcion al usuario
			System.out.println("Introduzca una opcion: ");
			opc = reader.nextInt();
			
			// Limpiamos buffer
			reader.nextLine();
			
			// Switch con las opciones
			switch(opc) {
			case 1 -> {
				AlumnoCRUD.imprimeAlumnos(); // Funcion de CRUD que imprime los alumnos
			}
			case 2 -> {
				// Pedimos y almacenamos en la variable el nombre del alumno
				System.out.println("Introduzca el nombre del alumno: ");
				nombre = reader.nextLine();
				// Pedimos y almacenamos en la variable la nota del alumno
				System.out.println("Introduzca la nota media del alumno: ");
				notaMedia = reader.nextDouble();
				// Creo el objeto alumno
				Alumno alum = new Alumno(nombre,notaMedia);
				// Añadimos al alumno con la funcion añadir de la clase CRUD
				System.out.println(AlumnoCRUD.añadirAlumno(alum) ? "Añadido" : "No añadido");
			}
			case 3 -> {
				// Pedimos y almacenamos en la variable el nombre del alumno
				System.out.println("Introduzca el nombre del alumno: ");
				nombre = reader.nextLine();
				// Pedimos y almacenamos en la variable la nota del alumno
				System.out.println("Introduzca la nota media del alumno: ");
				notaMedia = reader.nextDouble();
				// Creo el objeto alumno
				Alumno alum = new Alumno(nombre);
				// Modificamos la nota con la funcion modificar del CRUD
				System.out.println(AlumnoCRUD.modificaAlumno(alum, notaMedia)? "El alumno existia y se pudo modificar" : "El alumno no existia");
			}
			case 4 -> {
				// Pedimos el nombre del alumno que vamos a eliminar
				System.out.println("Introduzca el nombre del alumno a eliminar: ");
				nombre = reader.nextLine();
				// Creamos un objeto solo con el nombre
				Alumno alum = new Alumno(nombre);
				// Eliminamos el alumno usando la funcion eliminar de la clase CRUD
				System.out.println(AlumnoCRUD.borrarAlumno(alum) ? "Borrado" : "No borrado");
			}
			case 5 -> {
				System.out.println("Saliendo...");
			}
			default -> {
				System.out.println("Opcion no valida.");
			}
			}
			
		} while (opc != 5);
		
		// Cierro el Scanner
		reader.close();
	}
	
	public static void menu() {
		System.out.println("ALUMNOS/AS");
		System.out.println();
		System.out.println("=====================");
		System.out.println();
		System.out.println("1. Listado.");
		System.out.println("2. Nuevo Alumno.");
		System.out.println("3. Modificar.");
		System.out.println("4. Borrar.");
		System.out.println("5. Salir");
	}
	

}
