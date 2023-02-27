package temprano;

public class TempranoMainThread {

	public static void main(String[] args) {
	Thread usuario1= new UsuarioThread("","",0);
	usuario1.start();
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	Thread usuario2= new UsuarioThread(" "," ",0);
	usuario2.start();
	
	}
}
