package clasesAbstractas;

public class Circulo extends Figura {

	private double radio;

	public Circulo() {

	}

	public Circulo(double radio) {
		this.radio = radio;

	}

	@Override
	public double calcularArea() {
		double area = Math.PI * (radio * radio);
		return area;
	}

}
