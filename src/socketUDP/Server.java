package socketUDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Server {

	public static void main(String[] args) {
		// NO ES ORIENTADO A CONEXIÓN
		
		final int PUERTO=5000;
		byte[] buffer= new byte[1024];
		
		try {
			System.out.println("Iniciado el servidor UDP");
			DatagramSocket socketUDP= new DatagramSocket(PUERTO);
			
			while(true) {
			DatagramPacket peticion= new DatagramPacket(buffer, buffer.length);
			
				socketUDP.receive(peticion);
					String mensaje= new String();
					System.out.println(mensaje);
					
					System.out.println("Recibo la información del cliente");
					int puertoCliente= peticion.getPort();
					InetAddress direccion= peticion.getAddress();
					
					mensaje="¡Hola mundo desde el servidor!";
					buffer=mensaje.getBytes();
					
					DatagramPacket respuesta= new DatagramPacket(buffer,buffer.length, direccion, puertoCliente);
					System.out.println("Envio la información al cliente");
					socketUDP.send(respuesta);
					
			}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		

	}

}
