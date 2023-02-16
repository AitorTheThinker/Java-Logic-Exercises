package threads.threads1;

public class MultithreadThing  extends Thread{
private int threadNumber;

	public MultithreadThing(int threadNumber) {
		this.setThreadNumber(threadNumber);
	}
	public int getThreadNumber() {
		return threadNumber;
	}

	public void setThreadNumber(int threadNumber) {
		this.threadNumber = threadNumber;
	}
	@Override
	public void run() {
	for (int i=1; i<=5; i++) {
		System.out.println(i+"from thread"+ threadNumber);
	}
	try {
		Thread.sleep(1000);
	}catch(InterruptedException e) {
	}
}


}
