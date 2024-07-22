import java.util.LinkedHashMap;
import java.util.Map;

public class Maps {

	//
	public static void main (String [] args) {
		
		Map<String, String> st = new LinkedHashMap<String,String>();
		
		st.put("rojo", "red");
		st.put("verde", "green");
		st.put("azul", "blue");
		st.put("negro", "black");
		
		//st.put (KEY,VALUE);
		
		System.out.println("Listado");
		for (String string : st.values()) {
			System.out.println(string);
		}
		
		System.out.println("Listado completo");
		for (String string : st.keySet()) {
			System.out.println(string);
		} 
		
		
		System.out.println("La traduccion de ROJO es : " + st.get("rojo"));
		
		
		if (st.containsKey("morado")) {
			System.out.println("Si hay traduccion ");
		}else {
			System.out.println("No hay traduccion");
		}
		
		System.out.println("la traduccion de negro es : " + st.getOrDefault("morado", "No existe"));
		
		st.remove("negro");
		
		for (String string : st.values()) {
			System.out.println(string);
		}
		
		
		
	}
	
	
}
