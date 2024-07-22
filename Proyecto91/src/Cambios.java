import java.util.Scanner;

public class Cambios {

	private int num[][];
	private int x,y;
	Scanner scan ;
	
	//
	
	
	private void Cargar() {
		scan = new Scanner(System.in);
		System.out.println("Ingresar Filas x Columnas : ");
		System.out.print("Ingresar Numero de Filas : ");
		x = scan.nextInt();
		System.out.print("Ingresar Numero de Columnas : ");
		y = scan.nextInt();
		
		num = new int[x][y];
		for (int i = 0; i <num.length; i++) {
			for (int j = 0; j <num[i].length; j++) {
				System.out.print( i+":"+j+" : ");
				num[i][j] = scan.nextInt();
				
			}
			
		}
	}
	private void Cambiar() {
		for (int i = 0; i < num[0].length; i++) {
			int aux= num[0][i];
			num[0][i]= num[1][i];
			num[1][i] = aux;
		}
	}
	
	
	private void Imprimir() {
		System.out.println("---------------------");
		System.out.println(num[0].length);
		for (int i = 0; i <num.length; i++) {
			for (int j = 0; j <num[i].length; j++) {
				System.out.print( i+":"+j+" : "+num[i][j] +" - ");
				
			}
			System.out.println();
		}
	}
	public static void main (String [] args) {
		Cambios cam = new Cambios();
		cam.Cargar();
		cam.Imprimir();
		cam.Cambiar();
		cam.Imprimir();
	}
}
