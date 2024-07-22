import java.util.Iterator;
import java.util.Stack;

public class tacks {
	
	public static void main (String []args) {
		
		Stack<String> st = new Stack<String>();
		System.out.println("Insertamos 3 elementos ");
		st.push("Juan");
		st.push("Pepe");
		st.push("Luis");
		st.push(new String("Lucho"));
		
		System.out.println("Cuantos elementos tiene la pila :" + st.size());
		
		
		//EMPY / BOOLEAN
		if (st.empty()) {
			System.out.println("La lista esta vacia");
			
		}else {
			System.out.println("La lista esta llena");
		}
		//peek  Obtiene el elemento superior de la pila sin eliminarlo.
		
		System.out.println("Elemento superior de la lista " +st.peek());
		
		//pop Elimina y devuelve el elemenot superior de la pila.
		System.out.println("Elemento superior eliminado : " +st.pop());
		
		
		// listado
		
		for (String string : st) {
			System.out.println(string);
		}
		
		//search // Busca un elemento en la pila y devuelve su posición basada en la indexación cero.
		//Si el elemento no se encuentra, devuelve -1.
		
		//
		
		System.out.println( "Se encuentra en la n` "+st.search("Luis"));
		
		//boolean
		System.out.println(" Se encuentra el 1 " + st.contains("Luis"));
		System.out.println(st.indexOf(0));
		
		//clase Persona
		
		Stack<Persona> pe =  new Stack<Persona>();
		System.out.println("Ingresamos 3 elementos de la clase persona");
		pe.push(new Persona("Alexis", 22));
		pe.push(new Persona("Juanito", 23));
		
		//Iterator<Persona> iterator();
		
		//imprimir listado de personas
		//pe.clear();
		
		System.out.println("elementos : " + pe.size());
		
		
		for (Persona persona : pe) {
			persona.retornarNombre();
			persona.imprimir();
		}
		
		Stack<Integer> in = new Stack<Integer>();
		in.push(111);
		in.push(new Integer(222));
		in.push(333);
		
		//
		System.out.println("/////////////////");
		System.out.println("Posicion del numero 2 : " + in.indexOf(333));
		System.out.println(in.size());
		
		for (Integer ine : in) {
			System.out.println(ine);
		}
	}

}
