import java.util.Scanner;

public class Sueldos {
	
	//
	
	private int demo[];
	private int x,y;
	private int sumar=0;
	
	private void Inicio() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Cantidad de trabajadores : ");
		x = scan.nextInt();
		
		demo = new int[x];
		
		for (int i = 0; i < demo.length; i++) {
			System.out.print("Sueldos : ");
			demo[i] = scan.nextInt();
		}
	}
	
	private void Sumar() {
		for (int i = 0; i < demo.length; i++) {
			System.out.println(" : " + demo[i]);
		}
	}
	
	private void Imprimir() {
		
	}
	public static void main(String [] args) {
		
		
		Sueldos sue = new Sueldos();
		sue.Inicio();
		sue.Sumar();
	}

}
