
public class Division extends Operacion{

	public Division(int valor1, int valor2) {
		super(valor1, valor2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void operar() {
		// TODO Auto-generated method stub
		resultado = valor1 / valor2;
	}
	
	public static void main (String [] args) {
		Division div = new Division(20, 10);
		div.operar();
		div.imprimir();
	}
}
