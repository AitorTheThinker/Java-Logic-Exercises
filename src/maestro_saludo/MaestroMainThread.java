package maestro_saludo;

public class MaestroMainThread {
	/*13.- En clases independientes elabore un hilo que indique la llegada del maestro, la llegada de los alumnos al aula previo saludo. */
	 public static void main(String[] args) {
	        MaestroThread maestro = new MaestroThread();
	        maestro.start();

	        for (int i = 1; i <= 10; i++) {
	            AlumnoThread alumno = new AlumnoThread();
	            alumno.start();
	        }
	    }
}
