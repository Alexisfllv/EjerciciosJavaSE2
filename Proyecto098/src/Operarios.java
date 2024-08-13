import java.util.Scanner;

public class Operarios {

	
	private Scanner scan ;
	private int sueldo[];
	
	//
	public Operarios() {
		//
		sueldo = new int[5];
		
		
		scan = new Scanner(System.in);
		for (int i = 0; i < sueldo.length; i++) {
			System.out.print("Ingrese sueldo : ");
			sueldo[i] = scan.nextInt();
		}
	}
	
	private void Imprimir() {
		for (int i = 0; i < sueldo.length; i++) {
			System.out.println("Sueldo : "+ sueldo[i]);
		}
	}
	
	public static void main(String [] args) {
		Operarios ope = new Operarios();
		ope.Imprimir();
	}
}
