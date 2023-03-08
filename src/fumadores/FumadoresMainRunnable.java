package fumadores;

import java.util.concurrent.Semaphore;

public class FumadoresMainRunnable {
	 public static void main(String[] args) {

	        Semaphore[] semaforos = new Semaphore[3];
	        for (int i = 0; i < semaforos.length; i++) {
	            semaforos[i] = new Semaphore(0);
	        }

	        AgenteRunnable agente = new AgenteRunnable(semaforos);
	        Thread agenteHilo = new Thread(agente);
	        agenteHilo.start();

	        for (int i = 1; i <= 3; i++) {
	            Runnable fumador = new FumadorRunnable(i, semaforos);
	            Thread fumadorHilo = new Thread(fumador);
	            fumadorHilo.start();
	        }
	    }
}
