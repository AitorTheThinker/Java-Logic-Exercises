package filosofos;

public class FilosofoMainThread {

	public static void main(String[] args) {
		
        FilosofoMesaThread m = new FilosofoMesaThread(5);
        for (int i = 1; i <= 5; i++) {
            FilosofoThread f = new FilosofoThread(m, i);
            f.start();   
         
		}
	}
}
