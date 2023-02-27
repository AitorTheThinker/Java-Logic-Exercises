package llamada;

public class LlamadaMarcaMainRunnable {
	public static void main(String[] args) {
        LlamadaMarcaRunnable runnable = new LlamadaMarcaRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
