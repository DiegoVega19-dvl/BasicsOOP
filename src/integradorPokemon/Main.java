package integradorPokemon;

public class Main {

	public static void main(String[] args) {

		Charmander poke = new Charmander(1, 20, "Macho", "temporada 1", " tipo fuego", "charmi");
		

		System.out.println("el primer pokemon en la lista es un " + poke.getClass().getSimpleName() + poke.getTipo()
				+ " y pesa: " + poke.getPesoPokemon() + " y se llama " + poke.getNombrePokemon());

		System.out.println("los ataques de " + poke.getClass().getSimpleName());
		System.out.println("-------------------------------");
		System.out.println("charmander comienza con estos ataques: ");
		System.out.println(poke.atacarArañazo());
		System.out.println(poke.atacarLanzaLLamas());
		System.out.println(poke.atacarAscuas());

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}

}
