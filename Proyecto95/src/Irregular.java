import java.util.Scanner;

public class Irregular {
	
	//
	private int num[][];

	private int x,y;
	Scanner scan ;
	public void Cargar() {
		scan = new Scanner(System.in);
		System.out.println("Matriz Irregular - ");
		System.out.print("Ingresar cantidad de filas : ");
		x = scan.nextInt();
		
		num = new int [x][];
		//
		for (int i = 0; i < num.length; i++) {
			//
			System.out.print("Cuantos numeros quiere en la fila : "+(i+1)+" : ");
			y = scan.nextInt();
			num[i] = new int[y];
			for (int j = 0; j < num[i].length; j++) {
				System.out.print("Ingresar Elementos : ");
				num[i][j] = scan.nextInt();
			}
		}
	}
	
	public void Imprimir() {
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print("|"+num[i][j]+"|");
			}
			System.out.println();
		}
	}
	
	public static void main(String [] args) {
		Irregular irr = new Irregular();
		irr.Cargar();
		irr.Imprimir();
	}

}
