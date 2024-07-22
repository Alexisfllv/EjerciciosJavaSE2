import java.util.Scanner;

public class problm2 {

	public static void main(String [] args) {
		
		//
		
		Scanner scan = new Scanner(System.in);
	
		
		int edad1,edad2;
		String nom1,nom2;
		
		System.out.print("Primer nombre :  ");
		nom1 = scan.nextLine();
		
		System.out.print("Primera edad :  ");
		edad1 = scan.nextInt();
		
		System.out.print("Segundo nombre :  ");
		//vacio
		scan.nextLine();
		nom2 = scan.nextLine();
		
		System.out.print("Segundo1 edad :  ");
		edad2 = scan.nextInt();
		
		
		if (edad1>edad2) {
			System.out.println("Mayor : "+edad1+ " "+nom1);
		}else {
			System.out.println("Mayor : "+edad2 + " "+nom2);
		}
	}
}
