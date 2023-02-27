package operaciones;

import java.util.Scanner;

public class OperacionesMain {

	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter two numbers: ");
	        double num1 = scanner.nextDouble();
	        double num2 = scanner.nextDouble();
	        System.out.println("Select an operation (+, -, *, /): ");
	        String operator = scanner.next();

	        OperacionesThread thread = new OperacionesThread(num1, num2, operator);
	        thread.start();
	    }

}
