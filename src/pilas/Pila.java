package pilas;

import java.util.Stack;

public class Pila {

	public static void main(String[] args) {

		Stack<Integer> pila = new Stack<Integer>();

		System.out.println("bienvenido a la practica de pilas:");
		System.out.println("la pila esta vacia?: " + pila.isEmpty());

		// el metodo isEmpty sirve para saber si la pila tiene contenido

		pila.push(1);
		pila.push(2);
		pila.push(3);
		pila.push(4);
		pila.push(5);

		for (Integer pilas : pila) {
			System.out.println(pilas);
		}

		System.out.println("contenido actual de la pila: " + pila);
		System.out.println("la pila sigue vacia? : " + pila.isEmpty());

		pila.pop();

		System.out.println("contenido actual de la pila: " + pila);
		System.out.println("esta el contenido el 2? " + pila.search(2));
		System.out.println("las pilas se leen de derecha a izquierda");
		System.out.println("el ultimo elemento agregado a la pila es... " + pila.peek());

	}

}
