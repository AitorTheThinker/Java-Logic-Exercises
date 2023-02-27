package pitufo_atrapar;

public class AtraparPitufoThread implements Runnable{

	 private String nombre;
	 private String gato;
	 public AtraparPitufoThread(String nombre ,String gato) {
	 this.nombre = nombre;
	 this.gato = gato;
	 }
	 
	public void run() {
	 for (int a = 1; a < 2; a++) {
	 System.out.println(nombre + " corre");
	 }
	 System.out.printf("%s \n", gato +" atrapa a "+ nombre);
	 }
	
	public static void main(String[] args) {
	 String[] nombres = {"Papa pitufo","pitufina","Filósofo","pintor", "Gruñón", "bromista",
	 "Tímido", "Tontín", "Bonachón"};
	 for (String nomb : nombres) {
	 AtraparPitufoThread e = new AtraparPitufoThread(nomb,"Azrael");
	 Thread t = new Thread(e);
	 t.start();
	 }
	}
	}
