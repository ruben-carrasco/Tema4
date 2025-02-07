package boletin1.ejer4;

public class MainArticulo {
	public static void main(String[] args) {
		Articulo art1;
		Articulo art2;
		Articulo art3;
		Articulo art4;

		// Asignar valores a los atributos
		art1 = new Articulo("Manzana",3,40);
		art2 = new Articulo("Pera",-3,-4);
		art3 = new Articulo("",3,40);
		art4 = new Articulo(null,3,40);
		
		
		//Resultados
		resultado(art1);
		resultado(art2);
		resultado(art3);
		resultado(art4);
	}
	
	/**
	 * Funcion que muestra los resultados
	 * @param nombre del producto
	 * @param precio del producto
	 * @param iva del producto
	 */
	public static void resultado(Articulo art) {
		double pvp;
		double pvpDescuento;
		
		// Calculamos el pvp
		pvp = art.getPVP();
		System.out.println("El PVP de " + art + " es: " + pvp);
				
		// Mostrar resultado
		System.out.println(art);
	}

}
