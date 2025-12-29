package cargaYescritura;

public class Main {

	public static void main(String[] args) {

		Metodos carro = new Metodos("honda", "civic", 828283, 4);

		System.out.println("el auto es un " + carro.getMarca() + " modelo " + carro.getModelo());
		carro.acelerar(4);
	}

}
