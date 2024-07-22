
public class Recursividad {

	public int factorial(int x) {
		if (x >0) {
			int valor = x *  factorial(x-1);
			return valor;
		}else {
			return 1;
		}
	}
	
	
	
	public static void main (String [] args) {
		Recursividad re = new Recursividad();
		re.factorial(4);
		System.out.println("Factorial de " + re.factorial(4));
	}
}
