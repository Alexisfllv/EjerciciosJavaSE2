import java.util.Scanner;

public class MenoryMayor {

	
	public static void main (String[] args) {
		
		int mayor=0,menor=0,n1,n2,n3;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ingrese numero 1 : ");
		n1 = scan.nextInt();
		
		System.out.print("Ingrese numero 2 : ");
		n2 = scan.nextInt();
		
		System.out.print("Ingrese numero 3 : ");
		n3 = scan.nextInt();
		
		if (n1 >n2 && n1 >n3) {
			mayor = n1;
		}else {
			if (n2 >n1 && n2 >n3) {
				mayor = n2;
			}else {
				if (n3 > n1 && n3>n2) {
					mayor = n3;
				}
			}
		}
		
		if (n1 <n2 && n1 <n3) {
			menor = n1;
		}else {
			if (n2 <n1 && n2 <n3) {
				menor = n2;
			}else {
				if (n3 < n1 && n3<n2) {
					menor = n3;
				}
			}
		}
		
		
		
		System.out.println("Mayor numero es   : " + mayor);
		System.out.println("Menor Numero es : " + menor);
		
	}
} 
