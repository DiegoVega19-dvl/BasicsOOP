package integradorPokemon;

public abstract class Pokemon {

	protected int num_pokex;
	protected double pesoPokemon;
	protected String sexo;
	protected String temporada;
	protected String tipo;
	protected String nombrePokemon;

	public Pokemon() {

	}

	public Pokemon(int num_pokex, double pesoPokemon, String sexo, String temporada, String tipo,
			String nombrePokemon) {
		super();
		this.num_pokex = num_pokex;
		this.pesoPokemon = pesoPokemon;
		this.sexo = sexo;
		this.temporada = temporada;
		this.tipo = tipo;
		this.nombrePokemon = nombrePokemon;
	}

	public int getNum_pokex() {
		return num_pokex;
	}

	public void setNum_pokex(int num_pokex) {
		this.num_pokex = num_pokex;
	}

	public double getPesoPokemon() {
		return pesoPokemon;
	}

	public void setPesoPokemon(double pesoPokemon) {
		this.pesoPokemon = pesoPokemon;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTemporada() {
		return temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombrePokemon() {
		return nombrePokemon;
	}

	public void setNombrePokemon(String nombrePokemon) {
		this.nombrePokemon = nombrePokemon;
	}

	public abstract String atacarPlacaje();

	public abstract String atacarArañazo();

	public abstract String atacarMordisco();

}
