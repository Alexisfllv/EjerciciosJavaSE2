import java.util.Stack;

public class NACK {

	
	public static void main (String [] args) {
		
		
		Stack<Persona> pe = new Stack<Persona>();
		
		pe.push(new Persona("Alexis",22));
		pe.push(new Persona("Juan",23));
		pe.push(new Persona("Lep",24));
		pe.push(new Persona("Cuant",25));
		
		
		//
		System.out.println(pe.size());
		
		for (Persona persona : pe) {
			persona.imprimir();
		}
		
	}
}
