import java.util.Scanner;

public class sueldoOperario {

public static void main(String[] args) {
		
		
		int hora;
		float trabajo,sueldo;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese horas : ");
		hora = scan.nextInt();
		
		System.out.print("Ingrese trabajo : ");
		trabajo = scan.nextFloat();
		
		
		sueldo = hora*trabajo;
		
		System.out.println("Sueldo es : " + sueldo);
	}
}
