package Software;

public class Audio extends Categoria {
	private String Edicion;
	private String Grabadores;
	private String Mezclador;
	private String Musica;
	private String Reproductores;
	
	public Audio(String audio, String educacion, String desarroyo,
			String juegos, String sistemas, String video, String ciencia,
			String graficos, String internet, String oficina,
			String utilidades, String peliculas, String edicion, String grabadores, String mezclador,
			String musica, String reproductores) {
		super(audio, educacion, desarroyo, juegos, sistemas, video, ciencia, graficos, internet, oficina, utilidades, peliculas);
		Edicion = edicion;
		Grabadores = grabadores;
		Mezclador = mezclador;
		Musica = musica;
		Reproductores = reproductores;
	}
	public void MostrarDatos(){
		System.out.println("Audio: "+getAudio()+ 
				"Edicion: "+Edicion+
				"Grabadores: "+Grabadores+
				"Mezcladore: "+Mezclador+
				"Musica: "+Musica+
				"Reproductores: "+Reproductores);
	}
}
