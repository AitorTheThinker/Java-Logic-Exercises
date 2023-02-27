package ascensor;

public class AscensorMainRunnable {

    public static void main(String[] args) {
        // 14.- Mediante hilos elabore una clase que ejecute el proceso del ascensor,
        // donde los usuarios suben y bajen de un piso con escala de tiempo.
        AscensorRunnable ascensor = new AscensorRunnable();
        UsuarioRunnable[] usuarios = new UsuarioRunnable[10];
        for (int i = 0; i < usuarios.length; i++) {
            usuarios[i] = new UsuarioRunnable(ascensor, i % 5 + 1); // crea usuarios en pisos del 1 al 5
            Thread thread = new Thread(usuarios[i]);
            thread.start();
        }
    }
}

