package integradorPokemon;

public class Charmander extends Pokemon implements IFuego {

	public Charmander() {

	}

	public Charmander(int num_pokex, double pesoPokemon, String sexo, String temporada, String tipo,
			String nombrePokemon) {
		super(num_pokex, pesoPokemon, sexo, temporada, tipo, nombrePokemon);

	}

	@Override
	public String atacarPunioFuego() {
		// TODO Auto-generated method stub
		return " soy charmander y estoy usando puño fuego";
	}

	@Override
	public String atacarAscuas() {
		// TODO Auto-generated method stub
		return "soy charmander y estoy usando ascuas";
	}

	@Override
	public String atacarLanzaLLamas() {
		// TODO Auto-generated method stub
		return "soy charmander y estoy utilizando lanza llamas";
	}

	@Override
	public String atacarPlacaje() {
		// TODO Auto-generated method stub
		return "soy charmandar y estoy utilizando placaje";
	}

	@Override
	public String atacarArañazo() {
		// TODO Auto-generated method stub
		return "soy charmander y estoy utilizando Arañazo";
	}

	@Override
	public String atacarMordisco() {
		// TODO Auto-generated method stub
		return "soy charmander y estoy utilizando mordisco";
	}

}
