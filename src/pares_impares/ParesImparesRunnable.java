package pares_impares;

public class ParesImparesRunnable implements Runnable{
	private boolean pares;
    
	public ParesImparesRunnable(boolean pares) {
	    this.pares = pares;
	}

	public void run() {
	    int inicio = pares ? 2 : 1;
	    int fin = pares ? 10 : 9;
	    int suma = 0;
	    for (int i = inicio; i <= fin; i += 2) {
	        System.out.print(i + " ");
	        suma += i;
	    }
	    System.out.println();
	    if (pares) {
	        System.out.println("Suma de números pares: " + suma);
	    } else {
	        System.out.println("Suma de números impares: " + suma);
	    }
	}

}
