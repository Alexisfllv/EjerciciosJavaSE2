import java.util.Scanner;

public class altura {

	
	public static void main (String[] args) {
		
		
		int n,x=1;
		float altura=0,suma=0,promedio=0;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Ingrese cantidad : ");
		n  = scan.nextInt();
		
		while (x <=n) {
			System.out.print("Ingrese altura : ");
			altura = scan.nextFloat();
			suma = suma + altura;
			x++;
			
			
		}
		
		promedio = suma / n;
		
		System.out.println("Promedio  : " +promedio);
		
	}
	
}
