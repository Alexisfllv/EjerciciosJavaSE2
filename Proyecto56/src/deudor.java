import java.util.Scanner;

public class deudor {
	
	public static void main(String [] args) {
		
		//
		int x , y;
		int cuenta=0,saldo=0,suma=0;
		
		//
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("Ingrese numero de cuenta (negativo) : ");
			cuenta = scan.nextInt();
			
			if (cuenta >=0) {
				
				//saldo
				System.out.print("Ingrese saldo cliente : ");
				saldo = scan.nextInt();
				if (saldo >0) {
					System.out.println("Acreedor : ");
					suma = suma+saldo;
				}else {
					if (saldo <0) {
						System.out.println("Deudor : ");
					}else {
						System.out.println("Nulo : ");
					}
				}
			}
			
			
			
		} while (cuenta >=0);
		
		System.out.println("Suma de saldo : " + suma);
	}

}
