package Software;

public class Utilidades extends Categoria{
	private String Accecibilidad;
	private String Archivado;
	private String Calculadora;
	private String EditorTexto;
	public Utilidades(String audio, String educacion, String desarroyo,
			String juegos, String sistemas, String video, String ciencia,
			String graficos, String internet, String oficina,
			String utilidades, String peliculas, String accecibilidad,
			String archivado, String calculadora, String editorTexto) {
		super(audio, educacion, desarroyo, juegos, sistemas, video, ciencia,
				graficos, internet, oficina, utilidades, peliculas);
		Accecibilidad = accecibilidad;
		Archivado = archivado;
		Calculadora = calculadora;
		EditorTexto = editorTexto;
	}
	
	public void MostrarDatos(){
		System.out.println("Utilidades: "+getUtilidades()+
				"Accecibilidad: "+Accecibilidad+
				"Archivado: "+Archivado+
				"Calculadora: "+Calculadora+
				"Editor de texto: "+EditorTexto);
	}
}
