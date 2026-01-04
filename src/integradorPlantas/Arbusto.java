package integradorPlantas;

public class Arbusto extends Planta {

	private double anchoArbusto;
	private boolean esDomestico;
	private boolean sePodaOno;
	private String variedadArbusto;
	private String colorHojas;

	public Arbusto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Arbusto(double anchoArbusto, boolean esDomestico, boolean sePodaOno, String variedadArbusto,
			String colorHojas, String nombre, String climaIdeal, double altoTallo, boolean tieneHojas) {
		super(nombre, climaIdeal, altoTallo, tieneHojas);
		this.anchoArbusto = anchoArbusto;
		this.esDomestico = esDomestico;
		this.sePodaOno = sePodaOno;
		this.variedadArbusto = variedadArbusto;
		this.colorHojas = colorHojas;
	}

	@Override
	public void mensajePlanta() {
		System.out.println("hola soy un arbusto");

	}

	public double getAnchoArbusto() {
		return anchoArbusto;
	}

	public void setAnchoArbusto(double anchoArbusto) {
		this.anchoArbusto = anchoArbusto;
	}

	public boolean isEsDomestico() {
		return esDomestico;
	}

	public void setEsDomestico(boolean esDomestico) {
		this.esDomestico = esDomestico;
	}

	public boolean isSePodaOno() {
		return sePodaOno;
	}

	public void setSePodaOno(boolean sePodaOno) {
		this.sePodaOno = sePodaOno;
	}

	public String getVariedadArbusto() {
		return variedadArbusto;
	}

	public void setVariedadArbusto(String variedadArbusto) {
		this.variedadArbusto = variedadArbusto;
	}

	public String getColorHojas() {
		return colorHojas;
	}

	public void setColorHojas(String colorHojas) {
		this.colorHojas = colorHojas;
	}

}
