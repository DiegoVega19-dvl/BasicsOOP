package linkedList;

public class Frutas {

	private String nombre;
	private String color;
	private double peso;

	public Frutas() {

	}

	public Frutas(String nombre, String color, double peso) {
		this.nombre = nombre;
		this.color = color;
		this.peso = peso;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}
