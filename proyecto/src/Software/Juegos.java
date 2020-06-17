package Software;

public class Juegos extends Categoria {
	private String Accion;
	private String Deportes;
	private String Emuladores;
	private String Aventura;
	private String Simulacion;
	public Juegos(String audio, String educacion, String desarroyo,
			String juegos, String sistemas, String video, String ciencia,
			String graficos, String internet, String oficina,
			String utilidades, String peliculas, String accion,
			String deportes, String emuladores, String aventura,
			String simulacion) {
		super(audio, educacion, desarroyo, juegos, sistemas, video, ciencia,
				graficos, internet, oficina, utilidades, peliculas);
		Accion = accion;
		Deportes = deportes;
		Emuladores = emuladores;
		Aventura = aventura;
		Simulacion = simulacion;
	}

	public void MostrarDatos(){
	System.out.println("Juegos: "+getJuegos()+
			"Accion: "+Accion+
			"Deportes: "+Deportes+
			"Emuladores: "+Emuladores+
			"Aventura: "+Aventura+
			"Simulacio: "+Simulacion);
	}
}
