package promedionotas;

public class PromedioAlumnoMainRunnable {
	  public static void main(String[] args) {
	        PromedioAlumnoRunnable runnable = new PromedioAlumnoRunnable();
	        Thread thread = new Thread(runnable);
	        thread.start();
	    }
}
