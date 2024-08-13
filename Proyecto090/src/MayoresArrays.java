import java.util.Scanner;

public class MayoresArrays {
	
	private int num[][];
	private int x,y;
	private int mayor=0;
	
	
	private void Cargar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("ARREGLO MAYORES" );
		System.out.println("Ingrese fila : " );
		x = scan.nextInt();
		System.out.println("Ingrese Columna : " );
		y = scan.nextInt();
		
		num = new int[x][y];
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print("Ingrese numero : ");
				num[i][j] = scan.nextInt();
			}
		}
	}
	
	private void MayorEle() {
		
		mayor = num[0][0];
		int fil=0,col=0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				
				if (mayor < num[i][j]) {
					mayor = num[i][j];
					 fil = i;
					 col = j;
				}
				System.out.println("Mayor Numero  : "+mayor+" : En "+fil+col);
			}
		}
	}
	
	public static void main(String [] args) {
		
		MayoresArrays may = new MayoresArrays();
		may.Cargar();
		may.MayorEle();
	}
}
