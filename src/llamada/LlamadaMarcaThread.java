package llamada;

public class LlamadaMarcaThread extends Thread {

    public void run() {
        String[] marcas = { "Samsung", "Apple", "Huawei", "Xiaomi", "Motorola" };
        for (String marca : marcas) {
            System.out.println("Llamando a " + marca + "...");
            try {
                Thread.sleep(3000); // sleep for 3 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Fin de llamada a " + marca);
        }
    }

}
