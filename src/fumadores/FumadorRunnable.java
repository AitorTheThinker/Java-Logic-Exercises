package fumadores;

import java.util.concurrent.Semaphore;

public class FumadorRunnable implements Runnable {

    private int fumador;
    private Semaphore[] semaforos;

    public FumadorRunnable(int fumador, Semaphore[] semaforos) {
        this.fumador = fumador;
        this.semaforos = semaforos;
    }

    public void run() {
        while (true) {
            try {
                semaforos[fumador - 1].acquire();
                System.out.println("Fumador " + fumador + " toma los ingredientes de la mesa.");
                Thread.sleep((long) (Math.random() * 4000));
                System.out.println("Fumador " + fumador + " ha terminado de fumar.");
            } catch (InterruptedException e) {
            }
        }
    }

}
