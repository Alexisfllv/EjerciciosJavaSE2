import java.util.Scanner;

public class Promedio {

	
	public static void main(String [] args) {
		
		float nota1,nota2,nota3,promedio;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ingrese nota 1 : ");
		nota1 = scan.nextFloat();
		
		System.out.print("Ingrese nota 2 : ");
		nota2 = scan.nextFloat();
		
		System.out.print("Ingrese nota 3 : ");
		nota3 = scan.nextFloat();
		
		//
		promedio = (nota1+nota2+nota3)/3;
		
		if (promedio >= 7) {
			System.out.println("Alumno aprobado");
		}
		else {
			System.out.println("Alumno desaprobado");	
		}
	}
}
