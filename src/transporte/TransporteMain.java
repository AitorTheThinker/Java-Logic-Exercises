package transporte;

public class TransporteMain {

	public static void main(String[] args) {
		//15.- Mostrar el recorrido de 3 unidades de transporte(auto,moto y combi), empleando métodos y clases independientes:
		 UnidadTransporte auto = new Auto();
	     UnidadTransporte moto = new Moto();
	     UnidadTransporte combi = new Combi();

	        Thread autoThread = new Thread(auto);
	        Thread motoThread = new Thread(moto);
	        Thread combiThread = new Thread(combi);

	        autoThread.start();
	        motoThread.start();
	        combiThread.start();
	}

}
