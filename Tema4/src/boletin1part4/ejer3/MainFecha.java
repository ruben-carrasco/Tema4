package boletin1part4.ejer3;

public class MainFecha {
	public static void main(String[] args) {
		Fecha fecha1 = new Fecha(10,12,2024);
		
		System.out.println(fecha1.esBisiesto());
		
		fecha1.diaSiguiente();
		
		System.out.println(fecha1);
	}

}
