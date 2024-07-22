package yu;

public class Carta {

	private int numero ;
	private Valor simbolo;
	
	public Carta() {
		// TODO Auto-generated constructor stub
	}

	public Carta(int numero, Valor simbolo) {
		super();
		this.numero = numero;
		this.simbolo = simbolo;
	}
	
	//METODO DE IMPRIMIR
	
	public void imprimir() {
		System.out.println(numero  + " / " + simbolo);
	}
	
	//return valor clase enum
	
	public Valor retornarPalo() {
		return simbolo;
	}
	
	public int retornarnumero() {
		return numero;
	}
	
	
	
	
	
}
