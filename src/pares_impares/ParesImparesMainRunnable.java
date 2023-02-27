package pares_impares;

public class ParesImparesMainRunnable {

	public static void main(String[] args) {
	    ParesImparesRunnable paresRunnable = new ParesImparesRunnable(true);
	    ParesImparesRunnable imparesRunnable = new ParesImparesRunnable(false);

	    Thread hiloPares1 = new Thread(paresRunnable);
	    Thread hiloPares2 = new Thread(paresRunnable);
	    Thread hiloImpares1 = new Thread(imparesRunnable);
	    Thread hiloImpares2 = new Thread(imparesRunnable);

	    hiloPares1.start();
	    hiloPares2.start();
	    hiloImpares1.start();
	    hiloImpares2.start();
	}
}
