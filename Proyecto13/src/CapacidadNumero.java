import java.util.Scanner;

public class CapacidadNumero {

	public static void main(String [] args) {
		
		int numero;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ingrese numero : ");
		numero = scan.nextInt();
		
		//

		if (numero >10) {
			System.out.println("valor tiene mas de 2 digitos");
		}
		else {
			System.out.println("valor tiene 1 digito");
		}
	}
	
}
