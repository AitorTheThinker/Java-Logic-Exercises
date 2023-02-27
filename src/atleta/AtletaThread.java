package atleta;

import java.util.Scanner;

public class AtletaThread extends Thread{
	//3.- Mostrar el nombre de un atleta y simular que corre 30 km.
	private String nombre;
	
	@Override
	public void run() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Muestra el nombre de un atleta");
		nombre=sc.next();
		for(int i=1;i<=30;i++) {
			System.out.println(nombre+"Ha corrido "+i+" KM");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
		System.out.println("Ha llegado a la meta "+nombre);
				e.printStackTrace();
			}
		}
		
		
	}
}
