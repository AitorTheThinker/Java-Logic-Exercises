package ascensor;

import java.util.concurrent.Semaphore;
import java.util.Random;

public class AscensorRunnable {
    private int pisoActual;
    private Semaphore semaforo;

    public AscensorRunnable() {
        this.pisoActual = 0;
        this.semaforo = new Semaphore(1);
    }

    public void subir(int destino) throws InterruptedException {
        semaforo.acquire();
        System.out.println("Ascensor subiendo de piso " + pisoActual + " a piso " + destino);
        Thread.sleep(1000 * Math.abs(pisoActual - destino)); // simula tiempo de viaje
        pisoActual = destino;
        System.out.println("Ascensor llegó al piso " + pisoActual);
        semaforo.release();
    }

    public void bajar(int destino) throws InterruptedException {
        subir(-destino); // sube al piso opuesto
    }
}

