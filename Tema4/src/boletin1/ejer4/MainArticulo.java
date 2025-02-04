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
		resultado(art1.nombre,art1.precio,art1.IVA);
		resultado(art2.nombre,art2.precio,art2.IVA);
		resultado(art3.nombre,art3.precio,art3.IVA);
		resultado(art4.nombre,art4.precio,art4.IVA);
	}
	
	/**
	 * Funcion que muestra los resultados
	 * @param nombre del producto
	 * @param precio del producto
	 * @param iva del producto
	 */
	public static void resultado(String nombre,int precio, int iva) {
		double pvp;
		
		// Calculamos el pvp
		pvp = ((double) precio * iva / 100) + precio;
				
		// Mostrar resultado
		System.out.println(nombre + " - " + "Precio:" + precio + "€" + " - IVA:" + iva + "%" + " - PVP:"
				+ pvp + "€");
	}

}
