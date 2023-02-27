package mascota;

import java.util.Scanner;

public class MascotaMainRunnable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 3;

        MascotaRunnable[] participantes = new MascotaRunnable[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el nombre del participante " + (i + 1) + ": ");
            String nombre = scanner.next();
            System.out.print("Ingrese la prioridad para el participante " + nombre + ": ");
            int prioridad = scanner.nextInt();
            participantes[i] = new MascotaRunnable(nombre, prioridad);
        }

        for (MascotaRunnable participante : participantes) {
            Thread t = new Thread(participante);
            t.start();
        }
    }
}
