import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Pque {

	
	public static void main(String []args) {
		
		//
		PriorityQueue<Integer> it = new PriorityQueue<Integer>();
		
		it.add(88);
		it.add(33);
		it.add(55);
		it.add(400);
		it.add(3232);
		it.add(44);
		it.add(2);
		
		
		
		
		System.out.println("----------------");
		System.out.println("Primero "+ it.peek());
		System.out.println("----------------");
		System.out.println(it.size());
		System.out.println("----------------");
		
		/**
		System.out.println("----------------");
		while (!it.isEmpty()) {
			System.out.println(it.poll());
		}
		**/
		System.out.println("----------------");
		System.out.println(it.size());
		
		//Main
		
		
		
		System.out.println("----------------COPIA");
		///copia
		
		
		
		ArrayList<Integer >copiait =  new ArrayList<>(it);
		//metodo sort
		Collections.sort(copiait);
		
		
		for (Integer lem : copiait) {
			System.out.println(lem);
		}
		System.out.println("----------------");
		Collections.sort(copiait,Collections.reverseOrder());
		for (Integer integer : copiait) {
			System.out.println(integer);
		}
		
		//
		
		PriorityQueue<String> st = new PriorityQueue<String>();
		st.add("Alexis");
		st.add("Ferrari");
		st.add("Demon");
		st.add("Babo");
		
		System.out.println("----------------");
		for (String string : st) {
			System.out.println(string);
		}
		
		
	}
}
