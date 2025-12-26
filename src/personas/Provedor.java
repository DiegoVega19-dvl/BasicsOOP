package personas;

public class Provedor extends Personas {

	protected int idProvedor;
	protected String nombreEmpresa;

	public Provedor() {
	}

	public Provedor(String nombre, String direccion, String correo, int id, int edad, int telefono, int idProvedor,
			String nombreEmpresa) {
		super(nombre, direccion, correo, id, edad, telefono);
		this.idProvedor = idProvedor;
		this.nombreEmpresa = nombreEmpresa;
	}

	public int getIdProvedor() {
		return idProvedor;
	}

	public void setIdProvedor(int idProvedor) {
		this.idProvedor = idProvedor;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

}
