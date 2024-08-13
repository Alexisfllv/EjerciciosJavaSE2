import java.util.Scanner;

public class Mayor {
	
	//
	
	private int x,y;
	private int mayor=0;
	private int valor,valor1,valor2;
	
	public void Inicio() {
		Scanner scan = new Scanner(System.in);
		
		
			
			System.out.print("Ingresar valores : ");
			valor= scan.nextInt();
			System.out.print("Ingresar valores : ");
			valor1= scan.nextInt();
			System.out.print("Ingresar valores : ");
			valor2= scan.nextInt();
			
			
			//
			
				Mayores(valor,valor1,valor2);
				Menores(valor,valor1,valor2);
			
		
	}
	
	public void Mayores(int v1,int v2,int v3) {
		
		if (v1>v3 && v1 > v2) {
			mayor =v1;
		}
		
		if (v2>v1 && v2>v3) {
			mayor =v2;
		}
		
		if (v3>v1 && v3>v2) {
			mayor = v3;
		}
	}
	
	//
	private int menor=0;
	
	public void Menores(int v1,int v2,int v3) {
		
		if (v1<v3 && v1 < v2) {
			menor =v1;
		}
		
		if (v2<v1 && v2<v3) {
			menor =v2;
		}
		
		if (v3<v1 && v3<v2) {
			menor = v3;
		}
	}
	
	
	
	public void Imprimir() {
		System.out.println("El mayor es : "+mayor);
		System.out.println("El menor es : "+menor);
	}
	
	public static void main (String[] lccs) {
		
		
		//
		Mayor may = new Mayor();
		
		may.Inicio();
		may.Imprimir();
	}
	

}
