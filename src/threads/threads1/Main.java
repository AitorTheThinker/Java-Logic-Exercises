package threads.threads1;

public class Main {

	public static void main(String[] args) {
		for(int i =0; i<5;i++) {
		MultithreadThing myThing= new MultithreadThing(i);
		Thread myThread = new Thread(myThing);
		
		myThing.start();
		try {
			myThing.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

}
}
