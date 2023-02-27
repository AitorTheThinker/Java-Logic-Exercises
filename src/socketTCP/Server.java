package socketTCP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String args[]) {
		//TCP ES ORIENTADO A CONEXIÓN
		ServerSocket servidor=null;
		Socket sc=null;
		DataInputStream in;
		DataOutputStream out;
		
		final int PUERTO=5000;
		
		
		
		try {
			servidor= new ServerSocket(PUERTO);
			System.out.println("Servidor iniciado");
			
			while (true) {
				sc= servidor.accept();
				in=new DataInputStream(sc.getInputStream());
				out=new DataOutputStream(sc.getOutputStream());
				
				String mensaje= in.readUTF();
				
				System.out.println(mensaje);
				out.writeUTF("Hola mundo desde el servidor");
				
				sc.close();
				
				System.out.println("Cliente desconectado");
				
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}
