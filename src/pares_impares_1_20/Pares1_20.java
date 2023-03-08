package pares_impares_1_20;

public class Pares1_20 extends Thread{
	  @Override
	  public void run() {
	    int sum = 0;
	    for (int i = 2; i <= 20; i += 2) {
	      System.out.println("Pares "+i);
	      sum += i;
	    }
	    System.out.println("Suma de los números pares: " + sum);
	  }
}
