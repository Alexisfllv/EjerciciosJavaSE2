import java.util.Scanner;

public class ingresarNotas {

	
	public static void main(String[] args) {
		
		
		//
		
		int x=1,nota,aprobados=0,desaprobados=0;
		
		Scanner scan = new Scanner(System.in);
		
		while (x <=10) {
			System.out.print("Ingrese nota : ");
			nota = scan.nextInt();
			x++;
			
			if (nota >= 7) {
				aprobados++;
			}else {
				desaprobados++;
			}
		}
		
		System.out.println("Notas Mayores o iguales a 7 : " + aprobados);
		System.out.println("Notas Menores  a 7 : " + desaprobados);
		
	}
}
