
public class Dado {
	
	private int valor;
	
	public void tirar() {
		valor = 1+(int)(Math.random()*6) ;
		
	}

	public void mostrar() {
		System.out.println("Valor del dado es : " + valor);
	}
	
	public int retornarValor() {
		return valor;
	}
}
