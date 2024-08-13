import java.util.Scanner;

public class forsumavalores {

	
	public static void main(String [] args) {
		
		//
		int x,y;
		
		int suma=0;
		
		
		for (int i = 1; i <=10; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Ingrese valor  : ");
			x=scan.nextInt();
			
			//
			
			suma = suma +x;
			
			
			
		}
		System.out.println("Suma : "+suma);
		
	}
}
