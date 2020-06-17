package Software;

public class Categoria {
	private String Audio;
	private String Educacion;
	private String Desarroyo;
	private String Juegos;
	private String Sistemas;
	private String Video;
	private String Ciencia;
	private String Graficos;
	private String Internet;
	private String Oficina;
	private String Utilidades;
	private String Peliculas;
	
	public Categoria(String audio, String educacion, String desarroyo,
			String juegos, String sistemas, String video, String ciencia,
			String graficos, String internet, String oficina,
			String utilidades, String peliculas) {
		Audio = audio;
		Educacion = educacion;
		Desarroyo = desarroyo;
		Juegos = juegos;
		Sistemas = sistemas;
		Video = video;
		Ciencia = ciencia;
		Graficos = graficos;
		Internet = internet;
		Oficina = oficina;
		Utilidades = utilidades;
		Peliculas = peliculas;
	}
	public String getAudio() {
		return Audio;
	}

	public String getEducacion() {
		return Educacion;
	}

	public String getDesarroyo() {
		return Desarroyo;
	}

	public String getJuegos() {
		return Juegos;
	}

	public String getSistemas() {
		return Sistemas;
	}

	public String getVideo() {
		return Video;
	}

	public String getCiencia() {
		return Ciencia;
	}

	public String getGraficos() {
		return Graficos;
	}

	public String getInternet() {
		return Internet;
	}

	public String getOficina() {
		return Oficina;
	}

	public String getUtilidades() {
		return Utilidades;
	}

	public String getPeliculas() {
		return Peliculas;
	}
}
