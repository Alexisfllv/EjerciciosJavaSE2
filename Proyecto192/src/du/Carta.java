package du;

public class Carta {
	
	
	private int numero;
	private Simbolo sim;
	
	public Carta(int numero , Simbolo sim) {
		// TODO Auto-generated constructor stub
		this.numero = numero;
		this.sim = sim;
	}
	
	//
	
	public void mostrar() {
		System.out.println(numero + "  / " + sim.toString().toLowerCase());
	}
	
	//clase de retorno
	
	

}
