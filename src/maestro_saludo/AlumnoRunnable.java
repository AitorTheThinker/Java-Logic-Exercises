package maestro_saludo;

import java.util.Random;

public class AlumnoRunnable implements Runnable{

	public void run() {
	    try {
	        // Esperar un tiempo aleatorio para simular la llegada del maestro
	        Random random = new Random();
	        int tiempoEspera = random.nextInt(5000);
	        Thread.sleep(tiempoEspera);

	        // Imprimir mensaje de llegada del maestro
	        System.out.println("El maestro ha llegado al aula.");

	        // Crear y lanzar hilos para cada alumno
	        Thread[] hilosAlumnos = new Thread[10];
	        for (int i = 0; i < hilosAlumnos.length; i++) {
	            hilosAlumnos[i] = new Thread(new AlumnoRunnable());
	            hilosAlumnos[i].start();
	        }

	        // Esperar a que todos los hilos de los alumnos terminen
	        for (int i = 0; i < hilosAlumnos.length; i++) {
	            hilosAlumnos[i].join();
	        }
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}
}