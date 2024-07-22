package lu;

import java.util.Scanner;

public class my {

	public static void main (String [] arfs) {
		//
		Scanner scan = new Scanner(System.in);
		
		
		//
		
		int x;
		String res = "";
		
		System.out.print("Ingrese un numero : ");
		x = scan.nextInt();
		
		res = (x>18)?"Es mayor de edad":"No es mayor de edad";
		
		System.out.println(res);
		
		
		
		
	}
}
