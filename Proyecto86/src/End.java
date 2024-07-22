import java.util.Scanner;

public class End {

	private int x,y;
	private int num[][];
	
	
	public void Cargar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Arreglo");
		num = new int [4][4];
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(i+" - "+j+" Ingresar numeros : ");
				num[i][j] = scan.nextInt();
			}
		}
	}
	
	public void Mostrar() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				
				if (i==j) {
					System.out.println("Valor diagonal : "+ num[i][j]+"-");
				}
			}
		}
	}
	public void Mostrar2() {
		for (int i = 0; i < 4; i++) {
			System.out.println("Valor diagonal : "+num[i][i]);
		}
	}
	
	public static void main(String [] args) {
		End end = new End();
		end.Cargar();
		end.Mostrar();
		end.Mostrar2();
	}
}
