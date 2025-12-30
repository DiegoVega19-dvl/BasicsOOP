package arrayLists;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Persona> listas = new LinkedList<Persona>();

		listas.add(new Persona("juan", 1, 25));
		listas.add(new Persona("Ana", 2, 22));
		listas.add(new Persona("pedro", 3, 26));

		// agregar al principio de la lista

		listas.add(0, new Persona("Maria", 3, 26));
		listas.add(1, new Persona("Diego", 3, 26));

		// recorrido con foreach

		for (Persona perso : listas) {
			System.out.println("recorrido con foreach: " + perso.getNombre());
		}
	}

}
