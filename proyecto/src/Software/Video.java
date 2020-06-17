package Software;

public class Video extends Categoria{
	private String Edicion;
	private String Grabador;
	private String Reproductor;
	
	public Video(String audio, String educacion, String desarroyo,
			String juegos, String sistemas, String video, String ciencia,
			String graficos, String internet, String oficina,
			String utilidades, String peliculas, String edicion,
			String grabador, String reproductor) {
		super(audio, educacion, desarroyo, juegos, sistemas, video, ciencia,
				graficos, internet, oficina, utilidades, peliculas);
		Edicion = edicion;
		Grabador = grabador;
		Reproductor = reproductor;
	}
	public void MostrarDatos(){
		System.out.println("Video: "+getVideo()+
				"Edicion: "+Edicion+
				"Grabador: "+Grabador+
				"Reproductor: "+Reproductor);
	}
}
