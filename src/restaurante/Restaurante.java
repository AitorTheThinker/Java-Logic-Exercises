package restaurante;

public class Restaurante {
	private boolean[] camarerosDisponibles;
    private int numCamareros;
    private int numClientes;

    public Restaurante(int numCamareros, int numClientes) {
        this.numCamareros = numCamareros;
        this.numClientes = numClientes;
        this.camarerosDisponibles = new boolean[numCamareros];
        for (int i = 0; i < numCamareros; i++) {
            camarerosDisponibles[i] = true;
        }
    }
    public synchronized int obtenerCamareroDisponible() {
        while (true) {
            for (int i = 0; i < numCamareros; i++) {
                if (camarerosDisponibles[i]) {
                    camarerosDisponibles[i] = false;
                    return i;
                }
            }
            try {
                wait();
            } catch (InterruptedException e) {
                // Manejo de excepción
            }
        }
    }

    public synchronized void liberarCamarero(int camarero) {
        camarerosDisponibles[camarero] = true;
        notifyAll();
    }

    public int getNumClientes() {
        return numClientes;
    }
}
