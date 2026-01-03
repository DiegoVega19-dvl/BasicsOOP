package relaciones;

import java.util.ArrayList;
import java.util.List;

public class Relaciones {

	public static void main(String[] args) {

		Auto aut = new Auto();
		aut.setMarca("Honda");
		aut.setModelo("civic");
		aut.setColor("gris");

		List<Persona> listaPersonas = new ArrayList<Persona>();

		Persona perso1 = new Persona();
		Persona perso2 = new Persona();

		perso1.setNombre("Juan");
		perso1.setApellido("perez");
		perso1.setId(01);

		perso2.setNombre("Ana");
		perso2.setApellido("de paula");
		perso2.setId(02);

		listaPersonas.add(perso1);
		listaPersonas.add(perso2);

		aut.setPropietarios(listaPersonas);

		System.out.println("el auto " + aut.getModelo() + " le pertenece a " + aut.getPropietarios().toString());
	}

}
