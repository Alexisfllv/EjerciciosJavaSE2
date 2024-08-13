import java.util.Scanner;

public class Ordenamiento {
	
	
	private int num[];
	private int x,y;
	
	public void Cargar() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingresar cantidad de numeros : ");
		x = scan.nextInt();
		num = new int[x];
		
		for (int i = 0; i < num.length; i++) {
			System.out.print("Ingresar numeros : ");
			num[i] = scan.nextInt();
		}
	}
	
	
	public void Ordenar() {
		int aux=0;
		
		for (int i = 0; i < x-1; i++) {
			for (int j = 0; j < x-1; j++) {
				if (num[j] > num[j+1]) {
					aux = num[j];
					num[j] = num[j+1];
					num[j+1] = aux;
				}
			}
		}
	}
	
	public void Mostrar() {
		System.out.println("Numeros   : ");
		for (int j = 0;j  < num.length; j++) {
			
			System.out.println(num[j]);
		}
	}
	
	public static void main(String [] args) {
		Ordenamiento ord = new Ordenamiento();
		
		ord.Cargar();
		ord.Ordenar();
		ord.Mostrar();
	}

}
