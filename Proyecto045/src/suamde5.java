import java.util.Scanner;

public class suamde5 {

	
	public static void main(String [] args) {
		
		
		int x,y;
		int suma=0;
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 1; i <=10; i++) {
			
			//
			System.out.print("Ingrese valores : ");
			x = scan.nextInt();
			
			if (i >5) {
				suma = suma +x;
			}
		}
		
		System.out.println("Suma de los ultimos 5 numero : " + suma);
	}
}
