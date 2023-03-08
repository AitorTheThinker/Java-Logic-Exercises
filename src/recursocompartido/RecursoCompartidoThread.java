package recursocompartido;

import java.util.ArrayList;
import java.util.List;

public class RecursoCompartidoThread {
    
    public static void main(String[] args) {
        RecursoCompartido recurso = new RecursoCompartido();
        List<Thread> procesos = new ArrayList<>();
        
        // Creamos varios procesos con distintas prioridades y los iniciamos
        procesos.add(new ProcesoThread(recurso, 1));
        procesos.add(new ProcesoThread(recurso, 2));
        procesos.add(new ProcesoThread(recurso, 3));
        procesos.add(new ProcesoThread(recurso, 1));
        procesos.add(new ProcesoThread(recurso, 3));
        
        for (Thread proceso : procesos) {
            proceso.start();
        }
    }
    
    public static class RecursoCompartido {
        private int recurso = 0;
        private int prioridadMaxima = 0;
        
        public synchronized void acceder(int prioridad) throws InterruptedException {
            // Si el proceso tiene prioridad mayor que la máxima actual,
            // actualizamos la prioridad máxima y le permitimos acceder
            if (prioridad > prioridadMaxima) {
                prioridadMaxima = prioridad;
            }
            
            // Si no es el proceso de mayor prioridad, espera hasta que se le permita acceder
            while (prioridad < prioridadMaxima) {
                wait();
            }
            
            // Accede al recurso compartido
            recurso++;
            System.out.println("Proceso " + prioridad + " accede al recurso compartido");
            
            // Libera el recurso compartido y notifica a los demás procesos
            recurso--;
            if (recurso == 0) {
                prioridadMaxima = 0;
                notifyAll();
            }
        }
    }
    
    public static class ProcesoThread extends Thread {
        private RecursoCompartido recurso;
        private int prioridad;
        
        public ProcesoThread(RecursoCompartido recurso, int prioridad) {
            this.recurso = recurso;
            this.prioridad = prioridad;
        }
        
        @Override
        public void run() {
            while (true) {
                try {
                    recurso.acceder(prioridad);
                    Thread.sleep((long)(Math.random() * 2000 + 1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
