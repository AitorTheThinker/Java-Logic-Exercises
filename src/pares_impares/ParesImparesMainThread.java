package pares_impares;

public class ParesImparesMainThread {

	public static void main(String[] args) {
		/* 5.- Implemente un programa en java que use hilos independientes, en clases diferentes.
		 *  Un hilo imprime números pares del 1 al 10 y la suma de dichos números, y otro hilo que imprime números impares del 1 al 10. 
		 * Cree dos instancias (hilos) de cada uno y muestre la salida. Realice el programa utilizando herencia en otra clase.
		 * 
		 * */
		
		        ParesImparesThread hiloPares1 = new ParesImparesThread(true);
		        ParesImparesThread hiloPares2 = new ParesImparesThread(true);
		        ParesImparesThread hiloImpares1 = new ParesImparesThread(false);
		        ParesImparesThread hiloImpares2 = new ParesImparesThread(false);
		        
		        hiloPares1.start();
		        hiloPares2.start();
		        hiloImpares1.start();
		        hiloImpares2.start();
		    }
	}
