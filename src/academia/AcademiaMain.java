package academia;

import java.io.IOException;

public class AcademiaMain {
	 public static void main(String[] args) {
         
	        Test t=new Test();
	         
	        try {
	        	
	            t.cargarFichero("preguntas-incorrecto.txt");
	             
	             t.realizarTest();
	             
	        } catch (IOException ex) {
	            System.out.println(ex.getMessage());
	        }
	         
	    }
}
