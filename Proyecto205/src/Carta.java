
public class Carta {
	
	private int numero;
	private Simbolo simbolo;
	
	public Carta() {
		// TODO Auto-generated constructor stub
	}
	
	public Carta(int numero ,Simbolo simbolo) {
		this.numero = numero;
		this.simbolo = simbolo;
	}
	
	
	public void imprimir() {
		System.out.println("Numero es : " + numero + " Simbolo es : " + simbolo);
	}
	
	
	 public int regresaNumero() {
		 return numero;
	 }
	

}
