package overwatch;



public class Main {
	
	public static void main(String[] args) {
		
		Personaje persona1 = new Personaje("Rainhardt","deafault","Tanque");
		Personaje persona2 = new Personaje("Mercy","deafault","Apoyo");
		Personaje persona3 = new Personaje("Genji","deafault","Dps");
		
		
		
		
		System.out.println(persona1.getNombre() + " es de tipo " + persona1.getClase());
		System.out.println(persona2.getNombre() + " es de tipo " + persona2.getClase());
		System.out.println(persona3.getNombre() + " es de tipo " + persona3.getClase());
		System.out.println("prueba de ssh");
	}

}
