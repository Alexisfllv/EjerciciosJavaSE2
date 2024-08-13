import java.util.Scanner;

public class Verificar {

	
	
	//verificar si el numeor ,es positivo, 
	
	public static void main (String [] args) {
		
		
		int n1;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ingrese numero : ");
		n1 = scan.nextInt();
		
		//
		
		if (n1 > 0) {
			System.out.println("El numero es positivo ");
		}if (n1 <0) {
			System.out.println("El numero es negativo ");
		}if (n1 == 0) {
			System.out.println("El numero es neutro ");
		}
	}
}
