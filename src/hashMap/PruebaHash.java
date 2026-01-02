package hashMap;

import java.util.Map;
import java.util.HashMap;

public class PruebaHash {

	public static void main(String[] args) {

		Map<Integer, String> listaEmpleados = new HashMap<>();

		listaEmpleados.put(1, "Juan");
		listaEmpleados.put(2, "Pedro");
		listaEmpleados.put(3, "Luisina");
		listaEmpleados.put(4, "Ana");

		System.out.println(listaEmpleados.keySet());
		System.out.println(listaEmpleados.containsValue("Ana"));
	}

}
