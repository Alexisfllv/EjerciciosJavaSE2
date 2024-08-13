import java.util.Scanner;

public class five {

	
	
	//
	private int num[][];
	Scanner scan;
	private void Cargar() {
		//
		scan = new Scanner(System.in);
		System.out.println("Arreglo");
		//X - Y = Y+1
		
		num = new int [5][];
		
		System.out.println("Fila "+num.length);
		for (int i = 0; i < num.length; i++) {
			num[i] = new int[i+1];
			for (int j = 0; j < num[i].length; j++) {
				System.out.println("Ingresar Numero : ");
				num[i][j] = 12;
			}
		}
		
	}
	
	private void Imprimir() {
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print("|"+num[i][j]+"|");
			}
			System.out.println();
		}
	}
	
	public static void main(String [] args) {
		five fiv =  new five();
		fiv.Cargar();
		fiv.Imprimir();
		
	}
}
