package filosofos;

public class FilosofoMainRunnable {

	public static void main(String[] args) {
		
        FilosofoMesaRunnable mesa = new FilosofoMesaRunnable(5);
        for (int i = 1; i <= 5; i++) {
            Runnable filosofo = new FilosofoRunnable(mesa, i);
            Thread hilo = new Thread(filosofo);
            hilo.start();   
            
        }
	}
}
	