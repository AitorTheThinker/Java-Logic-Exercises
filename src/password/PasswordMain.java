package password;

import java.util.Scanner;

public class PasswordMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Introducimos el tamaño del array y la longitud del password
        System.out.print("Introduce un tamaño para el array: ");
        int tamanio = scanner.nextInt();

        System.out.print("Introduce la longitud del password: ");
        int longitud = scanner.nextInt();

        //Creamos los arrays
        Password listaPassword[] = new Password[tamanio];
        boolean fortalezaPassword[] = new boolean[tamanio];

        //Creamos objetos, indicamos si es fuerte y mostramos la contraseña y su fortaleza.
        for(int i = 0; i < listaPassword.length; i++) {
            listaPassword[i] = new Password(longitud);
            fortalezaPassword[i] = listaPassword[i].esFuerte();
            System.out.println(listaPassword[i].getContraseña() + " " + fortalezaPassword[i]);
        }

        scanner.close();
    }
}
