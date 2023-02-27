package empleados;

public class ComercialMain {
	public static void main(String[] args) {
		 
        //Creamos los objetos
        Comercial c1 = new Comercial(300, "DDR", 37, 1000);
        Repartidor r1 = new Repartidor("zona 3", "Fer", 26, 900);
 
        //Llamamos a plus
        c1.plus();
        r1.plus();
 
        //Mostramos la informacion
        System.out.println(c1);
        System.out.println(r1);
    }
}
