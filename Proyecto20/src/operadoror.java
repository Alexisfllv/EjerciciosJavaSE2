import java.util.Scanner;

public class operadoror {

	
	public static void main (String[] args) {
		
		
		//
		
		int d,m,a;
		int n;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese dia : ");
		d = scan.nextInt();
		
		System.out.print("Ingrese mes : ");
		m = scan.nextInt();

		System.out.print("Ingrese año : ");
		a = scan.nextInt();
		
		//
		if (m == 1 || m ==2 || m==3) {
			System.out.println("Pertenece al primer tremestre");
			
		}else
		{
			System.out.println(" NO Pertenece al primer tremestre");
		}
		
	}
}
