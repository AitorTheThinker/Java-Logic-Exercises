package maestro_saludo;

public class MaestroRunnable implements Runnable {

	public void run() {
	    try {
	        // Esperar un tiempo aleatorio para simular la llegada del maestro
	        Thread.sleep(2000);

	        // Imprimir mensaje de llegada
	        System.out.println("El maestro ha llegado al aula.");
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}

}
