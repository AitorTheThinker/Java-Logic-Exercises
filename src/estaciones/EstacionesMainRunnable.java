package estaciones;

public class EstacionesMainRunnable {

	public static void main(String[] args) {
		/*6.- Mostrar las estaciones del año en un 
		arreglo y si selecciona una estación indicar los meses que le corresponden, mostrando los meses con una escala de tiempo.*/
		 EstacionesRunnable estacionesDelAnio = new EstacionesRunnable();
	        Thread thread = new Thread(estacionesDelAnio);
	        thread.start();
	}

}
