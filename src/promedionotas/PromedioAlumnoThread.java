package promedionotas;

import java.util.Scanner;

public class PromedioAlumnoThread extends Thread {
    private double[] notas;
    private double promedio;

    public PromedioAlumnoThread() {
        this.notas = new double[5];
        this.promedio = 0.0;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            promedio += notas[i];
            System.out.println("Se ha agregado la nota " + notas[i] + ". El promedio actual es: " + (promedio / (i + 1)));
        }
        promedio /= notas.length;
        System.out.println("El promedio del alumno es: " + promedio);
    }
}
