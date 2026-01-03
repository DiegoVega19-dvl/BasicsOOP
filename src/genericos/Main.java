package genericos;

public class Main {

	public static void main(String[] args) {

		Caja<String> cajaString = new Caja<>();

		cajaString.ponerAlgo("telefono");

		String contenido = cajaString.obtenerAlgo();

		System.out.println("lo que guarde en la caja es un: " + contenido);

		Caja<Integer> cajaInteger = new Caja<>();

		cajaInteger.ponerAlgo(4);

		int cantidad = cajaInteger.obtenerAlgo();

		System.out.println(" y son : " + cantidad);

	}

}
