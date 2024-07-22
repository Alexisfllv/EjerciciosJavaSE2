package le;

public class Carta {
	
	
	private int num;
	private Valor valor;
	
	public Carta(int num, Valor valor) {
		this.num =  num;
		this.valor =  valor;
	}
	
	//
	
	public void imprimir() {
		System.out.println("numero : " + num + " simbolo : "+ valor);
	}
	
	//retornar dato
	
	public Valor retornar() {
		return valor;
	}
	
	
	

}
