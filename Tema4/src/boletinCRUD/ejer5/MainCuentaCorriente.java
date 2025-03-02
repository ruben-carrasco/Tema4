package boletinCRUD.ejer5;

import java.util.Scanner;

public class MainCuentaCorriente {
	/**
	 * Creamos el Scanner
	 */
	public static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Opcion del menu
		int opc;
		// Atributos del objeto
		String dni;
		String nombre;
		double saldo;
		String nacionalidad;
		// Cantidad que sacamos o añadimos de dinero
		double cantidad;
		
		do {
			// Menu
			menu();
			// pedimos opcion
			System.out.println("Introduzca una opcion: ");
			opc = reader.nextInt();
			reader.nextLine();
			// Switch con las opciones
			switch(opc) {
			case 1 -> {
				CuentaCorrienteCRUD.imprimeCuentas();
			}
			case 2 -> {
				// Pedimos el dni
				dni = pedirDni();
				// Pedimos el nombre
				System.out.println("Introduzca el nombre de la cuenta: ");
				nombre = reader.nextLine();
				// pedimos el saldo
				System.out.println("Introduzca el saldo de la cuenta: ");
				saldo = reader.nextDouble();
				reader.nextLine();
				// Pedimos la nacionalidad
				System.out.println("Introduzca la nacionalidad de la cuenta: ");
				nacionalidad = reader.nextLine();
				// Creamos un objetos con los atributos
				CuentaCorriente cuenta = new CuentaCorriente(dni,nombre,saldo,nacionalidad);
				// Agregamos la cuenta
				System.out.println(CuentaCorrienteCRUD.agregaCuenta(cuenta) ? "Exito" : "Error");
			}
			case 3 -> {
				// Pedimos el dni
				dni = pedirDni();
				// Creamos un objetos el dni solo
				CuentaCorriente cuenta = new CuentaCorriente(dni);
				System.out.println(CuentaCorrienteCRUD.borraCuenta(cuenta) ? "Exito" : "Error");
				
			}
			case 4 -> {
				// Pedimos el dni
				dni = pedirDni();
				// Pedimos la cantidad
				System.out.println("Cantidad de dinero: ");
				cantidad = reader.nextDouble();
				// Creamos un objetos el dni solo
				CuentaCorriente cuenta = new CuentaCorriente(dni);
				// Añadimos el dinero
				System.out.println(CuentaCorrienteCRUD.añadirDinero(cuenta, cantidad) ? "Exito" : "Error");
			}
			case 5 -> {
				// Pedimos el dni
				dni = pedirDni();
				// Pedimos la cantidad
				System.out.println("Cantidad de dinero: ");
				cantidad = reader.nextDouble();
				// Creamos un objeto con el dni solo
				CuentaCorriente cuenta = new CuentaCorriente(dni);
				// Sacamos el dinero
				System.out.println(CuentaCorrienteCRUD.sacarDinero(cuenta, cantidad) ? "Exito" : "Error");
			}
			case 6 -> {
				System.out.println("Saliendo...");
			}
			default -> {
				System.out.println("Introduzca una opcion valida");
			}
			}
			
		} while (opc != 6);
		
		// Cerramos el Scanner
		reader.close();
	}
	
	/**
	 * Imprime el menu
	 */
	public static void menu() {
		System.out.println("BANCO");
		System.out.println();
		System.out.println("=============================");
		System.out.println();
		System.out.println("1. Listar Cuentas");
		System.out.println("2. Agregar cuenta");
		System.out.println("3. Eliminar Cuenta");
		System.out.println("4. Añadir dinero");
		System.out.println("5. Sacar dinero");
		System.out.println("6. Salir");
		
	}
	
	public static String pedirDni() {
		String dni;
		System.out.println("Introduce el DNI de la cuenta");
		dni = reader.nextLine();
		return dni;
	}

}
