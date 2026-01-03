package excepciones;

public class Main {

	public static void main(String[] args) {

		try {
			int num = 3 / 0;
			System.out.println(num);
		} catch (Exception e) {
			System.out.println("no se pueden realizar divisones entre 0");
		}

		try {
			int[] arre = { 1, 2, 3, 4 };

			System.out.println(arre[5]);
		} catch (Exception e) {
			System.out.println("el indice al que quieres acceder no existe");
		}
	}

}
