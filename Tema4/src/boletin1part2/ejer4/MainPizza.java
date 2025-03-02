package boletin1part2.ejer4;

public class MainPizza {
	public static void main(String[] args) {
		// Creamos los objetos
		Pizza pizz1 = new Pizza(2,"Mediana","Margarita");
		Pizza pizz2 = new Pizza(3,"Mediana","Margarita");
		
		// Setters y getters
		pizz1.setEstado("SERVIDA");
		System.out.println(pizz1.getEstado());
		System.out.println(pizz1.getTamaño());
		System.out.println(pizz1.getTipo());
		System.out.println(pizz2.getCodigo());
		
		// ToString
		System.out.println(pizz2);
		
		// Equals
		System.out.println(pizz1.equals(pizz2));
	}

}
