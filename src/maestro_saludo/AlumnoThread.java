package maestro_saludo;

import java.util.Random;

public class AlumnoThread extends Thread {

    public void run() {
        try {
            // Esperar un tiempo aleatorio para simular la llegada de los alumnos
            Random random = new Random();
            int tiempoEspera = random.nextInt(5000);
            Thread.sleep(tiempoEspera);

            // Imprimir mensaje de llegada y saludar al maestro
            System.out.println("Un alumno ha llegado al aula.");
            Thread.sleep(1000);
            System.out.println("¡Buenos días, maestro!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
