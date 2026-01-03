package relaciones;

import java.util.List;

public class Auto {

	private String modelo;
	private String marca;
	private String color;
	private int id;
	private List<Persona> propietarios;

	public Auto() {

	}

	public Auto(String modelo, String marca, String color, int id, List<Persona> propietarios) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.color = color;
		this.id = id;
		this.propietarios = propietarios;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Persona> getPropietarios() {
		return propietarios;
	}

	public void setPropietarios(List<Persona> propietarios) {
		this.propietarios = propietarios;
	}

	@Override
	public String toString() {
		return "Auto [modelo=" + modelo + ", marca=" + marca + ", color=" + color + ", id=" + id + ", propietarios="
				+ propietarios + "]";
	}

}
