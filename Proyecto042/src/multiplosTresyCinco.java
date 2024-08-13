import java.util.Scanner;

public class multiplosTresyCinco {

	public static void main(String[] args) {
		
		//
		int x,y;
		int numero;
		int tres=0,cinco=0,ambos=0;
		
		//
		Scanner scan = new Scanner(System.in);
		for (int i = 1; i <=10; i++) {
			
			//
			System.out.print("Ingrese numero : ");
			numero = scan.nextInt();
			
			if (numero %3 ==0 &&numero %5 !=0) {
				tres++;
			}
			
			if (numero %5==0 && numero %3!=0) {
				cinco++;
			}
			
			if (numero %3==0 && numero %5==0) {
				ambos++;
			}
			
		}
		
		System.out.println("multiplo tres : " +tres);
		System.out.println("multiplo cinco : " +cinco);
		System.out.println("multiplo ambo : " +ambos);
	}
}
