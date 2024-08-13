import java.util.Scanner;

public class Suma8 {

	
	private int x,y;
	private int valor,number;
	private int suma=0,mayor1=0,mayor2=0;
	
	private int suma2=0;
	private int cont1=0;
	private int val[];
	
	
	//36 -- 50
	
	private void Inicio() {
		
		val = new int[8];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 8; i++) {
			System.out.print("Ingresar numero : ");
			val[i] = scan.nextInt();
		}
	}
	
	private void Sumar() {
		
		for (int i = 0; i < 8; i++) {
			suma = suma +val[i];
			
			if (val[i] > 36) {
				suma2 = suma2+val[i];
			}
			
			if (val[i] > 50) {
				cont1++;
			}
		}
	}
	
	private void Imprimir() {
	
		System.out.println("Suma de los registros : " + suma);
		System.out.println("Suma de los registros mayores a 36 : " + suma2);
		System.out.println("Suma de cantidad mayores a 50 : " + cont1);
		
		
	}
	
	public static void main(String[] args) {
		//
		
		Suma8 sum = new Suma8();
		sum.Inicio();
		sum.Sumar();
		sum.Imprimir();
		
	}
}
