import java.util.Scanner;

public class Componentes {

	
	private int x[],y[],z[];
	
	private int less;
	private int suma=0,suma2=0;
	Scanner scan;
	
	private void Inicio() {
		
		x = new int[4];
		y = new int[4];
		scan = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.print("Ingresar valores 1 : ");
			x[i] = scan.nextInt();
		}
		for (int i = 0; i < 4; i++) {
			System.out.print("Ingresar valores 2 :  ");
			y[i] = scan.nextInt();
		}
		
		
	}
	
	private void Sumar() {
		z = new int[4];
		for (int i = 0; i < 4; i++) {
			z[i] = x[i]+y[i];
		}
	}
	
	
	private void Imprimir() {
		System.out.println("Suma de [0] : "  +z[0]);
		System.out.println("Suma de [1] : "  +z[1]);
		System.out.println("Suma de [2] : "  +z[2]);
		System.out.println("Suma de [3] : "  +z[3]);
		
	}
	
	public static void main(String[] lccs) {
		
		Componentes com = new Componentes();
		com.Inicio();
		com.Sumar();
		com.Imprimir();
	}
}
