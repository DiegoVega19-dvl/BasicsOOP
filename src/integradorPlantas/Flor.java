package integradorPlantas;

public class Flor extends Planta {

	private String colorPetalos;
	private String colorPistillo;
	private String colorPetalo;
	private String estacion;
	private int cantPromPetalos;
	private int variedadFlor;

	public Flor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Flor(String colorPetalos, String colorPistillo, String colorPetalo, String estacion, int cantPromPetalos,
			int variedadFlor, String nombre, String climaIdeal, double altoTallo, boolean tieneHojas) {
		super(nombre, climaIdeal, altoTallo, tieneHojas);
		this.colorPetalos = colorPetalos;
		this.colorPistillo = colorPistillo;
		this.colorPetalo = colorPetalo;
		this.estacion = estacion;
		this.cantPromPetalos = cantPromPetalos;
		this.variedadFlor = variedadFlor;
	}

	@Override
	public void mensajePlanta() {
		System.out.println("hola soy una flor");

	}

	public String getColorPetalos() {
		return colorPetalos;
	}

	public void setColorPetalos(String colorPetalos) {
		this.colorPetalos = colorPetalos;
	}

	public String getColorPistillo() {
		return colorPistillo;
	}

	public void setColorPistillo(String colorPistillo) {
		this.colorPistillo = colorPistillo;
	}

	public String getColorPetalo() {
		return colorPetalo;
	}

	public void setColorPetalo(String colorPetalo) {
		this.colorPetalo = colorPetalo;
	}

	public String getEstacion() {
		return estacion;
	}

	public void setEstacion(String estacion) {
		this.estacion = estacion;
	}

	public int getCantPromPetalos() {
		return cantPromPetalos;
	}

	public void setCantPromPetalos(int cantPromPetalos) {
		this.cantPromPetalos = cantPromPetalos;
	}

	public int getVariedadFlor() {
		return variedadFlor;
	}

	public void setVariedadFlor(int variedadFlor) {
		this.variedadFlor = variedadFlor;
	}

}
