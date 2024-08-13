import java.util.Scanner;

public class Vert {
	
	//
	private int num[][];
	private int x,y;
	
	
	private void Cargar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("ARREGLO");
		System.out.print("Ingresar Fila : ");
		x = scan.nextInt();
		System.out.print("Ingresar Columna : ");
		y = scan.nextInt();
		num = new int [x][y];
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(" "+i+"-"+j+"|Ingrese : " );
				num[i][j] = scan.nextInt();
			}
			
		}
	}
	
	private void Mod() {
		int aux;
		for (int i = 0; i < num[0].length; i++) {
			aux = num[0][i];
			num[0][i] = aux;
			
		}
	}
	
	private void Vertice() {
		System.out.println("Primero : ");
		System.out.println(num[0][0]);
		System.out.println("Segundo : ");
		System.out.println(num[0][y-1]);
		System.out.println("Tercero : ");
		System.out.println(num[x-1][0]);
		System.out.println("Cuarto : ");
		System.out.println(num[x-1][y-1]);
		
	}
	
	private void Imprimir() {
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(" "+i+"-"+j+"|"+num[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("Log: ");
		System.out.println(num.length);
		System.out.println(num[0].length);
		System.out.println(num[0].length-1);
		
	}
	
	public static void main(String [] args) {
		Vert ver = new Vert();
		ver.Cargar();
		ver.Vertice();
		ver.Imprimir();
	}

}
