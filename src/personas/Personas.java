package personas;

public class Personas {

	public String nombre;
	public String direccion;
	public String correo;
	public int id;
	public int edad;
	public int telefono;

	public Personas() {

	}

	public Personas(String nombre, String direccion, String correo, int id, int edad, int telefono) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.correo = correo;
		this.id = id;
		this.edad = edad;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Personas [nombre=" + nombre + ", direccion=" + direccion + ", correo=" + correo + ", id=" + id
				+ ", edad=" + edad + ", telefono=" + telefono + "]";
	}

}
