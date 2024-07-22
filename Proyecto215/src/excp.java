import java.util.InputMismatchException;
import java.util.Scanner;

public class excp {

	
	
	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n ;
		
		boolean cont ;
		do {
			
			try {
				
				cont = false;
				
				System.out.print("Ingresar un numero ");
				n = scan.nextInt();	
				
				int cuadrado = n*n;
				System.out.println("El cuadrado de : " + n + " es : " + cuadrado);
			} catch (InputMismatchException ex) {
				System.out.println("Se debe cargar un numero entero de forma obligatoria");
				scan.next();
				cont = true;
			}
			
			
		} while (cont);
		
		
		
	}
	
}
