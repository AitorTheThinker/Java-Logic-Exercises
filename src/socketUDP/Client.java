package socketUDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		// NO ES ORIENTADO A CONEXIÓN
		final int PUERTO_SERVIDOR=5000;
		byte[] buffer= new byte[1024];
	
					try {
						InetAddress direccionServidor= InetAddress.getByName("localhost");
						
						DatagramSocket socketUDP= new DatagramSocket();
						String mensaje="¡Hola mundo desde el cliente!";
						buffer= mensaje.getBytes();
						
						DatagramPacket pregunta= new DatagramPacket(buffer, buffer.length, direccionServidor, PUERTO_SERVIDOR);
						System.out.println("Envio el datagrama");
						
						socketUDP.send(pregunta);
						
						DatagramPacket peticion= new DatagramPacket(buffer, buffer.length);
						socketUDP.receive(peticion);
						System.out.println("Recibo la petición");
						mensaje= new String(peticion.getData());
						
						System.out.println(mensaje);
						
						socketUDP.close();
					} catch (UnknownHostException e) {
						
						e.printStackTrace();
					} catch (SocketException e) {
						
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
					

			

				
		
	}

}
