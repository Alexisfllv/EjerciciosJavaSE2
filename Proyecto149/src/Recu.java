
public class Recu {
	
	//
	
	public void imprimir(int x) {
		if (x >0) {
			System.out.println(x);
			imprimir(x-1);
			System.out.println(x);
		}
	}
	
	
	public static void main (String [] args) {
		
		
		Recu re = new Recu();
		re.imprimir(5);
		System.out.println();
	}
 
}
