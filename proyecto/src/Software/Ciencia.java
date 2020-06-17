package Software;

public class Ciencia extends Categoria {
	private String Electricidad;
	private String Electronica;
	private String Literatura;
	private String Matematicas;
	public Ciencia(String audio, String educacion, String desarroyo,
			String juegos, String sistemas, String video, String ciencia,
			String graficos, String internet, String oficina,
			String utilidades, String peliculas, String electricidad,
			String electronica, String literatura, String matematicas) {
		super(audio, educacion, desarroyo, juegos, sistemas, video, ciencia,
				graficos, internet, oficina, utilidades, peliculas);
		Electricidad = electricidad;
		Electronica = electronica;
		Literatura = literatura;
		Matematicas = matematicas;
	}

	public void MostrarDatos(){
		System.out.println("Ciencia: "+getCiencia()+
				"Electricidad: "+Electricidad+
				"Electronica: "+Electronica+
				"Literatura: "+Literatura+
				"Matematicas: "+Matematicas);
	}
}
