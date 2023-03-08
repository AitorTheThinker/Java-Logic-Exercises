package pares_impares_1_20;


public class Pares_impares_Main {
	public static void main(String[]args){
		/*  Realiza un programa que use hilos independientes, es decir, que
			ejecuten clases diferentes que hereden de Thread. El hilo 1 imprimirá
			los números pares del 1 al 20 y el resultado de su suma. El hilo 2
			mostrará los número impares del 1 al 20.
			Desde la clase principal se creará un hilo de cada clase que deben estar
			sincronizados entre sí.
		*/

		 Thread Pares = new Pares1_20();
		 Thread Impares = new Impares1_20();
		    
		 Pares.run();
		 Impares.run();
		 
		 try {
			Pares.join();
			Impares.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}
