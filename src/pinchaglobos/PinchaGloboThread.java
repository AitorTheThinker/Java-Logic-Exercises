package pinchaglobos;

import java.util.Random;

public class PinchaGloboThread extends Thread{
    private GlobosThread g;
    private int numero;
    public PinchaGloboThread(GlobosThread pg,int pnumero){
        g=pg;
        numero=pnumero;
        setName("PG"+numero);
        start();
    }
 
    @Override
    public void run(){
        int num;
        boolean nohaymas;
        do{
            try {Thread.sleep((int)(Math.random()*5000));} catch (Exception e) {}
            // Si no quedan globos tengo que dejar de pinchar
            nohaymas=g.pincho();
        } while (!nohaymas); // while true
    } // public run
} // public class