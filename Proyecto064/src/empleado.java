import java.util.Scanner;

public class empleado {
	
	
	//supera a 3000 mil paga impuestos
	
	private int sueldo;
	private String nombre;
	private int x,y;
	
	
	
	private void Iniciar() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese nombre : ");
		nombre = scan.next();
		
		System.out.print("Ingrese sueldo : ");
		sueldo = scan.nextInt();
	}
	
	private void Validar() {
		if (sueldo >3000) {
			System.out.println("Debe pagar impuestos");
		}else {
			System.out.println("No paga impuestos");
		}
	}
	
	
	public static void main(String[] lccs) {
		empleado  empl = new empleado();
		empl.Iniciar();
		empl.Validar();
	}
}
