package linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Persona> lista = new ArrayList<Persona>();

		lista.add(new Persona("Juan", 25, 01));
		lista.add(new Persona("Maria", 25, 02));
		lista.add(new Persona("Pedro", 25, 03));
		lista.add(new Persona("Ana", 25, 04));

		lista.remove(0);

		List<Frutas> frut = new LinkedList<Frutas>();

		frut.add(new Frutas("manzana", "roja", 0.06));
		frut.add(new Frutas("platano", "amarillo", 0.60));
		frut.add(new Frutas("sandia", "verde", 3.0));
		frut.add(new Frutas("kiwi", "verde", 0.040));
		frut.add(new Frutas("uva", "morada", 1.0));

		String removeName = "kiwi";

		for (Frutas fruit : frut) {

			if (fruit.getNombre().equals(removeName)) {
				frut.remove(fruit);
				break;
			}

		}

		System.out.println(">>>>>>>>>>>>>   ArrayList  >>>>>>>>>>>>>>>>>>>>>>>>>");

		for (Persona perso : lista) {
			System.out.println(perso.getNombre());
		}

		System.out.println(">>>>>>>>>>>>>  LinkedList  >>>>>>>>>>>>>>>>>>>>>>>>>");

		for (Frutas fruta : frut) {
			System.out.println(fruta.getNombre());
		}
	}

}
