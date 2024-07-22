import java.util.Scanner;

public class Trabajador {

	
	private int sueldo;
	private String nombre;
	private Scanner scan ;
	
	private Trabajador() {
		scan = new Scanner(System.in);
		System.out.print("Nombre empleado : ");
		nombre = scan.next();
		System.out.print("Sueldo empleado : ");
		sueldo = scan.nextInt();
	}
	
	private Trabajador(String nom,int sue) {
		this.nombre = nom;
		this.sueldo = sue;
	}
	
	private void Imprimir() {
		System.out.println("Nombre es : "+nombre+" Sueldo es : "+sueldo);
	}
	
	private void Impuesto() {
		if (sueldo>3000) {
			System.out.println("Debe pagar impuestos : "+sueldo);
			
		}else {
			System.out.println("No pagara impuestos : "+sueldo);
		}
	}
	
	public static void main(String [] args) {
		Trabajador tra = new Trabajador();
		tra.Imprimir();
		tra.Impuesto();
		
		Trabajador tra2 = new Trabajador("Alxis",500);
		tra2.Imprimir();
		tra2.Impuesto();
	}
}
