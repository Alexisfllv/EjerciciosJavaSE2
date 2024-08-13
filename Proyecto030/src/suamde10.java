import java.util.Scanner;

public class suamde10 {

	
	public static void main(String [] args) {
		
		//
		int n=0,suma=0,c=1;
		
		while (c<=10) {
			
			Scanner scan = new Scanner(System.in);
			System.out.print("Ingrese numero : ");
			n = scan.nextInt();
			
			suma = suma + n;
			c= c+1;
		}
		
		//suma & promedio
		
		int promedio;
		
		promedio = suma / 10;
		
		System.out.println("Suma de valores es  : " + suma);
		System.out.println("Promedio de valores es  : " + promedio);
		
	}
}
