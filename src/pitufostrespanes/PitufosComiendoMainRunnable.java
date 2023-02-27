package pitufostrespanes;

public class PitufosComiendoMainRunnable {
    public static void main(String[] args) {
    	PitufosComiendoRunnable[] pitufos = new PitufosComiendoRunnable[10];

        pitufos[0] = new PitufosComiendoRunnable("Pitufo Torpe");
        pitufos[1] = new PitufosComiendoRunnable("Pitufo Fortachón");
        pitufos[2] = new PitufosComiendoRunnable("Pitufo Gruñón");
        pitufos[3] = new PitufosComiendoRunnable("Pitufo Filósofo");
        pitufos[4] = new PitufosComiendoRunnable("Pitufo Vanidoso");
        pitufos[5] = new PitufosComiendoRunnable("Pitufo Poeta");
        pitufos[6] = new PitufosComiendoRunnable("Pitufo Perezoso");
        pitufos[7] = new PitufosComiendoRunnable("Pitufo Bromista");
        pitufos[8] = new PitufosComiendoRunnable("Pitufo Manitas");
        pitufos[9] = new PitufosComiendoRunnable("Pitufo Pitufón");

        Thread[] hilos = new Thread[10];
        for (int i = 0; i < pitufos.length; i++) {
            hilos[i] = new Thread(pitufos[i]);
            hilos[i].start();
        }
    }
}

