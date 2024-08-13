import java.util.Scanner;

public class Ordenamiento{
	
	
	private int x,y;
	private int  habitantes[];
	private String paises[];
	
	
	public void Cargar() {
		
		habitantes = new int [5];
		paises = new String [5];
		Scanner scan = new Scanner(System.in);
		System.out.println("paises- habitantes");
		for (int i = 0; i < habitantes.length; i++) {
			System.out.print("Ingresar paises : ");
			paises[i] = scan.next();
			System.out.print("Ingresar habitantes : ");
			habitantes[i] = scan.nextInt();
		}
	}
	
	public void Ordenamiento() {
		for (int i = 0; i < habitantes.length-1; i++) {
			for (int j = 0; j < habitantes.length-1; j++) {
				if (paises[j].compareTo(paises[j+1])>0) {
					String aux = paises[j];
					paises[j] = paises[j+1];
					paises[j+1] = aux;
					//Decremento
					int auxh = habitantes[j];
					habitantes[j] = habitantes[j+1];
					habitantes[j+1] = auxh;
				}
			}
		}
	}
	
	
	
	
	
	public void Imprimir() {
		System.out.println("ORDENAMIENTO");
		for (int i = 0; i < habitantes.length; i++) {
			System.out.println(paises[i]+ " - " + habitantes[i] );
		}
	}
	
	public void OrdenHabitantes() {
		for (int i = 0; i < habitantes.length-1; i++) {
			for (int j = 0; j < habitantes.length-1; j++) {
				if (habitantes[j]< habitantes[j+1]) {
					int aux = habitantes[j];
					habitantes[j] = habitantes[j+1];
					habitantes[j+1] = aux;
					//
					String auxc = paises[j];
					paises[j] = paises[j+1];
					paises[j+1] = auxc;
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		
		//
		Ordenamiento ord = new Ordenamiento();
		ord.Cargar();
		ord.Ordenamiento();
		ord.Imprimir();
		ord.OrdenHabitantes();
		ord.Imprimir();
	}
}
