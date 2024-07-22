import java.util.Scanner;

public class Elementos {

	private int les[];
	private int x,y;
	
	private void Inicio() {
		
		Scanner scan = new Scanner(System.in);
		les = new int[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Ingresar nuemeros : ");
			les[i] = scan.nextInt();
		}
		
		
	}
	
	private void Probar() {
		
		int demo=1;
		
		for (int i = 0; i < 9; i++) {
			if (les[i+1] < les[i]) {
				demo=0;
				break;
			}
			
			
		}
		if (demo==1) {
			System.out.println("Valores ordenados de menor a mayor");
		}else {
			System.out.println("Valores No ordenados de menor a mayor");
		}
	}
	
	
	public static void main(String [] args) {
		
		Elementos ele =  new Elementos();
		ele.Inicio();
		ele.Probar();
		
	}
}
