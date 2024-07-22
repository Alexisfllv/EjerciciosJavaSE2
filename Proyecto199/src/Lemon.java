import java.util.ArrayList;
import java.util.PriorityQueue;

public class Lemon {

	
	
	public static void main (String [] args) {
		
		
		//
		
		PriorityQueue<Perrsona> colaPersonas = new PriorityQueue<>((p1, p2) -> p1.getEdad() - p2.getEdad());

        colaPersonas.offer(new Perrsona("Juan", 25));
        colaPersonas.offer(new Perrsona("María", 30));
        colaPersonas.offer(new Perrsona("Pedro", 20));

        // Acceder a los elementos de la PriorityQueue
        while (!colaPersonas.isEmpty()) {
        	Perrsona persona = colaPersonas.poll();
            System.out.println(persona.getNombre() + " - " + persona.getEdad());
        }
	}
}
