
public class PruebadeFunciones {

	//
	public static void main (String [] args) {
		Suma sum = new Suma(10, 5);
		sum.operar();
		sum.imprimir();
		
		Multiplicacion mul = new Multiplicacion(10,5);
		mul.operar();
		mul.imprimir();
		
		Resta res = new Resta(10, 5);
		res.operar();
		res.imprimir();
		
		Division div = new Division(10, 5);
		div.operar();
		div.imprimir();
	}
	
	
}
