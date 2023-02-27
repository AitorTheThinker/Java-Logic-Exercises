package estaciones;

import java.util.Scanner;

public class EstacionesRunnable implements Runnable{
	 private String[] estaciones = {"Primavera", "Verano", "Otoño", "Invierno"};
	    private String[][] meses = {
	            {"Marzo", "Abril", "Mayo"},
	            {"Junio", "Julio", "Agosto"},
	            {"Septiembre", "Octubre", "Noviembre"},
	            {"Diciembre", "Enero", "Febrero"}
	    };
	    private int seleccion;

	    public EstacionesRunnable() {
	        seleccion = -1;
	    }

	    @Override
	    public void run() {
	        while (true) {
	            // Mostrar las estaciones
	            System.out.println("Estaciones del año:");
	            for (int i = 0; i < estaciones.length; i++) {
	                System.out.println((i + 1) + ". " + estaciones[i]);
	            }
	            // Leer la selección del usuario
	            System.out.print("Seleccione una estación (1-4): ");
	            Scanner scanner = new Scanner(System.in);
	            seleccion = scanner.nextInt() - 1;
	            // Mostrar los meses correspondientes
	            System.out.println("Meses correspondientes a " + estaciones[seleccion] + ":");
	            for (int i = 0; i < meses[seleccion].length; i++) {
	                System.out.println((i + 1) + ". " + meses[seleccion][i]);
	            }
	            // Esperar 5 segundos antes de volver a mostrar las estaciones
	            try {
	                Thread.sleep(5000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }


}
