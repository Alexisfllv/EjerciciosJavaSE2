import java.util.Scanner;

public class problm1 {

	
	public static void main(String [] args ) {
		
		//
		Scanner scan = new Scanner(System.in);
		
		
		String nom1,nom2;
		int edad1,edad2;
		
		System.out.print("Ingresa nombre 1 : ");
		nom1 = scan.next();
		
		System.out.print("Ingresa edad 1 : ");
		edad1 = scan.nextInt();
		
		System.out.print("Ingresa nombre 2 : ");
		nom2 = scan.next();
		
		System.out.print("Ingresa edad 2 : ");
		edad2 = scan.nextInt();
		
		
		if (edad1 > edad2) {
			System.out.println("Mayor es " + nom1);
			
		}else {
			System.out.println("Mayor es " + nom2);
		}
	}
}
