import java.util.Scanner;

public class problm3 {

	public static void main(String [] lccs) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int edad1,edad2;
		String ape1,ape2;
		
		System.out.print("Primer ape :  ");
		ape1 = scan.nextLine();

		
		System.out.print("Segundo ape :  ");
		//vacio
		//scan.nextLine();
		ape2 = scan.nextLine();

		
		if (ape1.equals(ape2)) {
			System.out.println("Son iguales");
		}else {
			System.out.println("Son diferentes");
		}
	}
}
