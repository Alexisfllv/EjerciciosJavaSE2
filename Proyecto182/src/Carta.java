
public class Carta {
	
	private String palo;
	private int numero;
	
	
	public Carta(int numero , String palo) {
		//
		this.numero = numero;
		this.palo = palo;
	}
	
	public void imprimir() {
		System.out.println(numero + " " + palo);
	}

}
