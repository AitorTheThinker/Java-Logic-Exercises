package restaurante;

public class ClienteRunnable implements Runnable {

    private Restaurante restaurante;
    private int numCliente;

    public ClienteRunnable(Restaurante restaurante, int numCliente) {
        this.restaurante = restaurante;
        this.numCliente = numCliente;
    }

    @Override
    public void run() {
        int camarero;
        while (true) {
            camarero = restaurante.obtenerCamareroDisponible();
            System.out.println("Cliente " + numCliente + " está siendo atendido por camarero " + (camarero + 1));
            try {
                Thread.sleep((long) (Math.random() * 4000));
            } catch (InterruptedException e) {
                // Manejo de excepción
            }
            restaurante.liberarCamarero(camarero);
            if (numCliente >= restaurante.getNumClientes()) {
                break;
            }
        }
    }
}
