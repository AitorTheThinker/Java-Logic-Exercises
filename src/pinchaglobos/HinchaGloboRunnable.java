package pinchaglobos;

public class HinchaGloboRunnable implements Runnable {
    private GlobosRunnable g;
    private int numero;

    public HinchaGloboRunnable(GlobosRunnable pg, int pnumero) {
        g = pg;
        numero = pnumero;
    }

    @Override
    public void run() {
        int manejado;
        boolean estalla; // cierto si se pincha o estalla

        while (true) {
            synchronized (g) {
                if ((manejado = g.dameGlobo()) == -1)
                    break; // me da un globo o -1 si no hay mas
            }
            do {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
                estalla = g.hincho(manejado);
            } while (!estalla);

        } // while(true)
    } // public run
}
