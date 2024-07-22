import java.util.ArrayList;

public class rray {

	
	private static void imprimir(ArrayList<String> slista) {
		for (String st : slista) {
			System.out.print(st + " / ");
		}
		System.out.println();
		
	}
	
	private void imprimir2(ArrayList<String> lista) {
		for (String string : lista) {
			System.out.println(string);
		}
	}
	
	
	public static void main (String [] args) {
		
		//listado
		ArrayList<String> st = new ArrayList<String>();
		
		
		//principal
		rray ry = new rray();
		
		st.add("Aleixs");
		st.add("Lemon");
		st.add("Waos");
		
		imprimir(st);
		
		st.add(1, "Blue");
		
		imprimir(st);
		
		
		st.remove(0);
		
		imprimir(st);
		
		st.remove("Lemon");
		
		imprimir(st);
		
		System.out.println(st.size());
		
		//
		if (st.contains("Ana")) {
			System.out.println("Contiene ese dato");
			
		}else {
			System.out.println("El elemento no existe");
		}
		
		System.out.println("El segundo es : " + st.get(1));
		System.out.println(st.size());
		
		st.clear();
		
		if (st.isEmpty()) {
			System.out.println("Arreglo vacio");
		}else {
			System.out.println("Arreglo con datos");
		}
		
		//
		System.out.println("------------------");
		
		//
		
		st.add("QUAL");
		st.add("QUAL");
		st.add("QUAL");
		st.add("QUAL");
		
		
		// convocar un metodo listar de clase array
		
		ry.imprimir2(st);
	}
}
