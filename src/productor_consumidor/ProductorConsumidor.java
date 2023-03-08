package productor_consumidor;

import java.util.LinkedList;

public class ProductorConsumidor {
	public static void main(String[] args) {
        Búfer buffer = new Búfer(5);

        Thread productor = new Thread(new Productor(buffer));
        Thread consumidor = new Thread(new Consumidor(buffer));

        productor.start();
        consumidor.start();
    }
	static class Búfer {
        private LinkedList<Integer> lista;
        private int tamaño;

        public Búfer(int tamaño) {
            this.tamaño = tamaño;
            lista = new LinkedList<>();
        }

        public synchronized void produce(int valor) {
            while (lista.size() == tamaño) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            lista.add(valor);
            System.out.println("Productor produce: " + valor);
            notify();
        }

        public synchronized int consume() {
            while (lista.size() == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            int valor = lista.removeFirst();
            System.out.println("Consumidor consume: " + valor);
            notify();
            return valor;
        }
    }

    static class Productor implements Runnable {
        private Búfer buffer;

        public Productor(Búfer buffer) {
            this.buffer = buffer;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                buffer.produce(i);
                try {
                    Thread.sleep((long) (Math.random() * 1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Consumidor implements Runnable {
        private Búfer buffer;

        public Consumidor(Búfer buffer) {
            this.buffer = buffer;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                int valor = buffer.consume();
                try {
                    Thread.sleep((long) (Math.random() * 1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}