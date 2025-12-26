package personas;

public class Consultor extends Personas {

	protected int idConsultor;
	protected String nombreEmpresa;

	public Consultor() {

	}

	public Consultor(String nombre, String direccion, String correo, int id, int edad, int telefono, int idConsultor,
			String nombreEmpresa) {
		super(nombre, direccion, correo, id, edad, telefono);
		this.idConsultor = idConsultor;
		this.nombreEmpresa = nombreEmpresa;
	}

	public int getIdConsultor() {
		return idConsultor;
	}

	public void setIdConsultor(int idConsultor) {
		this.idConsultor = idConsultor;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

}
