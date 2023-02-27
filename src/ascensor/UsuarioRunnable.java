package ascensor;

import java.util.Random;

public class UsuarioRunnable implements Runnable {
    private AscensorRunnable ascensor;
    private int pisoActual;
    private int destino;

    public UsuarioRunnable(AscensorRunnable ascensor, int pisoActual) {
        this.ascensor = ascensor;
        this.pisoActual = pisoActual;
        Random random = new Random();
        do {
            destino = random.nextInt(5) + 1; // elige un piso al azar entre 1 y 5
        } while (destino == pisoActual);
        if (pisoActual == 0) {
            destino = 1; // si se encuentra en el piso 0, va al piso 1
        }
    }

    @Override
    public void run() {
        try {
            System.out.println("Usuario en piso " + pisoActual + " quiere ir al piso " + destino);
            if (pisoActual < destino) {
                ascensor.subir(destino);
            } else {
                ascensor.bajar(destino);
            }
            System.out.println("Usuario en piso " + destino + " ha llegado a su destino");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
