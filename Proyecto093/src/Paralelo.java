import java.util.Iterator;
import java.util.Scanner;

public class Paralelo {

	private int sueldo[][];
	private String trabajador[];
	private int sueldos[];
	
	private void Cargar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Sueldos-Trabajadores");
		sueldo = new int[4][3];
		trabajador = new String[4];
		
		
		for (int i = 0; i < trabajador.length; i++) {
			System.out.println("Ingrese Nombre del Empleado : ");
			trabajador[i] = scan.next();
			for (int j = 0; j < sueldo[i].length; j++) {
				System.out.print("Ingrese Sueldo : ");
				sueldo[i][j] = scan.nextInt();
			}
		}
		
	}
	
	private void Sumar() {
		
		sueldos = new int[4];
		int suma =0;
		
		for (int i = 0; i < sueldo.length; i++) {
			//
			for (int j = 0; j < sueldo[i].length; j++) {
				suma = suma +sueldo[i][j];
				
			}
			sueldos[i] = suma;
		}
		
		// 4x3
	}
	
	
	private void Imprimir() {
		System.out.println("Sueldos: ");
		for (int i = 0; i < trabajador.length; i++) {
			System.out.println(trabajador[i]+" - "+sueldos[i]);
		}
	}
	
	private void EmpleadoMayor() {
		
		System.out.println("Empleado mayor sueldo : ");

		int mayor = sueldos[0];
		String nom = "";
		
		for (int i = 0; i < sueldos.length; i++) {
			if (sueldos[i]> mayor) {
				mayor = sueldos[i];
				
				//
				nom = trabajador[i];
				
			}
		}
		System.out.println("Empleado con mayor sueldo : "+ nom+"Mayor sueldo :"+ mayor);
		
	}
	
	public static void main(String [] args) {
		
		//
		Paralelo ver = new Paralelo();
		ver.Cargar();
		ver.Sumar();
		ver.Imprimir();
		ver.EmpleadoMayor();
	}
	
}





