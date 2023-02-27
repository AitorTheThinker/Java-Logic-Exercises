package temprano;

import java.util.Scanner;

public class UsuarioRunnable implements Runnable {
    private String nombre;
    private String dia;
    private double hora;

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el nombre del usuario: ");
        nombre = sc.next();
        System.out.print("Ingresa el día del usuario: ");
        dia = sc.next();
        System.out.print("Ingresa la hora del usuario: ");
        hora = sc.nextDouble();
        if (hora > 8.00) {
            System.out.println(nombre + " llegó tarde el día " + dia);
        } else {
            System.out.println(nombre + " ha llegado temprano el día " + dia);
        }
    }
}
