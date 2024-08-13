import java.util.Scanner;

public class condiciondeNumeros {

	
	public static void main(String [] args) {
		
		float valor1,valor2,suma,diferencia,multiplicacion,division;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("ingrese valor de num1 : ");
		valor1 = scan.nextFloat();
		System.out.print("ingrese valor de num2 : ");
		valor2 = scan.nextFloat();
		
		//condicion
		
		if (valor1 > valor2) {
			suma = valor1+valor2;
			diferencia = valor1-valor2;
			
			System.out.println("valor de suma es : " + suma  +"  valor de diferencia es : " + diferencia);
		}else {
			multiplicacion = valor1*valor2;
			division = valor1 /valor2;
			System.out.println("valor de multiplicacion es : " + multiplicacion + "  valor de division es : " + division);
		}
		
	}
}
