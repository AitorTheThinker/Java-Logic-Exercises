package fumadores;

import java.util.concurrent.Semaphore;

class AgenteRunnable implements Runnable {

    private Semaphore[] semaforos;

    public AgenteRunnable(Semaphore[] semaforos) {
        this.semaforos = semaforos;
    }

    public void run() {
        while (true) {
            int ingrediente1 = (int) (Math.random() * 3);
            int ingrediente2 = (int) (Math.random() * 3);
            while (ingrediente1 == ingrediente2) {
                ingrediente2 = (int) (Math.random() * 3);
            }
            System.out.println("Agente pone " + ingrediente1 + " y " + ingrediente2 + " en la mesa.");
            semaforos[ingrediente1].release();
            semaforos[ingrediente2].release();
            try {
                Thread.sleep((long) (Math.random() * 4000));
            } catch (InterruptedException e) {
            }
        }
    }

}