package sesion_activa;

import java.util.Scanner;

public class SesionMainRunnable {

	public static void main(String[] args) {
		/*7.- Diseñar un hilo que permita ingresar  los nombres de los usuarios que inician sesión 
		 *  e indicar el tiempo de sesión activa . */
		
		 TiempoSesionRunnable tiempoSesion = new TiempoSesionRunnable();
	        Thread thread = new Thread(tiempoSesion);
	        thread.start();
	        // Esperar a que el usuario presione Enter para detener el programa
	        Scanner scanner = new Scanner(System.in);
	        scanner.nextLine();
	        tiempoSesion.detener();
	    }
}
