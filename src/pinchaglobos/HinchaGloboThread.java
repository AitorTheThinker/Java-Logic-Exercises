package pinchaglobos;

import java.util.Random;

public class HinchaGloboThread extends Thread {
    //Los globos estallan cuando pasan de 10
    private GlobosThread g;
    private int numero;
 
    public HinchaGloboThread(GlobosThread pg,int pnumero) {
        g=pg;
        numero=pnumero;
        setName("HG"+numero);
        start();
    }
 
    @Override
    public void run(){
        int manejado;
        boolean estalla; // cierto si se pincha o estalla
 
        while (true) {
            if ((manejado=g.dameGlobo())==-1) break ; // me da un globo o -1 si no hay mas
            do{
                try {Thread.sleep(1000);} catch (Exception e) {}
                estalla=g.hincho(manejado);
            } while (!estalla);  
 
        } // while(true)
    } // public run
} // public class