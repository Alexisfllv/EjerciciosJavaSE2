import java.util.Scanner;

public class Persona {
	
	
	//Principal
	//
	protected Scanner scan;
	protected String nombre;
	protected int edad;
	
	public Persona() {
		scan = new Scanner(System.in);
	}
	
	public void cargarDatos() {
		System.out.print("Ingrese nombre : ");
		nombre= scan.next();
		System.out.print("Ingrese edad : ");
		edad = scan.nextInt();
	}
	
	public void imprimir() {
		System.out.println("Nombre : " + nombre+" Edad :"+edad);
	}

}
