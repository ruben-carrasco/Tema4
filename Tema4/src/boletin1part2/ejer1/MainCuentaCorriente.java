package boletin1part2.ejer1;

public class MainCuentaCorriente {
	public static void main(String[] args) {
		// Creo dos cuentas
		CuentaCorriente c1 = new CuentaCorriente("52077975H","Ruben",20000,"ESPAÑOLA");
		CuentaCorriente c2 = new CuentaCorriente("52077975H","Ruben",20000,"ESPAÑOLA");
		
		// Las muestro
		System.out.println(c1);
		
		// Quito saldo
		c1.sacarDinero(10000);
		System.out.println(c1.getSaldo());
		
		// Añado saldo 
		c1.añadirDinero(20000);
		System.out.println(c1.getSaldo());
		
		//SAber si son iguales
		System.out.println(c1.equals(c2));
	}

}
