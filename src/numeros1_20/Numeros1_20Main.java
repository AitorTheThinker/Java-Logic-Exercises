package numeros1_20;

public class Numeros1_20Main {

	public static void main(String[] args) {
		//2.- Mostrar los números del 1 al 20, con un retardo de tiempo de 1500 mili-segundos con thread

		Numeros1_20Thread hilo1= new Numeros1_20Thread();
		hilo1.start();

	}
}

//2.- Mostrar los números del 1 al 20, con un retardo de tiempo de 1500 mili-segundos con Runnable

//Runnable numeros = new Numeros();
//Thread hilo1 = new Thread(numeros);
//hilo1.start();
//}