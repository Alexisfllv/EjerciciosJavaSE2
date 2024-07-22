import java.util.Scanner;

public class Ordenamiento {
	
	private int x[];
	private int y[];
	private int z[];
	private int num;
	
	public void Cargar() {
		
		x = new int[4];

		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < x.length; i++) {
			
			System.out.println("Ingresar elementos : ");
			x[i] = scan.nextInt();
		}
	}
	
	public void Ordenar() {

		int aux=0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
				//
				if (x[j] >x[j+1]) {
					aux=x[j];	 
					x[j]= x[j+1];
					x[j+1] = aux;
				}
				
			}
		}
	}
	
	public void Imprimir() {
		System.out.println("Numeros de menor a mayor : ");
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		
	}
	
	public static void main(String [] args) {
		Ordenamiento on = new Ordenamiento();
		on.Cargar();
		on.Ordenar();
		on.Imprimir();
	}

}
