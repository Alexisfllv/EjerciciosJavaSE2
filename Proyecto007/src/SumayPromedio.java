import java.util.Scanner;

public class SumayPromedio {

	
	public static void main(String[] args) {
		
		
		int num1,num2,num3,num4;
		float  suma;
		float promedio;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese numero 1 : ");
		num1 = scan.nextInt();
		System.out.print("Ingrese numero 2 : ");
		num2 = scan.nextInt();
		System.out.print("Ingrese numero 3 : ");
		num3 = scan.nextInt();
		System.out.print("Ingrese numero 4 : ");
		num4 = scan.nextInt();
		
		//valor de suma:
		suma = num1+num2+num3+num4;
		
		//valor de promedio:
		promedio = suma/ 4;
		
		System.out.println("Valor de suma  : " + suma);
		System.out.println("Valor de promedio  : " + promedio);
	}
}
