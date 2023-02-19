package threads4;

public class Numeros extends Thread{
	//2.- Mostrar los números del 1 al 20, con un retardo de tiempo de 1500 mili-segundos con thread
	public void run() {
		for(int i=0;i<=20;i++) {
			System.out.println(" "+i+" ");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
