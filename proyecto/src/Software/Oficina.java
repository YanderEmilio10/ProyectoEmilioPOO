package Software;

public class Oficina extends Categoria{
	private String Diagrama;
	private String BaseDeDatos;
	private String Calendario;
	private String Finanzas;
	public Oficina(String audio, String educacion, String desarroyo,
			String juegos, String sistemas, String video, String ciencia,
			String graficos, String internet, String oficina,
			String utilidades, String peliculas, String diagrama,
			String baseDeDatos, String calendario, String finanzas) {
		super(audio, educacion, desarroyo, juegos, sistemas, video, ciencia,
				graficos, internet, oficina, utilidades, peliculas);
		Diagrama = diagrama;
		BaseDeDatos = baseDeDatos;
		Calendario = calendario;
		Finanzas = finanzas;
	}
	
	public void MostrarDatos(){
		System.out.println("Oficina: "+getOficina()+
				"Diagrama: "+Diagrama+
				"Base de datos: "+BaseDeDatos+
				"Calendario: "+Calendario+
				"Finanzas: "+Finanzas);
	}
}
