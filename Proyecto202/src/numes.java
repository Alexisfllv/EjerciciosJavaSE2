import java.util.ArrayList;
import java.util.LinkedList;

public class numes {
	
	public static void main (String [] args) {
		
		
		//
		ArrayList<Integer> pe = new ArrayList<>();
		
		pe.add(123);
		pe.add(444);
		pe.add(222);
		/**
		for (Integer ps : pe) {
			System.out.println(ps);
		}
		**/
		//
		LinkedList<Integer> pe2 =  new LinkedList<>(pe);
		
		pe2.offer(555);
		pe2.offer(700);
		
		for (Integer ps2 : pe2) {
			System.out.println(ps2);
		}
		
		System.out.println(pe2.size());
		System.out.println("---------------");
		
		while (!pe2.isEmpty()) {
			System.out.println(pe2.poll());
		}
		System.out.println("---------------");
		for (Integer ps2 : pe2) {
			System.out.println(ps2);
		}
		
		System.out.println(pe2.size());
		
		}

}
