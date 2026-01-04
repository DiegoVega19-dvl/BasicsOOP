package integradorPlantas;

public class Arbol extends Planta {

	private String variedad;
	private String tipoTronco;
	private String color;
	private String tipoHojas;
	private double radioTronco;

	public Arbol() {
		super();
	}

	public Arbol(String variedad, String tipoTronco, String color, String tipoHojas, double radioTronco, String nombre,
			String climaIdeal, double altoTallo, boolean tieneHojas) {
		super(nombre, climaIdeal, altoTallo, tieneHojas);
		this.variedad = variedad;
		this.tipoTronco = tipoTronco;
		this.color = color;
		this.tipoHojas = tipoHojas;
		this.radioTronco = radioTronco;

	}

	@Override
	public void mensajePlanta() {
		System.out.println("hola soy un arbol");
	}

	public String getVariedad() {
		return variedad;
	}

	public void setVariedad(String variedad) {
		this.variedad = variedad;
	}

	public String getTipoTronco() {
		return tipoTronco;
	}

	public void setTipoTronco(String tipoTronco) {
		this.tipoTronco = tipoTronco;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipoHojas() {
		return tipoHojas;
	}

	public void setTipoHojas(String tipoHojas) {
		this.tipoHojas = tipoHojas;
	}

	public double getRadioTronco() {
		return radioTronco;
	}

	public void setRadioTronco(double radioTronco) {
		this.radioTronco = radioTronco;
	}

}
