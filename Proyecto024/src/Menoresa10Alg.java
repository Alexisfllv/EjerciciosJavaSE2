import java.util.Scanner;

public class Menoresa10Alg {
	
	public static void main (String [] args) {
		
		
		//
		int n1,n2,n3;
		int m;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Numero 1 : ");
		n1 = scan.nextInt();
		System.out.print("Numero 2 : ");
		n2 = scan.nextInt();
		System.out.print("Numero 3 : ");
		n3 = scan.nextInt();
		
		if (n1 < 10 || n2 <10 || n3 <10) {
			
			System.out.println("Uno o mas valores son menores a 10 ");
			
		}else {
			System.out.println("Todos lo valores son mayores a 10 ");
		}
		
	}

}
