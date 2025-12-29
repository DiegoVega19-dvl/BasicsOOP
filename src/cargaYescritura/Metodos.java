package cargaYescritura;

public class Metodos {

	private String marca;
	private String modelo;
	private int numSerie;
	private int cilindraje;

	public Metodos() {

	}

	public Metodos(String marca, String modelo, int numSerie, int cilindraje) {
		this.marca = marca;
		this.modelo = modelo;
		this.numSerie = numSerie;
		this.cilindraje = cilindraje;

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(int numSerie) {
		this.numSerie = numSerie;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}
	
	void acelerar() {}
	
	void acelerar(int cilindraje) {
		System.out.println("el auto tiene: " + cilindraje + " cilindros");
	}

}
