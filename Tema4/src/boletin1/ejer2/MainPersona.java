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
		per1 = new Persona(dni, nombre, apellidos, edad);

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
		per2 = new Persona(dni, nombre, apellidos, edad);

		// Mostramos resultados
		System.out.println(per1.getNombre() + " " + per1.getApellidos() + " con dni " + per1.getDni()
				+ (per1.esMayorEdad() ? " es" : " no es") + " mayor de edad y" + (per1.esJubilado() ? " es" : " no es")
				+ " jubilado");

		System.out.println(per2.getNombre() + " " + per2.getApellidos() + " con dni " + per2.getDni()
				+ (per2.esMayorEdad() ? " es" : " no es") + " mayor de edad y" + (per2.esJubilado() ? " es" : " no es")
				+ " jubilado");

		// Mostrar información
		System.out.println(per1);
		System.out.println(per2);
		
		//Mostrar diferencia de edad
		System.out.println("La diferencia de edad entre las dos personas es de " + per1.diferenciaEdad(per2) + " años");

		// Cerramos Scanner
		sc.close();
	}

}
