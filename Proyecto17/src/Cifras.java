import java.util.Scanner;

public class Cifras {

	
	public static void main (String[] args) {
		
		//
		int num;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Numero : ");
		num = scan.nextInt();
		
		/**
		if (num >= 0 && num <10) {
			System.out.println("Numero tiene una cifra");
		}if (num >= 10 && num <100) {
			System.out.println("Numero tiene dos cifras");
			
		}if (num >= 100 && num <1000) {
			System.out.println("Numero tiene tres cifras");
		}
		***/
		
		if (num <10) {
			System.out.println("Numero tiene una cifra");
		}else {
			if (num <100) {
				System.out.println("Numero tiene dos cifras");
			}else {
				
				System.out.println("Error");
			}
		}
		
		
	}
}
