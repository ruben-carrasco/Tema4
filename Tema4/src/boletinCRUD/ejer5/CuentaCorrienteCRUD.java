package boletinCRUD.ejer5;

import java.util.ArrayList;

public class CuentaCorrienteCRUD {
	/**
	 * Lista que almacena las cuentas
	 */
	public static ArrayList<CuentaCorriente> cuentas = new ArrayList<>();
	
	/**
	 * Metodo que imprime las cuentas
	 */
	public static void imprimeCuentas() {
		for (CuentaCorriente cuenta : cuentas) {
			System.out.println(cuenta);
			System.out.println("-----------------------------");
		}
	}
	
	/**
	 * Metodo para agregar una cuenta al la lista
	 * @param cuenta Cuenta que se agrega
	 * @return boolean true en caso de que se agregue o false por el contrario
	 */
	public static boolean agregaCuenta(CuentaCorriente cuenta) {
		return cuentas.add(cuenta);
	}
	
	/**
	 * Metodo para eliminar una cuenta al la lista
	 * @param cuenta Cuenta que se elimina
	 * @return boolean true en caso de que se elimine o false por el contrario
	 */
	public static boolean borraCuenta(CuentaCorriente cuenta) {
		return cuentas.remove(cuenta);
	}
	
	/**
	 * Metodo para añadir dinero a una cuenta
	 * @param cuenta Cuenta a la que añadimos dinero
	 * @param cantidad Cantidad que añadimos
	 * @return boolean true si se añade, false si no
	 */
	public static boolean añadirDinero(CuentaCorriente cuenta, double cantidad) {
		boolean res = false;
		int indice = cuentas.indexOf(cuenta);
		if (indice >= 0) {
			res = cuentas.get(indice).añadirDinero(cantidad);
		}
		return res;
	}
	
	/**
	 * Metodo para sacar dinero a una cuenta
	 * @param cuenta Cuenta a la que sacamos dinero
	 * @param cantidad Cantidad que sacamos
	 * @return boolean true si se saca, false si no
	 */
	public static boolean sacarDinero(CuentaCorriente cuenta, double cantidad) {
		boolean res = false;
		int indice = cuentas.indexOf(cuenta);
		if (indice >= 0) {
			res = cuentas.get(indice).sacarDinero(cantidad);
		}
		return res;
	}

}
