import java.util.Scanner;

public class Multi {

	private int num[][];
	private int x,y;
	
	public void Cargar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Arreglo 3 x 5");
		num = new int[3][5];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(i+" - "+j+" Ingresar numeros : ");
				num[i][j] = scan.nextInt();
			}
		}
	}
	
	public void Imprimir() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(num[i][j] +" - ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		
		Multi mul = new Multi();
		mul.Cargar();
		mul.Imprimir();
	}
}
