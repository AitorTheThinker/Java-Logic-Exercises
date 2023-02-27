package cartasspainplus;

public class BarajaFrance extends Baraja {
	 
    public BarajaFrance() {
        super();
 
        this.numCartas = 52;
        this.cartasPorPalo = 13;
 
        crearBaraja(); //Creamos la baraja
        super.barajar(); // barajamos la baraja
    }
 
    @Override
    public void crearBaraja() {
 
        this.cartas = (Carta<PalosBarajaFrance>[]) new Carta[numCartas];
 
        PalosBarajaFrance[] palos = PalosBarajaFrance.values();
 
        //Recorro los palos
        for (int i = 0; i < palos.length; i++) {
 
            //Recorro los numeros
            for (int j = 0; j < cartasPorPalo; j++) {
                cartas[((i * cartasPorPalo) + j)] = new Carta(j + 1, palos[i]);
            }
 
        }
 
    }
 
    public boolean cartaRoja(Carta<PalosBarajaFrance> c) {
        return c.getPalo() == PalosBarajaFrance.CORAZONES || c.getPalo() == PalosBarajaFrance.DIAMANTES;
    }
 
    public boolean cartaNegra(Carta<PalosBarajaFrance> c) {
        return c.getPalo() == PalosBarajaFrance.TREBOLES || c.getPalo() == PalosBarajaFrance.PICAS;
    }
 
}
