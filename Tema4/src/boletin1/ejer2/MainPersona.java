package boletin1.ejer2;

import java.util.Scanner;

public class MainPersona {
	public static void main(String[] args) {
		Persona per1;
		Persona per2;
		String nombre;
		String apellidos;
		int dni;
		int edad;

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Pedimos y almacenamos los datos en la persona 1
		System.out.println("Introduce el nombre de la primera persona: ");
		nombre = sc.nextLine();
		System.out.println("Introduce los apellidos de la primera persona: ");
		apellidos = sc.nextLine();
		System.out.println("Introduce el dni de la primera persona: ");
		dni = sc.nextInt();
		System.out.println("Introduce la edad de la primera persona: ");
		edad = sc.nextInt();
		
		// Modificamos el objeto
		per1 = new Persona(dni,nombre,apellidos,edad);

		sc.nextLine();
		
		// Pedimos y almacenamos los datos en la persona 1
		System.out.println("Introduce el nombre de la segunda persona: ");
		nombre = sc.nextLine();
		System.out.println("Introduce los apellidos de la segunda persona: ");
		apellidos = sc.nextLine();
		System.out.println("Introduce el dni de la segunda persona: ");
		dni = sc.nextInt();
		System.out.println("Introduce la edad de la segunda persona: ");
		edad = sc.nextInt();

		// Modificamos el objeto
		per2 = new Persona(dni,nombre,apellidos,edad);
		
		// Mostramos resultados
		System.out.println(per1.nombre + " " + per1.apellidos + " con dni " + per1.dni
				+ (per1.edad >= 18 ? " es" : " no es") + " mayor de edad");
		
		System.out.println(per2.nombre + " " + per2.apellidos + " con dni " + per2.dni
				+ (per2.edad >= 18 ? " es" : " no es") + " mayor de edad");

		// Cerramos Scanner
		sc.close();
	}

}
