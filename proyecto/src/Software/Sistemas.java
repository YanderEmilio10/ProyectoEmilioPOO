package Software;

public class Sistemas extends Categoria{
	private String Emulador;
	private String Terminal;
	private String Gestor;
	private String Herramientas;
	private String Seguridad;
	public Sistemas(String audio, String educacion, String desarroyo,
			String juegos, String sistemas, String video, String ciencia,
			String graficos, String internet, String oficina,
			String utilidades, String peliculas, String emulador,
			String terminal, String gestor, String herramientas,
			String seguridad) {
		super(audio, educacion, desarroyo, juegos, sistemas, video, ciencia,
				graficos, internet, oficina, utilidades, peliculas);
		Emulador = emulador;
		Terminal = terminal;
		Gestor = gestor;
		Herramientas = herramientas;
		Seguridad = seguridad;
	}
	public void MostrarDatos(){
		System.out.println("Sistemas: "+getSistemas()+
				"Emulador: "+Emulador+
				"Terminal: "+Terminal+
				"Gestor: "+Gestor+
				"Herramientas: "+Herramientas+
				"Seguridad: "+Seguridad);
	}
}
