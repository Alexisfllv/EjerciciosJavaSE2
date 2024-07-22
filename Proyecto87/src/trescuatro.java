import java.util.Scanner;

public class trescuatro {

	private int num[][];
	private int x,y;
	
	public void Cargar() {
		Scanner scan = new Scanner(System.in);
		num = new int[3][4];
		System.out.println("MATRIZ 3 X 4 : ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
			
				System.out.print(i +"-"+j+ " Valor: ");
				num[i][j] = scan.nextInt();
			}
		}
	}
	
	//primera fila
	//ultima fila
	//primera columna
	
	public void primerafila() {
		for (int i = 0; i < 4; i++) {
			System.out.println("Primera fila : "+ num[0][i]+"-");
		}
	}
	
	public void ultimafila() {
		for (int i = 0; i < 4; i++) {
			System.out.println("Ultima fila : "+ num[2][i]+"-");
		}
	}
	
	public void primeracolumna() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Primera columna : "+ num[i][0]+"-");
		}
	}
	
	public void global() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print( "  "+ i +"-"+j+ " Valor: "+num[i][j] + "|");
			
			}
			System.out.println();
		}
	}
	
	public static void main(String [] args) {
		trescuatro tres = new trescuatro();
		tres.Cargar();
		tres.primerafila();
		tres.ultimafila();
		tres.primeracolumna();
		tres.global();
	}
}
