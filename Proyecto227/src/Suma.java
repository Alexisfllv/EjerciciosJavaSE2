
public class Suma extends Operacion{

	public Suma(int valor1, int valor2) {
		super(valor1, valor2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void operar() {

		resultado = valor1 + valor2;
	}

	//
	public static void  main(String [] args) {
		//
		Suma sum = new Suma(12, 3);
		sum.operar();
		sum.imprimir();
	}
	
}
