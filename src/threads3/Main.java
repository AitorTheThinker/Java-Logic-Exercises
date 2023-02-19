package threads3;

public class Main {

	public static void main(String[] args) {
		/*1.- Ingresar el nombre de dos usuarios, 
		 * el día y la hora que ingreso a su centro de labores, 
		 * e indicar si llego temprano o tarde, cabe señalar que la hora de ingreso es a las 8:00. */


	Thread usuario1= new Usuario("","",0);
	usuario1.start();
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	Thread usuario2= new Usuario(" "," ",0);
	usuario2.start();
	
	}
}
