import java.util.Scanner;

public class Repetitivdoble {

	
	public static void main (String [] args) {
		
		//
		
		
		int x =0,vacio;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese numero tope : ");
		vacio = scan.nextInt();
		
		while (x <= vacio) {
			System.out.println(x);
			x = x+1;
		}
		
	}
}
