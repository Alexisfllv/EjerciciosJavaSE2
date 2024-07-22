import java.util.Scanner;

import java.util.Scanner;

public class dowhile {

	
	public static void main(String[] args) {
		
		//
		int x,y;
		
		
		// 0-999;
		
		Scanner sacn = new Scanner(System.in);
		
		
		
		do {
			
			System.out.print("Ingrese numero : ");
			x = sacn.nextInt();
			
			if (x >= 100) {
				
				
				System.out.println("Tres digitos");
			}else {
				if (x>= 10) {
					System.out.println("Dos digitos");
				}else {
					
					System.out.println("Un digitos");
					
				}
			}

			
		} while (x !=0);
	}
}
