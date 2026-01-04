package integradorPlantas;

public abstract class Planta {

	private String nombre;
	private String climaIdeal;
	private double altoTallo;
	private boolean tieneHojas;

	public Planta() {

	}

	public Planta(String nombre, String climaIdeal, double altoTallo, boolean tieneHojas) {
		super();
		this.nombre = nombre;
		this.climaIdeal = climaIdeal;
		this.altoTallo = altoTallo;
		this.tieneHojas = tieneHojas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClimaIdeal() {
		return climaIdeal;
	}

	public void setClimaIdeal(String climaIdeal) {
		this.climaIdeal = climaIdeal;
	}

	public double getAltoTallo() {
		return altoTallo;
	}

	public void setAltoTallo(double altoTallo) {
		this.altoTallo = altoTallo;
	}

	public boolean isTieneHojas() {
		return tieneHojas;
	}

	public void setTieneHojas(boolean tieneHojas) {
		this.tieneHojas = tieneHojas;
	}

	public abstract void mensajePlanta();

}
