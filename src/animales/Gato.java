package animales;

public class Gato extends Animales {

	@Override
	void hacerSonido() {
		System.out.println("el gato maulla");
		super.hacerSonido();
	}

}
