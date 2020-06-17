package Software;

public class Graficos extends Categoria {
	private String Escaneado;
	private String Grafico;
	private String Vectores;
	private String Visor;
	public Graficos(String audio, String educacion, String desarroyo,
			String juegos, String sistemas, String video, String ciencia,
			String graficos, String internet, String oficina,
			String utilidades, String peliculas, String escaneado,
			String grafico, String vectores, String visor) {
		super(audio, educacion, desarroyo, juegos, sistemas, video, ciencia,
				graficos, internet, oficina, utilidades, peliculas);
		Escaneado = escaneado;
		Grafico = grafico;
		Vectores = vectores;
		Visor = visor;
	}
	
public void MostrarDatos(){
	System.out.println("Graficos: "+getGraficos()+
			"Escaneado: "+Escaneado+
			"Graficos: "+Grafico+
			"vectores: "+Vectores+
			"Visor: "+Visor);
}
}
