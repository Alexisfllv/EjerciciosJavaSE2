import java.util.Scanner;

public class PerimetroCuadrado {

	
	public static void main(String [] args) {
		
		int lado,perimetro;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese lado : ");
		lado = scan.nextInt();
		
		
		//perimetro
		perimetro = lado*4;
		
		System.out.println("Valor del Perimetro es : " + perimetro);
		
	}
}

