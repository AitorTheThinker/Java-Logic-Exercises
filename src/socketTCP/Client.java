package socketTCP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		//TCP ES ORIENTADO A CONEXIÓN
		DataInputStream in;
		DataOutputStream out;
		final String HOST="127.0.0.1";
		final int PUERTO= 5000;
		
		
		try {
			Socket sc= new Socket(HOST, PUERTO);
			
			in=new DataInputStream(sc.getInputStream());
			out=new DataOutputStream(sc.getOutputStream());
			
			out.writeUTF("¡Hola mundo desde el cliente!");
			String mensaje= in.readUTF();
			
			System.out.println(mensaje);
			
			sc.close();
		System.out.println("Adios");	
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
}
