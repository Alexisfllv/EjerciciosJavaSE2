import java.util.Scanner;

public class Edad {
	
	//private int alu[][];
	private String nombre[];
	private int edad[];
	private int x,y;
	private Scanner scan;
	public Edad() {
		
		scan = new Scanner(System.in);
		
		System.out.println("Mayor de Edad ");
		System.out.print("Ingresar cantidad de Alumnos : ");
		x = scan.nextInt();
		edad = new int [x];
		nombre = new String [x];
		
		for (int i = 0; i < nombre.length; i++) {
			System.out.print("Ingresar nombre del Alumno : ");
			nombre[i] = scan.next();
			System.out.print("Ingresar Edad : ");
			edad[i] = scan.nextInt();
		}
	}
	
	private void Imprimir() {
		for (int i = 0; i < edad.length; i++) {
			System.out.println("Alumno : "+nombre[i]+" Con la Edad : "+edad[i]);
		}
	}
	
	public void Mayor() {
		
		int mayor =edad[0];
		String mayorm = nombre[0];
		for (int i = 0; i < edad.length; i++) {
			if (edad[i]>mayor) {
				mayor = edad[i];
				mayorm = nombre[i];
				
			}
			
			
		}
		System.out.println("Alumno : "+mayorm+" Con la Edad es mayor de todos : "+mayor);
	}
	
	public void MayorEdad() {
		int mayor =edad[0];
		String mayorm = nombre[0];
		
		for (int i = 0; i < edad.length; i++) {
			if (edad[i]>18) {
				System.out.println("Alumno : "+nombre[i]+ " Es mayor de Edad!!!");
			}else {
				System.out.println("Alumno : "+nombre[i]+ " Es menor de Edad :(");
			}
		}
	}
	
	public static void main(String [] args) {
		Edad edad = new Edad();
		edad.Imprimir();
		edad.MayorEdad();
	}
}
