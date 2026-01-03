package ejercicioIntegradorVideoJuego;

public class VideoJuego {

	private int codigo;
	private int cantidadJugadores;
	private String titulo;
	private String consola;
	private String categoria;

	public VideoJuego() {

	}

	public VideoJuego(int codigo, int cantidadJugadores, String titulo, String consola, String categoria) {
		super();
		this.codigo = codigo;
		this.cantidadJugadores = cantidadJugadores;
		this.titulo = titulo;
		this.consola = consola;
		this.categoria = categoria;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCantidadJugadores() {
		return cantidadJugadores;
	}

	public void setCantidadJugadores(int cantidadJugadores) {
		this.cantidadJugadores = cantidadJugadores;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConsola() {
		return consola;
	}

	public void setConsola(String consola) {
		this.consola = consola;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "VideoJuego [codigo=" + codigo + ", cantidadJugadores=" + cantidadJugadores + ", titulo=" + titulo
				+ ", consola=" + consola + ", categoria=" + categoria + "]";
	}

}
