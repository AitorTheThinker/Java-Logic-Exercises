package barberosdurmientes;

import java.util.Queue;

public class ClienteRunnable implements Runnable{

	private Object lock;
    private Queue<Integer> clientesEsperando;
    private int sillasOcupadas;
    private int id;
    private int numSillas;

    public ClienteRunnable(Object lock, Queue<Integer> clientesEsperando, int sillasOcupadas, int id, int numSillas) {
        this.lock = lock;
        this.clientesEsperando = clientesEsperando;
        this.sillasOcupadas = sillasOcupadas;
        this.id = id;
        this.numSillas = numSillas;
    }

    public void run() {
        synchronized (lock) {
            if (sillasOcupadas < numSillas) {
                sillasOcupadas++;
                clientesEsperando.add(id);
                System.out.println("Cliente " + id + " espera en la sala de espera");
                if (clientesEsperando.size() == 1) {
                    lock.notify();
                }
            } else {
                System.out.println("Cliente " + id + " se va, no hay sillas disponibles");
            }
        }
    }
}