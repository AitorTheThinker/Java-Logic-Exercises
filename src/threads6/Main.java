package threads6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Ingresar los nombres de tres mascotas e simular una carrera de 30 metros e indicar , quien llego a la meta.
		
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingrese el número de participantes(mascotas): ");
	        int n = scanner.nextInt();

	        Mascota[] participantes = new Mascota[n];

	        for (int i = 0; i < n; i++) {
	            System.out.print("Ingrese el nombre del participante " + (i + 1) + ": ");
	            String nombre = scanner.next();
	            System.out.print("Ingrese la prioridad para el participante " + nombre + ": ");
	            int prioridad = scanner.nextInt();
	            participantes[i] = new Mascota(nombre, prioridad);
	        }

	        for (Mascota participante : participantes) {
	            participante.start();
	        }

	        for (Mascota participante : participantes) {
	            try {
					participante.join();
				} catch (InterruptedException e) {
				
					e.printStackTrace();
				}
	        }
	    }
}
