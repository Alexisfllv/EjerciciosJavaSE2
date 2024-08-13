import java.util.Scanner;

public class triangulos {

	
	public static void main(String[] args) {
		
		int x,y;
		int mayores =0, numero=0,valor=0,superficie=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese cantidad : ");
		numero = scan.nextInt();
		
		for (int i = 1; i <=numero; i++) {
			System.out.print("Ingrese base : ");
			x = scan.nextInt();
			System.out.print("Ingrese altura : ");
			y = scan.nextInt();
			
			superficie = (x*y)/2;
			System.out.println("Superficie : "+superficie);
			
			
			
			if (superficie >=12) {
				valor++;
							
			}
		}
		
		System.out.println("superficies mayores a 12  : "+valor);	
	}
}
