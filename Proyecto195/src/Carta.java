
public class Carta {

	private int numero;
	private Simbolo palo;
	
	
	
	public Carta(int numero, Simbolo palo) {
		super();
		this.numero = numero;
		this.palo = palo;
	}
	
	public void imprimir() {
		System.out.println(numero + " " + palo);
	}
	
	
	
}
