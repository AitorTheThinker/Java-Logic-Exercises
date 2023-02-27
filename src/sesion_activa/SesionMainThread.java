package sesion_activa;

import java.util.Scanner;

public class SesionMainThread {

    public static void main(String[] args) {
        /*7.- Diseñar un hilo que permita ingresar  los nombres de los usuarios que inician sesión 
         *  e indicar el tiempo de sesión activa . */
        TiempoSesionThread tiempoSesion = new TiempoSesionThread();
        tiempoSesion.start();
        // Esperar a que el usuario presione Enter para detener el programa
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        tiempoSesion.detener();
    }
}
