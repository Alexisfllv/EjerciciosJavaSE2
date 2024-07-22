import java.util.Iterator;
import java.util.Scanner;

public class alumnosValor {

	public static void main (String[] args) {
		
		
		//
		
		int x,y;
		int apro=0,desa=0;
		
		Scanner scan = new Scanner(System.in);
		
		//
		for (int i = 1; i <= 10; i++) {
			
			System.out.print("Ingrese nota : ");
			x = scan.nextInt();
			if (x>= 7) {
				apro = apro+1;
			}else {
				desa = desa+1;
			}
			
		}
		
		System.out.println("mayores a 7 : " +apro);
		System.out.println("menores a 7 : " +desa);
		
		
	}
	
}
