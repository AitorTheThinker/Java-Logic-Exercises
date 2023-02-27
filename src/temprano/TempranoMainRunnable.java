package temprano;

public class TempranoMainRunnable {
	  public static void main(String[] args) {
	        Thread usuario1 = new Thread(new UsuarioRunnable());
	        usuario1.start();
	        try {
	            Thread.sleep(10000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        Thread usuario2 = new Thread(new UsuarioRunnable());
	        usuario2.start();
	    }
}
