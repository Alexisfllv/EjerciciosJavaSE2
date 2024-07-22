import java.util.LinkedList;

public class lklist {
	
	//
	
	public static void imprimir(LinkedList<String> lista) {
		for (String string : lista) {
			System.out.print(string +" - ");
			System.out.println();
		}
	}
	
	
	//
	
	public static void imprimir2(LinkedList<String> lista) {
		System.out.println("Lista 2 : ");
		for (String string : lista) {
			
			System.out.println("IMP2 : " +string);
		}
	}
	
	public static void main (String [] args) {
		
		
		LinkedList<String> st = new LinkedList<String>();
		
		//
		st.offer(new String("LEmon"));
		st.offer(new String("MuY"));
		st.offer(new String("Quee"));
		st.offer(new String("Bio"));
		
		//
		imprimir2(st);
		
		
		
		/**
		for (String string : st) {
			System.out.println(string);
		}
		**/
		//listado con metodo statico
		imprimir(st);
		
		//Agregar un dato al index
		System.out.println("------------");
		st.add(1,"Ana");
		
		imprimir(st);
		
		//Eliminar por el index
		System.out.println("------------");
		st.remove(0);
		imprimir(st);
		
		//Eliminar por el texto
		System.out.println("------------");
		st.remove("Bio");
		imprimir(st);
		
		//Cantidad de elementos
		System.out.println("------------");
		System.out.println(st.size());
		
		
		//Pregunta si existe el dato
		System.out.println("------------");
		if (st.contains("Quee")) {
			System.out.println();
		}
		
		//recuperar la informacion por index
		
		System.out.println(st.get(0));
		
		//Eliminar toda la lista
		
		st.clear();
		
		if (st.isEmpty()) {
			System.out.println("La lista se encuentra vacia");
		}else {
			System.out.println("La lista no se encuentra vacia");
		}
		
	}

}
