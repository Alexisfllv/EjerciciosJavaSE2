import java.util.Scanner;

public class promedio {

	private int x,y;
	private float num[];
	private float prom=0,suma=0;
	private float mayor=0,menor=0;
	
	private void Inicio() {
		
		num = new float[5];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("Ingresar numeros : ");
			num[i] = scan.nextFloat();
			
			
			
			
			
		}
		
	}
	
	private void Promedio() {
		
		
		for (int i = 0; i < 5; i++) {
			
			suma = suma + num[i];
			
		}
		prom = suma /5;
	}
	
	private void MayorMenor() {
	
		for (int i = 0; i <5; i++) {
			
			if (num[i] > prom) {
				mayor++;
			}else {
				if (num[i]<prom) {
					menor++;
				}
			}
		}
		
		
	}
	
	
	
	private void Imprimir() {
		System.out.println("Promedio : " + prom);
		System.out.println("Mayor : " + mayor);
		System.out.println("Menor : " + menor);
		
	}
	
	
	public static void main (String [] args) {
		
		promedio prom = new promedio();
		prom.Inicio();
		prom.Promedio();
		prom.MayorMenor();
		prom.Imprimir();
		
	}
	
}
