import java.util.Scanner;

public class nfilas {

	
	private int num[][];
	private int x,y;
	
	public void Cargar() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Cantidad de filas : ");
		x = scan.nextInt();
		
		System.out.print("Cantidad de Columnas : ");
		y = scan.nextInt();
		
		num = new int [x][y];
		
		System.out.println("Arreglo de "+ x+"X"+y+" : ");
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print("Ingrese componentes : ");
				num[i][j] = scan.nextInt();
			}
		}
	}
	
	public void Imprimir() {
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
			
				System.out.print(num[i][j]+" : ");
			}
			System.out.println();
		}
	}
	
	public void ImprimirUltimaFila() {
		
		System.out.println("Ultima fila : ");
		for (int i = 0; i <num[num.length-1].length; i++) {
			System.out.print(num[num.length-1][i]+" - ");
		}
		//System.out.println(num[num.length-1].length);
		System.out.println(num[num.length-1].length);
		
	}
	
	public static void main(String [] args) {
		nfilas nf = new nfilas();
		nf.Cargar();
		nf.Imprimir();
		nf.ImprimirUltimaFila();
	}
}
