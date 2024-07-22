import java.util.Scanner;

public class Socio {
	
	private String nombre;
	private int años;
	
	Scanner scan ;
	
	public Socio() {
		scan = new Scanner(System.in);
		System.out.print("Ingrese Nombre : ");
		nombre = scan.next();
		System.out.print("Ingrese Años de Residencia : ");
		años = scan.nextInt();
	}
	private void Ingreso() {
		
	}
	
	public int retorarAños() {
		return años;
	}
	
	public String retornarNombre() {
		return nombre;
	}
	

}
