package sesion_activa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiempoSesionThread extends Thread {
    private Map<String, Long> usuarios = new HashMap<>();
    private boolean ejecutando;

    public TiempoSesionThread() {
        ejecutando = true;
    }

    @Override
    public void run() {
        while (ejecutando) {
            // Leer el nombre del usuario
            System.out.print("Nombre de usuario: ");
            Scanner scanner = new Scanner(System.in);
            String usuario = scanner.nextLine();
            // Registrar la hora de inicio de sesión
            usuarios.put(usuario, System.currentTimeMillis());
            // Esperar 10 segundos antes de verificar si hay sesiones activas
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // Mostrar las sesiones activas
            System.out.println("Sesiones activas:");
            long tiempoActual = System.currentTimeMillis();
            for (Map.Entry<String, Long> entry : usuarios.entrySet()) {
                long tiempoSesion = tiempoActual - entry.getValue();
                System.out.println(entry.getKey() + ": " + tiempoSesion / 1000 + " segundos");
            }
        }
    }

    public void detener() {
        ejecutando = false;
    }
}
