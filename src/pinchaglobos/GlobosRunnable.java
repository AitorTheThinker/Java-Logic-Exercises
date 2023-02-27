package pinchaglobos;

public class GlobosRunnable {
 
    private int maxHinchando=3;     // Número máximo de globos hinchando a la vez
    private int maxGlobos=10;        // Número máximo de globos en el almacén
    private int maxVolumen=5;          // Volumen máximo del globo
    private int nGlobo=1;             // Número del globo para dar, inicialmente 1
    private int hinchandoAhora=0;     // Cuántos se están hinchando ahora mismo
    private int globos[];
    // Si vale 0 el globo no está dado
    // Si vale 1 a maxVolumen está dado e indica su volumen
    // Si vale maxVolumen+1 está roto
    // Si vale maxVolumen+2 está pinchado
 
    public GlobosRunnable() {    // Constructor de Globos
        globos=new int[maxGlobos];
        for (int i=0;i<maxGlobos;i++) globos[i]=0; // Rellenamos el almacén a 0, (ninguno dado).
    } 
 
    public synchronized int dameGlobo() { // Método que devuelve el siguiente globo del almacen, si no quedan devuelve -1
 
        while (hinchandoAhora==maxHinchando && nGlobo!=maxGlobos+1)  { // Me espero si ya hay maxHinchando y quedan globos por dar
            try {wait();} catch (Exception e) {}
        }
 
        if (nGlobo==maxGlobos+1) return -1; // Retorno un -1 si no quedan globos por dar
        globos[nGlobo-1]=1;                 // Cambio el 0 del almacen de globos por 1 (entregado a HinchaGlobos)
        System.out.println("GLOBO "+nGlobo+" ENTREGADO A "+Thread.currentThread().getName());    //Informo por consola a que hilo se le da el globo
        hinchandoAhora++;     //Sumo 1 al hinchaAhora
        notifyAll();        //Notifico a todos que hay un cambio
        return nGlobo++;    //Retorno el globo
    }
 
    public synchronized boolean pincho() { // Método que pincha un globo, si no quedan devuelve true
 
        while (hinchandoAhora==0 && nGlobo!=maxGlobos+1){    // Me espero si no hay hinchando y quedan por pinchar
            try {wait();} catch (Exception e) {}
        }
 
        if (nGlobo==maxGlobos+1) return true;    // Me aseguro de salir porque ha cambiado hinchando
 
        for (int i=0;i<maxGlobos;i++)    // Busco un globo para pinchar dentro del almacen
            if (globos[i]>0 && globos[i]<=maxVolumen) {
                System.out.println("GLOBO"+(i+1)+" LO PINCHA "+Thread.currentThread().getName());
                globos[i]=maxVolumen+2;
                hinchandoAhora--;
                notifyAll();
                break;
            }
 
        return hinchandoAhora!=0;
    }
 
    public synchronized boolean hincho(int num) {
 
        if (globos[num-1]<=maxVolumen) globos[num-1]++;    // Puede que ya esté estallado, se comprueba
        else return true;                                // si estuviera estallado, pinchado o estallase dev true
 
        if (globos[num-1]==maxVolumen+1){    // Si lo he estallado lo notifico
            hinchandoAhora--;
            System.out.println("GLOBO "+num+ " ESTALLA");
            notifyAll();
            return true;
        }
        else {
            System.out.println("GLOBO "+num+" VOLUMEN "+globos[num-1]);
            return false;
        }
    }
}