package Software;

public class Peliculas extends Categoria{
	private String Terror;
	private String Risa;
	private String Entretenimiento;
	private String Series;
	public Peliculas(String audio, String educacion, String desarroyo,
			String juegos, String sistemas, String video, String ciencia,
			String graficos, String internet, String oficina,
			String utilidades, String peliculas, String terror, String risa,
			String entretenimiento, String series) {
		super(audio, educacion, desarroyo, juegos, sistemas, video, ciencia,
				graficos, internet, oficina, utilidades, peliculas);
		Terror = terror;
		Risa = risa;
		Entretenimiento = entretenimiento;
		Series = series;
	}
	
	public void MostrarDatos(){
		System.out.println("Peliculas: "+getPeliculas()+
				"terror: "+Terror+
				"risa: "+Risa+
				"entretenimiento: "+Entretenimiento+
				"series: "+Series);
	}
}
