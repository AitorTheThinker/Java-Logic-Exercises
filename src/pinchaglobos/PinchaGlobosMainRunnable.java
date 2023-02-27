package pinchaglobos;

public class PinchaGlobosMainRunnable {

	public static void main(String[] args) {
	    GlobosRunnable globos = new GlobosRunnable(); // Creamos una instancia de Globos

	    // Creamos 5 hilos de HinchaGlobo y 5 de PinchaGlobo
	    for (int i = 1; i <= 5; i++) {
	        HinchaGloboRunnable hg = new HinchaGloboRunnable(globos, i);
	        PinchaGloboRunnable pg = new PinchaGloboRunnable(globos, i);
	        new Thread(hg).start();
	        new Thread(pg).start();
	    }
	}

}
