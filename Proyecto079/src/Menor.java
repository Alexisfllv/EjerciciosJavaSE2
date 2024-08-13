import java.util.Scanner;

public class Menor {

	//  n elementos entrada
	// imprimir menor
	// mensaje si se repite un dato de entrada
	private int num[];
	private int x,y;
	private int menor =0;
	
	private void Cargar() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingresar cantida de numeros : ");
		x = scan.nextInt();
		
		num = new int[x];
		for (int i = 0; i < x; i++) {
			System.out.print("Ingrese numeros : ");
			num[i] = scan.nextInt();
			
		}
	}
	
	
	private void Menor() {
		int menor =0;
		menor =num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] <= menor) {
				menor = num[i];			
			}
		}
		System.out.println("Numero menor es  :" + menor);
	}
	

	private void ElementoMenor() {
		int val =0;
		val = num[0];
		String set="";
		for (int i = 0; i < num.length; i++) {
			
			if (num[i] == menor) {
				
				val++;
			}
			
		}
		
		if (val ==0) {
			System.out.println("Elemento menor no se repite");
		}else {
			System.out.println("Elemento menor se repite");
		}
		
	}
	public static void main(String [] args) {
		//
		Menor men = new Menor();
		men.Cargar();
		men.Menor();
		men.ElementoMenor();
	}
}
