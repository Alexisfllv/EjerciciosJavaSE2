import java.util.Scanner;

public class Iguales {

	public static void main(String[]args) {
		
		
		int n1,n2,n3;
		
		int r = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingresa num 1 : ");
		n1 = scan.nextInt();
	
		System.out.print("Ingresa num 2 : ");
		n2 = scan.nextInt();
		
		System.out.print("Ingresa num 3 : ");
		n3 = scan.nextInt();
		
		
		if (n1 == n2 && n1 ==n3 ) {
			r = (n1+n2)*n3;
		}else {
			System.out.println("Los valores no son iguales");
		}
		
		System.out.println("Valor  : " + r);
		
		
	}
}
