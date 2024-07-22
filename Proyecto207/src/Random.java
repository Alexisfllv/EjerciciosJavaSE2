import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Random {

	
	
	
	public static void main (String [] args) {
		
		Set<Integer> nt = new LinkedHashSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			nt.add(1+(int)(Math.random()*100));
			
		}
		
	
		ArrayList<Integer> nt2 = new ArrayList<Integer>(nt);
		
		for (int i = 0; i < nt2.size(); i++) {
			int valor = nt2.get(i);
			System.out.println("Id : " + i + " El numero es : " + valor);
		}
		
		
		//
		System.out.println("Metodo 2");
		
		Set<Integer> nt3 = new TreeSet<Integer>();
		while (nt3.size()<100) {
			nt3.add(1+(int)(Math.random()*100));
		}
		
		for (Integer integer : nt3) {
			System.out.println(integer);
		}
		
		if (nt3.contains(46)) {
			System.out.println("El valor si esta ");
		}else {
			System.out.println("El valor no se encuentra");
		}
		
		
		ArrayList<Integer> nt4 = new ArrayList<Integer>(nt3);
		for (int i = 0; i < nt4.size(); i++) {
			int valor = nt4.get(i);
			System.out.println("Id : " + i + " El numero es : " + valor);
		}
	}
}
