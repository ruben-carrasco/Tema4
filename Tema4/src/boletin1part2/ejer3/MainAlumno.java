package boletin1part2.ejer3;

public class MainAlumno {
	public static void main(String[] args) {
		// Creamos objetos alumno
		Alumno al1 = new Alumno("Ruben",9.2);
		Alumno al2 = new Alumno("Rubencito",9.1);
		
		// Setters y getters
		al1.setNombre("pepe");
		System.out.println(al1.getNombre());
		al2.setNotaMedia(4);
		System.out.println(al2.getNotaMedia());
		
		// metodo toString
		System.out.println(al1);
		
		// Metodo equals
		System.out.println(al1.equals(al2));;
	}

}
