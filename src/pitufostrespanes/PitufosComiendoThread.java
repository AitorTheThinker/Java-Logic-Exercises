package pitufostrespanes;
/*8.- Elabore un hilo que con 10 nombres de los pitufos comiendo  pan con queso (3), quien termine los tes panes indique que termino. */
public class PitufosComiendoThread extends Thread {

	private String nombre;
    private int panesComidos;

    public PitufosComiendoThread(String nombre) {
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