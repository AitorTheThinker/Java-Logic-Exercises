package threads6;

import java.util.Scanner;

public class Mascota extends Thread{
	//Ingresar los nombres de tres mascotas e simular una carrera de 30 metros e indicar , quien llego a la meta.
	private String nombre;
	int prioridad;
	
	
	public Mascota(String nombre, int prioridad) {
		this.nombre=nombre;
		this.prioridad=prioridad;
	}
	
	public void run() {
	    System.out.println(nombre + " comienza la carrera.");
	    for (int c = 1; c <= 30; c++) {
	        System.out.print(c + "metros ");
	        try {
	            Thread.sleep(100);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	    System.out.println("\nLlego a la meta " + nombre);
	}
	

}
