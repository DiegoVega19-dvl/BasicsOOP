package ejercicioIntegradorVideoJuego;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<VideoJuego> listaVideoJuego = new ArrayList<>();

		VideoJuego juego = new VideoJuego(01, 2, "Banjo Tooie", "Nintendo 64", "plataforma");
		VideoJuego juego2 = new VideoJuego(02, 4, "call of duty black ops", "xbox 360", "shooter");
		VideoJuego juego3 = new VideoJuego(03, 2, "snowboard kids", "Nintendo 64", "aventura");
		VideoJuego juego4 = new VideoJuego(04, 1, "zelda majoras mask", "Nintendo 64", "aventura");
		VideoJuego juego5 = new VideoJuego(05, 1, "super mario galaxy", "wii", "plataforma");

		listaVideoJuego.add(juego);
		listaVideoJuego.add(juego2);
		listaVideoJuego.add(juego3);
		listaVideoJuego.add(juego4);
		listaVideoJuego.add(juego5);

		for (VideoJuego juegos : listaVideoJuego) {
			System.out.println("titulo: " + juegos.getTitulo() + " | " + " consola: " + juegos.getConsola() + " | "
					+ " cantidad.jugadores: " + juegos.getCantidadJugadores());
		}

		juego5.setTitulo("super mario galaxy 2");
		juego5.setCantidadJugadores(2);

		juego4.setTitulo("mario kart");
		juego4.setCantidadJugadores(4);

		System.out.println("--------------------------");
		System.out.println("despues del cambio de titulo y cantidad de jugadores");
		System.out.println("--------------------------");

		for (VideoJuego juegos : listaVideoJuego) {
			System.out.println("titulo: " + juegos.getTitulo() + " | " + " consola: " + juegos.getConsola() + " | "
					+ " cantidad.jugadores: " + juegos.getCantidadJugadores());
		}

		System.out.println("--------------------------");
		System.out.println("mostrar unicamente los juegos que sean de la Nintendo 64:");
		System.out.println("--------------------------");

		// le metodo .equals lo podemos usar cuando trabajamos con Strings, el == se usar con numeros
		for (VideoJuego nintendo : listaVideoJuego) {
			if (nintendo.getConsola().equals("Nintendo 64")) {
				System.out.println("titulo: " + nintendo.getTitulo() + " | " + " consola: " + nintendo.getConsola()
						+ " | " + " cantidad.jugadores: " + nintendo.getCantidadJugadores());
			}
		}

	}

}
