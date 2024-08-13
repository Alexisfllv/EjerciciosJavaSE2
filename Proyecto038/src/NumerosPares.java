import java.util.Scanner;

public class NumerosPares {

	
	public static void main(String [] args) {
		
		
		int x=1,cantidad,numero,par=0,impar=0;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.print("Ingrese cantidad ");
		cantidad = scan.nextInt();
		
		while (x <= cantidad) {
			//pregunta
			
			System.out.print("Ingrese numero : ");
			numero = scan.nextInt();
			x++;
			if (numero %2 ==0) {
				par = par+1;
			}else {
				impar = impar+1;
			}
		}
		
		System.out.println("Pares " +par);
		System.out.println("Impares " +impar);
		
	}
}
