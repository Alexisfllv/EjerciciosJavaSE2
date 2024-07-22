import java.util.Scanner;

public class sumaReptitiva {

	
	public static void main(String[] args) {
		
		
		// 
		Scanner scan = new Scanner(System.in);
		
		
		int n,x=1,cantidad =0;
		float largo;
		
		System.out.print("Ingrese cantidad de piezas : ");
		n = scan.nextInt();
		
		//
		
		while (x <= n) {
			System.out.print("Medida de pieza : ");
			largo = scan.nextFloat();
			
			x++;
			
			if (largo >= 1.20 && largo <=1.30) {
				
				cantidad ++;
			}
		}
		
		
		System.out.println("Cantidad de piezas aprobadas : "+cantidad);
		
	}
}
