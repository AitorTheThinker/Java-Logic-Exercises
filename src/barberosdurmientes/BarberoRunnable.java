package barberosdurmientes;

import java.util.Queue;

public class BarberoRunnable implements Runnable {
	 
    private Object lock;
    private Queue<Integer> clientesEsperando;
    private int sillasOcupadas;
    private boolean barberoDurmiente;
    
    public BarberoRunnable(Object lock, Queue<Integer> clientesEsperando) {
        this.lock = lock;
        this.clientesEsperando = clientesEsperando;
        this.sillasOcupadas = 0;
        this.barberoDurmiente = true;
    }

    public void run() {
        while (true) {
            int cliente = 0;
            synchronized (lock) {
                if (clientesEsperando.isEmpty()) {
                    barberoDurmiente = true;
                    System.out.println("Barbero duerme");
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    barberoDurmiente = false;
                    cliente = clientesEsperando.poll();
                    sillasOcupadas--;
                }
            }
            if (cliente != 0) {
                System.out.println("Barbero atiende al cliente " + cliente);
                try {
                    Thread.sleep((long) (Math.random() * 5000 + 1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
