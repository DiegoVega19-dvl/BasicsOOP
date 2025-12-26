package overwatch;

public class Personaje {
	
	
	public String nombre;
	public String skin;
	public String clase;
	
	public Personaje() {
		
	}
	
	public Personaje(String nombre, String skin,String clase) {
		this.nombre=nombre;
		this.skin=skin;
		this.clase=clase;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSkin() {
		return skin;
	}

	public void setSkin(String skin) {
		this.skin = skin;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public String brincar() {
		return "estoy brincando";
	} 
	
	public String agacharse() {
		return "estoy agachandome";
	}
	
	public String usarUlti() {
		return "estoy usando mi ulti";
	} 
	
	public String moverse() {
		return "me estoy moviendo";
	}

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", skin=" + skin + ", clase=" + clase + "]";
	}
	
	


}
