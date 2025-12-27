package animales;

public class Gallo extends Animales {

	@Override
	void hacerSonido() {
		System.out.println("el gallo kakarea");
		super.hacerSonido();
	}

}
