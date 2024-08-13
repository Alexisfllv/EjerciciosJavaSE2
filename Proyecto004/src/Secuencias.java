import java.util.Scanner;

public class Secuencias {

	
public static void main(String[] args) {
		
		int numero1,numero2;
		int suma,producto;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese numero 1 : ");
		numero1 = scan.nextInt();
		
		System.out.print("Ingrese numero 2 : ");
		numero2 = scan.nextInt();
		
		//suma
		suma = numero1+numero2;
		
		//producto
		producto = numero1*numero2;
		
		System.out.println("Valor suma  : " +suma);
		System.out.println("Valor de producto : " + producto);
		
		
		
	}

}
