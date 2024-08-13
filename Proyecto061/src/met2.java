import java.util.Scanner;

public class met2 {

	private int a,h,b;
	private Scanner scan ;
	
	public void Inicio() {
		
		scan = new Scanner(System.in);
		
		
		System.out.print("Ingrese primer lado : ");
		b = scan.nextInt();
		
		System.out.print("Ingrese segundo lado : ");
		h = scan.nextInt();
		
		
		
	}
	
	public void Procesar() {
		a = (b*h)/2;
	}
	
	
	public void Salida() {
		System.out.println("Area del triangulo : "+a);
	}
	
	
	//
	public static void main(String [] lccs) {
		
		met2 met = new met2();
		
		met.Inicio();
		met.Procesar();
		met.Salida();
	}
}
