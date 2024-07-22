import java.util.Scanner;

public class Sueldos {
	
	
	// 4 -4 = 8;
	// 
	
	private int a[];
	private int b[];
	
	private int sumaa=0;
	private int sumab=0;
	
	private void Inicio() {
		
		a = new int[4];
		b = new int[4];
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresar sueldos de turno Mañana : ");
		for (int i = 0; i < 4; i++) {
			System.out.print("S Mañana  : ");
			a[i] = scan.nextInt();
		}
		
		System.out.println("Ingresar sueldos de turno Tarde : ");
		for (int j = 0; j < 4; j++) {
			System.out.print("S Tarde  : ");
			b[j] = scan.nextInt();
		}
		
	}
	
	private void Sueldos() {
		
		
		
		for (int i = 0; i < 4; i++) {
			sumaa= sumaa +a[i];
		}
		for (int j = 0; j < 4; j++) {
			sumab= sumab +b[j];
		}
	}
	
	private void Imprimir() {
		
		System.out.println("Mañana : " + sumaa);
		System.out.println("Tarde : " + sumab);
	}
	
	
	
	public static void main(String [] lccs) {
		
		//
		Sueldos sue = new Sueldos();
		sue.Inicio();
		sue.Sueldos();
		sue.Imprimir();
	}

}
