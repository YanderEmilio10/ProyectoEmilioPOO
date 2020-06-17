package Software;

public class Desarroyo extends Categoria {
	private String BaseDeDatos;
	private String Compilacion;
	private String DesarrolladorWed;
	private String Traduccion;
	public Desarroyo(String audio, String educacion, String desarroyo,
			String juegos, String sistemas, String video, String ciencia,
			String graficos, String internet, String oficina,
			String utilidades, String peliculas, String baseDeDatos,
			String compilacion, String desarrolladorWed, String traduccion) {
		super(audio, educacion, desarroyo, juegos, sistemas, video, ciencia,
				graficos, internet, oficina, utilidades, peliculas);
		BaseDeDatos = baseDeDatos;
		Compilacion = compilacion;
		DesarrolladorWed = desarrolladorWed;
		Traduccion = traduccion;
	}
	
	public void MostrarDatos(){
		System.out.println("Desarrollo: "+getDesarroyo()+
				"Base de datos: "+BaseDeDatos+
				"Compilacion: "+Compilacion+
				"Desarollador wed: "+DesarrolladorWed+
				"Traduccion: "+Traduccion);
	}
}
