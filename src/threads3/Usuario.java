package threads3;

import java.util.Scanner;

public class Usuario extends Thread{
	/*1.- Ingresar el nombre de dos usuarios, 
	 * el día y la hora que ingreso a su centro de labores, 
	 * e indicar si llego temprano o tarde, cabe señalar que la hora de ingreso es a las 8:00. */
	
	private String nombre;
	private String dia;
	private double hora;
	
	public Usuario(String nombre, String dia, double hora) {
		this.nombre=nombre;
		this.dia=dia;
		this.hora=hora;
	}
	
	
	@Override
	public void run() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Ingresa el nombre del usuario ");
		nombre=sc.next();
		System.out.print("Ingresa el día del usuario ");
		dia=sc.next();
		System.out.println("Ingresa la hora del usuario ");
		hora=sc.nextDouble();
		if(hora>8.00) {
			System.out.println(nombre+ "llegó tarde el día "+dia);
		}
		else {
			System.out.println(nombre+"Ha llegado temprano el día "+dia);
		}
		
	}

}
