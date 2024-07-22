import java.util.Scanner;

public class SumaElem {

	
	private int x[];
	private int num,suma=0;
	
	
	private void Cargar() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Cuantos numeros va a ingresar  : ");
		num = scan.nextInt();
		
		x = new int[num];
		
		for (int i = 0; i < x.length; i++) {
			System.out.print("Ingrese valores  : ");
			x[i] = scan.nextInt();
		}
		
	}
	
	private void Sumar() {
		for (int i = 0; i < x.length; i++) {
			suma = suma + x[i];
		}
	}
	
	private void Imprimir() {
		System.out.println("Suma  : " + suma);
	}
	
	public static void main(String [] args) {
		
		//
		SumaElem sum = new SumaElem();
		sum.Cargar();
		sum.Sumar();
		sum.Imprimir();
		
	}
}
