package boletin1part2.ejer2;

public class MainLibro {
	public static void main(String[] args) {
		// Creamos dos objetos Libro
		Libro lib1 = new Libro("Cronicas de Marvel","Ruben");
		Libro lib2 = new Libro("Cronicas de Marvel 2","Ruben",10,4,"narrativo");
		
		// Get de los objetos
		System.out.println(lib1.getTitulo());
		System.out.println(lib2.getPrestados());
		System.out.println(lib1.getAutor());
		System.out.println(lib2.getEjemplares());
		System.out.println(lib2.getGenero());
		
		// Set de los objetos
		lib2.setEjemplares(20);
		System.out.println(lib2.getEjemplares());
		lib1.setEjemplares(10);
		System.out.println(lib1.getEjemplares());
		lib1.setGenero("lírico");
		System.out.println(lib1.getGenero());;
		
		// Metodo prestamo
		lib2.prestamo(3);
		System.out.println("Prestados: " + lib2.getPrestados());
		
		// Metodo devolucion
		lib2.devolucion(3);
		System.out.println("Prestados: " + lib2.getPrestados());
		
		// Metodo toString
		System.out.println(lib2);
		
		// Metodo equals
		System.out.println(lib2.equals(lib1));
	}
}
