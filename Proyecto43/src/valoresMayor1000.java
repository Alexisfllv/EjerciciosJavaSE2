import java.util.Iterator;
import java.util.Scanner;

public class valoresMayor1000 {
	public  static void main (String [] args) {
		
		//
		int x,y;
		int numero=0,mayores=0;
		
		//
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese cantidad : ");
		x = scan.nextInt();
		
		
		for (int i = 0; i <x ; i++) {
			//
			System.out.print("Ingrese numero : ");
			numero = scan.nextInt();
			
			if (numero >=1000) {
				mayores++;
			}

		}
		
		System.out.println("Mayores & iguales a 1000  : "+mayores);
	}
}
