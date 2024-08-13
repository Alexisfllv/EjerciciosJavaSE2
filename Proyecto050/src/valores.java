import java.util.Scanner;

public class valores {

	public static void main(String [] args) {
		
	
	//
		//negativos
		//positivos
		//multiplos x 15
		//pares
	
		int x,y;
		int val=10;
		int negativos=0,positivos=0,multiplos=0,pares=0;
	
		for(int i=0; i<val;i++) {
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Ingresa numero : ");
			x = scan.nextInt();
			
			if (x <0) {
				negativos++;
			}
			
			if (x >0) {
				positivos++;
			}
			
			if (x % 15==0) {
				multiplos++;
			}
			
			if (x%2==0) {
				pares= pares+x;
			}
			
			
		}
		
		System.out.println("Negativos : " +negativos);
		System.out.println("Positivos : " +positivos);
		System.out.println("Multiplos x 15 : " +multiplos);
		System.out.println("Suma Pares  : " +pares);
		
	}
}
