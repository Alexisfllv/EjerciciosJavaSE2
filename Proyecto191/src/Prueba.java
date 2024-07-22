
public class Prueba {

	
	
	
	public static void main (String []args) {
		
		
		int v1 = 10;
		int v2 =  5;
		
		Operacional op;
		
		op =  Operacional.SUMAR;
		//op =  op.MULTI;
		
		
		if (op == Operacional.SUMAR) {
			int suma = v1+v2;
			System.out.println(suma);
		}
	
	}
}
