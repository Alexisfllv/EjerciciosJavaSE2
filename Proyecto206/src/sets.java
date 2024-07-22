import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class sets   {

	
	
	public static void main (String []args ) {
		
		HashSet<String> st = new HashSet<String>();
		
		st.add("Alexis");
		st.add("Deadmau5");
		st.add("Skrillex");
		st.add("Jeongyeon");
		st.add("Sara");
		st.add("Sara");
		
		System.out.println(" Inserccion Aleatorio ");
		
		for (String slista : st) {
			System.out.println(slista);
		}
		System.out.println();
		
		System.out.println(st.size());
		
		//
		
		TreeSet<Integer> nt = new TreeSet<Integer>();
		nt.add(22);
		nt.add(12);
		nt.add(39);
		nt.add(40);
		nt.add(23);
		nt.add(23);
		
		System.out.println(" Inserccion En Orden ");
		for (Integer integer : nt) {
			System.out.println(integer);
		}
		System.out.println();
		
		System.out.println(nt.size());
		
		//
		LinkedHashSet<String> st2 = new LinkedHashSet<String>();
		
		st2.add("Deadmau5");
		st2.add("Skrillex");
		st2.add("Jeongyeon");
		st2.add("Sara");
		st2.add("Alexis");
		st2.add("Alexis");
		
		System.out.println(" Inserccion En Orden de Ingreso ");
		for (String string : st2) {
			System.out.println(string);
			
		}
		System.out.println();
		
		System.out.println(st2.size());
		
	}
}
