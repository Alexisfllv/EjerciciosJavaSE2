import java.util.Scanner;

public class Tabla {

	private int x,y;
	private int valor;
	
	private void Iniciar() {
		Scanner scan = new Scanner(System.in);
		
		do {
		
			System.out.print("Ingresa valor de num : ");
			valor = scan.nextInt();
			
			if (valor !=0) {
				Calcular(valor);
			}
			
			
		} while (valor!=0);
		
	}
	
	private void Calcular(int num) {
		
		for (int i = 1; i <= 10; i++) {
			num = valor*i;
			System.out.println(valor + "  *  " +i + " = "+num);
		}
	}
	
	
	//
	public static void main(String [] lccs) {
		
		Tabla ta = new Tabla();
		ta.Iniciar();
		
	}
}
