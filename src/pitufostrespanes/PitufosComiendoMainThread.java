package pitufostrespanes;

public class PitufosComiendoMainThread {
    public static void main(String[] args) {
        PitufosComiendoThread[] pitufos = new PitufosComiendoThread[10];

        pitufos[0] = new PitufosComiendoThread("Pitufo Torpe");
        pitufos[1] = new PitufosComiendoThread("Pitufo Fortachón");
        pitufos[2] = new PitufosComiendoThread("Pitufo Gruñón");
        pitufos[3] = new PitufosComiendoThread("Pitufo Filósofo");
        pitufos[4] = new PitufosComiendoThread("Pitufo Vanidoso");
        pitufos[5] = new PitufosComiendoThread("Pitufo Poeta");
        pitufos[6] = new PitufosComiendoThread("Pitufo Perezoso");
        pitufos[7] = new PitufosComiendoThread("Pitufo Bromista");
        pitufos[8] = new PitufosComiendoThread("Pitufo Manitas");
        pitufos[9] = new PitufosComiendoThread("Pitufo Pitufón");

        for (int i = 0; i < pitufos.length; i++) {
            pitufos[i].start();
        }
    }
}

