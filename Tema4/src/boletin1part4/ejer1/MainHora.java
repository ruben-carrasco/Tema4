package boletin1part4.ejer1;

public class MainHora {
	public static void main(String[] args) {
		// Creo un objeto hora
		Hora hora1 = new Hora(23,59,59);
		
		// Incremento la hora
		hora1.incrementaSegundo();
		
		// Muestro la hora
		System.out.print(hora1.getHora() + ":");;
		System.out.print(hora1.getMinuto() + ":");
		System.out.print(hora1.getSegundo());
	}

}
