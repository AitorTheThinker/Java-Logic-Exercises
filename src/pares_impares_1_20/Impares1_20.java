package pares_impares_1_20;

public class Impares1_20 extends Thread{

	 @Override
	  public void run() {
	    for (int i = 1; i <= 20; i += 2) {
	      System.out.println("Impares " + i);
	    }
	  }
}
