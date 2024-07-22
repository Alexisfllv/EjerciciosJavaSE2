
public class Mazo {

	
	//
	private Carta[] cartas;
	
	public Mazo () {
		cartas = new Carta[6];
		cartas[0]= new Carta(1, "Trebol");
		cartas[1] =new Carta(2, "Trebol");
		cartas[2] =new Carta(3, "Trebol");
		cartas[3] =new Carta(4, "Trebol");
		cartas[4] =new Carta(5, "Trebol");
		cartas[5] =new Carta(6, "Trebol");
	}
	
	
	public void imprimir() {
		System.out.println("Listado de cartas : ");
		for (Carta i : cartas) {
			i.imprimir();
		}
	}
	
	public void alzar() {
		int n =(int)(Math.random()*6);
		cartas[n].imprimir();
		
	}
	
	public static void main(String [] args) {
		//
		Mazo m = new Mazo();
		m.imprimir();
		m.alzar();
	}
}
