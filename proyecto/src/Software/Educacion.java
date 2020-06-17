package Software;

public class Educacion extends Categoria {
	private String Arte;
	private String Astronomia;
	private String Electronica;
	private String Fisica;
	private String Idiomas;
	public Educacion(String audio, String educacion, String desarroyo,
			String juegos, String sistemas, String video, String ciencia,
			String graficos, String internet, String oficina,
			String utilidades, String peliculas, String arte,
			String astronomia, String electronica, String fisica, String idiomas) {
		super(audio, educacion, desarroyo, juegos, sistemas, video, ciencia,
				graficos, internet, oficina, utilidades, peliculas);
		Arte = arte;
		Astronomia = astronomia;
		Electronica = electronica;
		Fisica = fisica;
		Idiomas = idiomas;
	}
	
	public void MostrarDatos(){
		System.out.println("Educacion: "+getEducacion()+
				"Arte: "+Arte+
				"Astronomia: "+Astronomia+
				"Electronica: "+Electronica+
				"fisica: "+Fisica+
				"Idiomas: "+Idiomas);
	}
}
