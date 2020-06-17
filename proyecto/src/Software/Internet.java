package Software;

public class Internet extends Categoria {
	private String Navegadores;
	private String Conversacion;
	private String Correos;
	private String Noticias;
	private String Telefonia;
	public Internet(String audio, String educacion, String desarroyo,
			String juegos, String sistemas, String video, String ciencia,
			String graficos, String internet, String oficina,
			String utilidades, String peliculas, String navegadores,
			String conversacion, String correos, String noticias,
			String telefonia) {
		super(audio, educacion, desarroyo, juegos, sistemas, video, ciencia,
				graficos, internet, oficina, utilidades, peliculas);
		Navegadores = navegadores;
		Conversacion = conversacion;
		Correos = correos;
		Noticias = noticias;
		Telefonia = telefonia;
	}
	
public void MostrarDatos(){
	System.out.println("Internet: "+getInternet()+
			"Navegadores: "+Navegadores+
			"Conversaciones: "+Conversacion+
			"Correos: "+Correos+
			"Noticias: "+Noticias+
			"Telefonia: "+Telefonia);
}
}
