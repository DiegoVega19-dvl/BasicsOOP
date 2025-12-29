package encapsulamiento;

public class Encapsulamiento {

	public static void main(String[] args) {

		Alumno alu = new Alumno("juan", 25);

		System.out.println("el nombre del alumno es " + alu.getNombre() + " y tiene " + alu.getEdad() + " años");
	}

}
