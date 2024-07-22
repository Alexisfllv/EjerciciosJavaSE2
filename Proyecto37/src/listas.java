import java.util.Scanner;

public class listas {

	
	public static void main(String [] args) {
		
		
		int x=1,y=1;
		int c1,c2;
		int suma1=0,suma2=0;
		
		Scanner scan = new Scanner(System.in);
		while (x<=15) {
			System.out.print("Ingrese datos lista A : ");
			c1= scan.nextInt();
			
			suma1 = suma1+c1;
			x++;
		}
		while (y<=15) {
			System.out.print("Ingrese datos lista B : ");
			c2= scan.nextInt();
			
			suma2 = suma2+c2;
			y++;
			
			
		}
		
		
		//
		
		if (suma1>suma2) {
			System.out.println("Suma 1 mayor "+suma1);
		}else if (suma2>suma1) {
			System.out.println("Suma 2 mayor "+suma2);
		}else {
			System.out.println("Empate "+suma1+" - "+suma2);
		}
		
		
	}
}
