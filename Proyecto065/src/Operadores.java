import java.util.Scanner;

public class Operadores {

	private int x,y;
	private int suma=0,resta=0,multiplicacion=0,division=0;
	
	Scanner scan;
	
	private void Iniciar() {
		scan = new Scanner(System.in);
		System.out.print("Ingresar valor a : ");
		x = scan.nextInt();
		System.out.print("Ingresar valor b : ");
		y = scan.nextInt();
	}
	
	private void Suma() {
		suma = x+y;
	}
	private void Resta() {
		resta = x-y;
	}
	private void Multiplicacion() {
		multiplicacion = x*y;
	}
	
	private void Division() {
		division = x/y;
	}
	
	
	private void Mostrar() {
		System.out.println("Suma : " +suma);
		System.out.println("Resta : " +resta);
		System.out.println("Multiplicacion : " +multiplicacion);
		System.out.println("Division : " +division);
	}
	public static void main(String[] lccs) {
		
		Operadores op = new Operadores();
		op.Iniciar();
		op.Suma();
		op.Resta();
		op.Multiplicacion();
		op.Division();
		op.Mostrar();
	}
}
