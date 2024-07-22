
public class Carta {
	
	private Dato dato;
	private int valor;
	
	public enum Dato {

		CORAZON,PIKZ,TREBOL,ROMBO
	}
	
	
	public Carta( int valor,Dato dato) {
		this.dato = dato;
		this.valor= valor;
		
	}
	
	
	public void imprimir(){
		System.out.println(dato.toString().toLowerCase() + "  /  " + valor);
	}
	
	public Dato retonarDato() {
		return dato;
	}

}
