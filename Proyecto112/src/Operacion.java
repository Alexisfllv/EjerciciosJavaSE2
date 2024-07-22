import java.util.Scanner;

public class Operacion {
	
	protected Scanner scan;
	protected int valor1,valor2,resultado;
	
	public Operacion() {
		scan = new Scanner(System.in);
	}
	
	public void cargar1() {
		System.out.print("Ingrese primer valor : ");
		valor1 = scan.nextInt();
	}
	
	public void cargar2() {
		System.out.print("Ingrese segundo valor : ");
		valor2 = scan.nextInt();
	}
	
	public void mostrarResultado() {
		System.out.println("Resultado : "+resultado);
	}

}
