package Software;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Principal {
	public static void main (String[] args) {
		Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; 
 
        while (!salir) {
 
            System.out.println("1. audio");
            System.out.println("2. ciencia");
            System.out.println("3. desarroyo");
            System.out.println("4. educacion");
            System.out.println("5. graficos");
            System.out.println("6. internet");
            System.out.println("7. juegos");
            System.out.println("8. oficina");
            System.out.println("9. peliculas");
            System.out.println("10. sistemas");
            System.out.println("11. utilidades");
            System.out.println("12. video");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                    	System.out.println("usted escogio la opcion audio");
                    	Audio audio1;
                    	audio1 = new Audio("Audacity, Banshee, Musica", "", "", "", "", "", null, null, null, null, null, null, null, null, null, null, null);
                    	audio1.MostrarDatos();
                    case 2:
                    	System.out.println("usted escogio la opcion ciencia");
                    	Ciencia ciencia1;
                    	ciencia1 = new Ciencia("", "", "", "", "", "", null, null, null, null, null, null, null, null, null, null);
                    	ciencia1.MostrarDatos();
                    case 3:
                    	System.out.println("usted escogio la opcion desarroyo");
                    	Desarroyo desarroyo1;
                    	desarroyo1 = new Desarroyo("", "", "", "", "", "", null, null, null, null, null, null, null, null, null, null);
                    	desarroyo1.MostrarDatos();
                    case 4:
                    	System.out.println("usted escogio la opcion educacion");
                    	Educacion educacion1;
                    	educacion1 = new Educacion("", "", "", "", "", "", null, null, null, null, null, null, null, null, null, null, null);
                    	educacion1.MostrarDatos();
                    case 5:
                    	System.out.println("usted escogio la opcion graficos");
                    	Graficos graficos1;
                    	graficos1 = new Graficos("", "", "", "", "", "", null, null, null, null, null, null, null, null, null, null);
                    	graficos1.MostrarDatos();
                    case 6:
                    	System.out.println("usted escogio la opcion internet");
                    	Internet internet1;
                    	internet1 = new Internet("", "", "", "", "", "", null, null, null, null, null, null, null, null, null, null, null);
                    	internet1.MostrarDatos();
                    case 7:
                    	System.out.println("usted escogio la opcion juegos");
                    	Juegos juegos1;
                    	juegos1 = new Juegos("", "", "", "", "", "", null, null, null, null, null, null, null, null, null, null, null);
                    	juegos1.MostrarDatos();
                    case 8:
                    	System.out.println("usted escogio la opcion oficina");
                    	Oficina oficina1;
                    	oficina1 = new Oficina("", "", "", "", "", "", null, null, null, null, null, null, null, null, null, null);
                    	oficina1.MostrarDatos();
                    case 9:
                    	System.out.println("usted escogio la opcion peliculas");
                    	Peliculas peliculas1;
                    	peliculas1 = new Peliculas("", "", "", "", "", "", null, null, null, null, null, null, null, null, null, null);
                    	peliculas1.MostrarDatos();
                    case 10:
                    	System.out.println("usted escogio la opcion sistemas");
                    	Sistemas sistemas1;
                    	sistemas1 = new Sistemas("", "", "", "", "", "", null, null, null, null, null, null, null, null, null, null, null);
                    	sistemas1.MostrarDatos();
                    case 11:
                    	System.out.println("usted escogio la opcion utilidades");
                    	Utilidades utilidades1;
                    	utilidades1 = new Utilidades("", "", "", "", "", "", null, null, null, null, null, null, null, null, null, null);
                    	utilidades1.MostrarDatos();
                    case 12:
                    	System.out.println("usted escogio la opcion video");
                    	Video video1;
                    	video1 = new Video("", "", "", "", "", "", null, null, null, null, null, null, null, null, null);
                    	video1.MostrarDatos();
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
 
    }
}
