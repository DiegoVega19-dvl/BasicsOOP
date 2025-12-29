package clasesAbstractas;

public class Main {

	public static void main(String[] args) {

		Circulo cir = new Circulo(15);
		Cuadrado cua = new Cuadrado(100);

		System.out.println("el area del circulo es: " + cir.calcularArea());
		System.out.println("el area del cuadrado es: " + cua.calcularArea());

	}

}
