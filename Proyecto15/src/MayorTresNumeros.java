import java.util.Scanner;

public class MayorTresNumeros {
	
	public static void main(String [] args) {
		
		int n1,n2,n3,mayor;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese numero 1 : ");
		n1 = scan.nextInt();
		
		System.out.print("Ingrese numero 2 : ");
		n2 = scan.nextInt();
		
		System.out.print("Ingrese numero 3 : ");
		n3 = scan.nextInt();
		
		mayor = 0;
		
		if (n1 > n2) {
			mayor = n1;
			if (n1 > n3) {
				mayor =n1;
			}else {
				mayor = n3;
			}
			
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
