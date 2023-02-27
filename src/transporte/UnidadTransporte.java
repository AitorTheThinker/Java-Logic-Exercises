package transporte;

public abstract class UnidadTransporte implements Runnable {
    private String tipo;
    private int velocidad;

    public UnidadTransporte(String tipo, int velocidad) {
        this.tipo = tipo;
        this.velocidad = velocidad;
    }

    public void mostrarRecorrido(int distancia) {
        System.out.println(tipo + " recorrió " + distancia + " km.");
    }

    public void mostrarVelocidad() {
        System.out.println(tipo + " está viajando a " + velocidad + " km/h.");
    }

    public void run() {
        try {
            int distanciaRecorrida = 0;
            while (distanciaRecorrida < 50) {
                distanciaRecorrida += velocidad;
                mostrarRecorrido(distanciaRecorrida);
                mostrarVelocidad();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
