package pitufo_atrapar;

public class AtraparPitufoMainThread {

	public static void main(String[] args) {
	 String[] nombres = {"Papa pitufo","pitufina","Filosofo","pintor", "Gruño	n", "bromista",
	 "Tímido", "Tontín", "Bonachón"};
	 for (String n : nombres) {
	 AtraparPitufoThread e = new AtraparPitufoThread(n,"Azrael");
	 Thread t = new Thread(e);
	 t.start();
	 }
	}
	}
