package threads17;

public class Main {

	public static void main(String[] args) {
		/*Hacer un programa compuesto por cuatro clases:
• Clases hilos HinchaGlobos (HG) (encargada de hinchar los globos)
• Clase hilo PinchaGlobos (PG) (encargada de pinchar los globos)
• Clase Globos (almacén de globos)
• Clase Inicio (contiene el código main e instancia al resto)

En relación a la clase Globos (tendremos 1 instancia de esta clase)
• En el almacén habrá un máximo de 10 globos .
• Se irán entregando de uno en uno numerándolos desde 1 a 10.
• Una vez entregados se podrán hinchar hasta que estallen o los pinchen.
• Sólo podrá haber 3 globos hinchándose a la vez.
• Los globos tendrán volumen de 1 a 5. Si se llena más de 5 estallan.
• El globo se entrega con un volumen inicial de l.
• Los globos pueden ser pinchados mientras se están hinchando.
• Se escribirá un mensaje con el número de globo cada vez que:
o Se entregue un globo (indicaremos el nombre del hilo ejem: GLOBO 5 ENTREGADO A HG3) o Se hinche un globo e indicaremos el nuevo volumen (ejem: GLOBO 5 VOLUMEN 5)
o Se estalle un globo por inflar de más (ejem : GLOBO 5 ESTALLA)
o Un PG pinche un globo (indicaremos el nombre del hilo ejem : GLOBO 5 PINCHADO POR PG3)

En relación a la clase HinchaGlobos (tendremos 5 instancias de esta clase)
• (0,5) Obtendrá un globo de la clase globos cada vez y en orden salvo que no queden más.
• (2) Si ya hubiera tres hinchándose se esperará hasta que uno se pinche o estalle .
• Los tendremos que numerar y nombrar con HG seguido de su número. (ejem: HG3)
• (1) Intentará hincharlo hasta estallarlo salvo que sea pinchando.
• (1) Cada segundo aumentará el volumen del globo desde 1 hasta estallarlo.
• (1) Si estalla o se pincha volverá a por otro globo hasta que no queden más.

En relación a la clase PinchaGlobos (tendremos 5 instancias de esta clase)
• (1) Intentará pinchar uno de los globos que se está hinchando cada un tiempo aleatorio de 1 a 10 segundos .
• (1) Si no hay globos que pinchar se quedará en espera.
• (0,5) Dejará de pinchar cuando no queden globos que pinchar.
• Sus instancias las tendremos que numerar y nombrar con PG seguida de su número (ejem : PG 2)

Los distintos apartados serán comprobados por la impresión de los mensajes detallados en la clase Globos .

Se deberá tener en cuenta que aquellos dormidos deberán ser despertados convenientemente:
(1) Caso de HG dormidos
(1) Caso de PG dormidos */

	}

}
