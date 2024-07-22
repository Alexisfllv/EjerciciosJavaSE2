import java.util.Scanner;

public class OrdenMatriz {

	//2x5
	//primero ingresar por columnas:
	
	private int num[][];
	private int x,y;
	
	private void Cargar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("MATRIZ 2 X 5 : ");
		num = new int[2][5];
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print("|" + j+" - "+i+ " Ingresa valor : ");
				num[j][i] = scan.nextInt();
			}
			
		}
	}
	
	public void Mostrar() {
		//num = new int[2][5];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("|" + i+" - "+j+ " Ingresa valor : "+num[i][j]);
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		OrdenMatriz ord = new OrdenMatriz();
		ord.Cargar();
		ord.Mostrar();
	}
	
}
