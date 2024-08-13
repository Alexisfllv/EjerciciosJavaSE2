import java.util.Scanner;

public class CondicionOperador {

	
	public static void main(String [] args) {
		
		int n1,n2,n3;
		
		int mayor = 0;
		
		Scanner scan = new Scanner(System.in);
	
		System.out.print("Ingrese numero 1 : ");
		n1 = scan.nextInt();
		System.out.print("Ingrese numero 2 : ");
		n2 = scan.nextInt();
		System.out.print("Ingrese numero 3 : ");
		n3 = scan.nextInt();
		
		//
		
		if (n1 > n2 && n1 > n3) {
			mayor = n1;
		}else {
			if (n2 > n3) {
				mayor = n2;
			}else {
				mayor = n3;
			}
		}
		
		System.out.println("Mayor : " + mayor);
		
		
	}
	
}
