package conversiones;

public class Main {

	public static void main(String[] args) {

		double num = 1.68;

		int numInt = (int) num;

		long numLong = (long) num;

		System.out.println("double: " + num);
		System.out.println("int: " + numInt);
		System.out.println("long: " + numLong);

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><");
		System.out.println("de Strings a numerico");

		String cantProducto = "20";
		String precio = "150.50";

		int cantProductoInt = Integer.parseInt(cantProducto);
		double precioDouble = Double.parseDouble(precio);

		System.out.println("el resultado de la compra es: " + (cantProductoInt * precioDouble));

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><");
		System.out.println("de numerico a string");

		int edad = 25;
		double estatura = 1.68;

		String edadString = String.valueOf(edad);
		String estaturaString = String.valueOf(estatura);

		System.out.println("la es: " + edadString + " y su estatura es de : " + estaturaString);

	}

}
