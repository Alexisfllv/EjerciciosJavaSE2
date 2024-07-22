import java.util.Scanner;

public class CondicionalDiferente {

	
	public static void main(String[] args) {
		
		int valor1,valor2;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("ingrese valor 1 : ");
		valor1 = scan.nextInt();
		
		System.out.print("ingrese valor 2 : ");
		valor2 = scan.nextInt();
		
		//condicion:
		if (valor1 >valor2) {
			System.out.println("Valor 1 es mayor : " +valor1);
		}else {
			System.out.println("Valor 2 es mayor : " +valor2);
		}
	}
}

