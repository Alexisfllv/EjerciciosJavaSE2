import java.util.Scanner;

public class tabla {

	public static void main(String[] args) {
		//
		int x,y;
		int cantidad,numero=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese numero de 1-12 : ");
		cantidad = scan.nextInt();
		
		for (int i = 1; i <=13; i++) {
			numero = i*cantidad;
			System.out.println(i + " * " + cantidad + " = "+numero);
		}
		
	}
}
