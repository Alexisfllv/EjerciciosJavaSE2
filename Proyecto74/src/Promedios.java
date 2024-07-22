import java.util.Scanner;

public class Promedios {

	//
	private int x[],y[];
	private int sum=0,prom=0,sum2=0,prom2=0;
	
	Scanner scan ;
	
	private void Inicio() {
		
		x = new int[5];
		y = new int[5];
		scan = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("Ingresar valores del grupo A: ");
			x[i] = scan.nextInt();
			
			sum = sum +x[i];
			prom = sum/5;
			
		}
		for (int i = 0; i < 5; i++) {
			System.out.print("Ingresar valores del grupo B: ");
			y[i] = scan.nextInt();
			
			sum2 = sum2 +y[i];
			prom2= sum2/5;
			
		}
	}
	
	private void Promedio() {
		if (prom>prom2) {
			System.out.println("Promedio mayor A ");
		}else {
			System.out.println("Promedio mayor B ");
		}
	}
	
	public static void main(String [] args) {
		
		Promedios prom = new Promedios();
		prom.Inicio();
		prom.Promedio();
	}
}
