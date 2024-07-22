import java.util.LinkedList;
import java.util.Queue;

public class Que {

	
	public static void main (String [] args) {
		
		Queue<String> q1 =  new LinkedList<String>();
		
		System.out.println("Ingresar 3 elementos de la cola");
		q1.add("Alexis");
		q1.add("Demon");
		q1.add("lizo");
		
		
		System.out.println(q1.size());
		
		
		for (String string : q1) {
			System.out.println(string);
		}
		
		//extraer
		System.out.println("Elimina el valor 0 : "+q1.poll());
		
		//consultar
		System.out.println("Consulta el valor 0 : "+q1.peek());
		
		//Eliminar todos los elementos
		
		while (!q1.isEmpty()) {
			System.out.println(q1.poll());
		}
		
		//
		
		Queue<Integer> it1 = new LinkedList<Integer>();
		
		it1.add(12);
		it1.add(22);
		it1.add(33);
		it1.add(44);
		
		System.out.println("Recorred la cola");
		
		for (Integer integer : it1) {
			System.out.println(integer);
		}
		
		//Eliminar todo
		
		it1.clear();
		
		System.out.println(it1.size());
		
		//Persona
		
		Queue<Persona> p1 =  new LinkedList<Persona>();
		
		p1.add(new Persona("Alexis", 22));
		p1.add(new Persona("Ferr", 44));
		p1.add(new Persona("Deadmau5", 88));
		
		//
		System.out.println("DATOS PERSONA");
		
		
		for (Persona persona : p1) {
			persona.imprimir();
		}
		
		for (Persona persona : p1) {
			persona.imprimirEdad();
		}
		
		for (Persona persona : p1) {
			System.out.println(persona.retornarEdad());
		}
		
	}
}
