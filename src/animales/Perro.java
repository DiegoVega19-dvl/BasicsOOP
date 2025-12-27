package animales;

public class Perro extends Animales {

	@Override
	void hacerSonido() {
		System.out.println("el perro ladra");
		super.hacerSonido();
	}
	
	

}
