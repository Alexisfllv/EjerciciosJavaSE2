
public class Valores {

	private float x,y;
	private float suma,resta,division,multiplicacion;
	
	private Valores(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public void Operar() {
		suma = x+y;
		resta = x-y;
		division = x/y;
		multiplicacion = x*y;
	}
	
	public void Imprimir() {
		System.out.println("Suma : "+suma);
		System.out.println("Resta : "+resta);
		System.out.println("Division : "+division);
		System.out.println("Multiplicacion : "+multiplicacion);
		
	}
	public static void main(String[] args) {
		Valores val = new Valores(10, 200);
		val.Operar();
		val.Imprimir();
	}
}
