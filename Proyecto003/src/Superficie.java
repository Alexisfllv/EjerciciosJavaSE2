import java.util.Scanner;

public class Superficie {

	
public static void main(String []args) {
		
		float lado,superficie;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese lado de un cuadrado : ");
		lado = scan.nextFloat();
		
		superficie = lado*lado;
		
		System.out.println("Superficie del cuadrado : " + superficie);
	}

}
