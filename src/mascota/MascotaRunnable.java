package mascota;

import java.util.Scanner;

public class MascotaRunnable implements Runnable {
    private String nombre;
    private int prioridad;

    public MascotaRunnable(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    @Override
    public void run() {
        System.out.println(nombre + " comienza la carrera.");
        for (int c = 1; c <= 30; c++) {
            System.out.print(c + " metros ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\nLlegó a la meta " + nombre);
    }
}
