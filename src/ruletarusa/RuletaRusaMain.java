package ruletarusa;

public class RuletaRusaMain {
	 public static void main(String[] args) {
         
	        Juego juego = new Juego(2);
	         
	        while( !juego.finJuego() ){
	            juego.ronda();            
	            //juego.rondaV2();
	        }
	         
	        System.out.println("El juego ha terminado");
	         
}
}
