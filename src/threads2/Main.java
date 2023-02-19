package threads2;

public class Main {

	public static void main(String[] args) {
		//Letras de la "a" a la "z" y numeros 1 al 30
		HiloNumeroLetras h1= new HiloNumeroLetras(1);
		HiloNumeroLetras h2= new HiloNumeroLetras(2);
		
		Thread t1= new Thread(h1);
		Thread t2= new Thread(h2);
		
		t1.start();
		t2.start();

	}

}
