
public class Resta extends Operacion{

	public Resta(int valor1, int valor2) {
		super(valor1, valor2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void operar() {
		// TODO Auto-generated method stub
		resultado = valor1 - valor2;
	}
	
	public static void main (String [] args) {
		Resta res = new Resta(20, 10);
		res.operar();
		res.imprimir();
	}

	
	
}
