import java.util.Scanner;

public class Sueldostrabajadores {
	
	public static void main (String [] args) {
		
		
		//
		
		int trabajadores,sueldo,n=1,suma=0;
		int sueldoa=0,sueldob=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ingrese cantidad de trabajadores : ");
		trabajadores = scan.nextInt();
		
		while (n <= trabajadores) {
			System.out.print("Ingrese sueldo : ");
			sueldo = scan.nextInt();
			n++;
			
			if (sueldo >= 100 && sueldo <=300) {
				sueldoa= sueldoa +1;
			}else if (sueldo >300) {
				sueldob = sueldob+1;
			}
			
			suma = suma + sueldo;
			
		}
		
		System.out.println("trabajadores de 100 - 300 : " + sueldoa);
		System.out.println("trabajadores de >500 : " + sueldob);
		System.out.println("suma de sueldos : " + suma);
	}

}
