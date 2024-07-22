import java.util.Scanner;

public class SumayProducto {

	
	public static void main(String [] args)
	{
		
		int num1,num2,num3,num4;
		int suma,producto;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese numero 1 : ");
		num1 = scan.nextInt();
		System.out.print("Ingrese numero 2 : ");
		num2 = scan.nextInt();
		System.out.print("Ingrese numero 3 : ");
		num3 = scan.nextInt();
		System.out.print("Ingrese numero 4 : ");
		num4 = scan.nextInt();
		
		//suma : 
		
		suma = num1+num2;
		
		producto = num3*num4;
		
		System.out.println("Suma de valor num1 y num2 : " + suma);
		System.out.println("Producto de valor num3 y num4  : " + producto);
	}
}
