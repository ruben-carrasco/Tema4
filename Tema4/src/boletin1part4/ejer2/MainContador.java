package boletin1part4.ejer2;

public class MainContador {
	public static void main(String[] args) {
		// Creamos un objeto
		Contador cont = new Contador(1);
		
		// Metodo incrementar
		cont.incrementar();
		System.out.println(cont.getCont());
		
		// Metodo decrementar
		cont.decrementar();
		System.out.println(cont.getCont());
		
		// Set
		cont.setCont(0);
		System.out.println(cont.getCont());
		
		// Metodo decrementar
		cont.decrementar();
		System.out.println(cont.getCont());
	}

}
