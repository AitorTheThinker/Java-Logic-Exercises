package restaurante;

public class RestauranteMainRunnable {
	public static void main(String[] args) {

        Restaurante restaurante = new Restaurante(3, 5); // 3 camareros, 5 clientes
        for (int i = 1; i <= 5; i++) {
            Runnable cliente = new ClienteRunnable(restaurante, i);
            Thread hiloCliente = new Thread(cliente);
            hiloCliente.start();
        }
	}
}
