import java.util.Iterator;
import java.util.Scanner;

public class forlist {

	
	
	public static void  main(String [] args) {
		
		//
		int x,y;
		/**
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingresar numero : ");
		x = scan.nextInt();
		
		for (int i = 0; i<x ; i++) {
			
			for (int j = 3; i <j; j++) {
				System.out.println(i);
			}
		}
		**/
		
		
		int n =0;
		
		System.out.print("Ingresar numero : ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for (int i = 0; i <n; i++) {
			System.out.println(3);
			
			if (2==i) {
				i =6;
				System.out.println(6);
			}
		}
		
		
	}
}
