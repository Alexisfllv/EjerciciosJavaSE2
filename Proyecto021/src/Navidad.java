import java.util.Scanner;

public class Navidad {

	
	
	public static void main (String [] args ) {
		
		//
		int d,m,a;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingresa dia : ");
		d = scan.nextInt();
		
		System.out.print("Ingresa mes : ");
		m = scan.nextInt();
		
		System.out.print("Ingresa año : ");
		a = scan.nextInt();
		
		//
		
		if (d == 25 & m ==12) {
			System.out.println("Es dia de Navidad");
		}else {
			System.out.println("No se celebra Navidad ");
		}
	}
}
