package pitufostrespanes;

public class PitufosComiendoRunnable implements Runnable{
	 private String nombre;
	  private int panesComidos;

	    public PitufosComiendoRunnable(String nombre) {
	        this.nombre = nombre;
	        this.panesComidos = 0;
	    }

	    public void run() {
	        for (int i = 0; i < 3; i++) {
	            panesComidos++;
	            System.out.println(nombre + " ha comido un pan con queso. Total: " + panesComidos);
	        }
	        System.out.println(nombre + " ha terminado de comer.");
	    }
}
