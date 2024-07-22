
public class Multiplicacion extends Operacion {

	public Multiplicacion(int valor1, int valor2) {
		super(valor1, valor2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void operar() {
		// TODO Auto-generated method stub
		resultado = valor1 * valor2;
	}
	
	public static void main (String [] args) {
		Multiplicacion mul = new Multiplicacion(20, 10);
		mul.operar();
		mul.imprimir();
	}
}
