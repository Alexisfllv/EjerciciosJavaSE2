
public class MetodosEstaticos {

	public static void main (String [] args) {
		
		String cadena1 =  "255";
		
		int cad = Integer.parseInt(cadena1);
		
		System.out.println(cad);
		
		//binario
		System.out.println(Integer.toBinaryString(cad));
		//numero hexadecimal
		System.out.println(Integer.toHexString(cad));
		//numero octadecimal
		System.out.println(Integer.toOctalString(cad));
		
		
		
		//cadena
		//
		String cad2 =String.valueOf(cad);
		System.out.println(cad);
		
		float valor1 = 10.34442f;
		int x2 = 300;
		System.out.println(String.format("Valor de variable vcalor 1 %.1f / y x2 tiene %d", valor1 , x2));
		
	}
}
