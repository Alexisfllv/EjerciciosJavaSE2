import java.util.Scanner;

public class cadenas {

	public static void main(String [] args) {
		//
		String cad1,cad2;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingresa texto 1 : ");
		cad1 = scan.next();
		System.out.print("Ingresa texto 2 : ");
		cad2 = scan.next();
		
		//Equals
		if (cad1.equals(cad2)) {
			System.out.println(cad1+" Es identico al nombre "+cad2);
		}else {
			System.out.println(cad1+" No es identico al nombre "+cad2);
		}
		
		//EqualsIgnore
		if (cad1.equalsIgnoreCase(cad2)) {
			System.out.println(cad1+" Es identico al nombre "+cad2);
		}else {
			System.out.println(cad1+" No es identico al nombre "+cad2);
		}
		
		//compareTo
		
		if (cad1.compareTo(cad2)==0) {
			System.out.println("Son Exactamente iguales");
		}else {
			if (cad1.compareTo(cad2)>0) {
				System.out.println(cad1+" es mayor Alfabeticamente que "+cad2);
			}else {
				System.out.println(cad2+" es mayor Alfabeticamente que "+cad1);
			}
		}
		
		//charAt();
		
		char le = cad1.charAt(0);
		System.out.println("Caracter 1 de "+cad1+" es : "+le);
		
		//length();
		int largo = cad1.length();
		System.out.println("Caracteres de  "+cad1+" es : "+largo);
		System.out.println("El ultimo Caracter de  "+cad1+" es : "+cad1.charAt(cad1.length()-1));
		
		//subString
		String cad3 = cad1.substring(0,3);
		System.out.println("Valor del texto 3: " +cad3);
		
		//indexOf
		int x = cad1.indexOf(cad2);
		System.out.println("index : " + x);
		
		if (x == -1) {
			System.out.println("no se encontre el segundo valor en el primero ");
		}else {
			System.out.println("si se encontre el segundo valor en el primero ");
		}
		//ToUpperCase
		System.out.println(cad1.toUpperCase());
		//ToLowerCase
		System.out.println(cad1.toLowerCase());
		
		//
	}
}
