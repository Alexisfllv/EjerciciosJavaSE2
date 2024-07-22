package su;

public class Mazo {
	
	private Carta[] cart;
	
	public Mazo() {
		// TODO Auto-generated constructor stub
		
		cart =  new Carta[8];
		cart[0]= new Carta(1, Simbolo.CORAZON);
		cart[1]= new Carta(2, Simbolo.PIKZ);
		cart[2]= new Carta(3, Simbolo.ROMBO);
		cart[3]= new Carta(4, Simbolo.TREBOL);
		cart[4]= new Carta(5, Simbolo.CORAZON);
		cart[5]= new Carta(6, Simbolo.PIKZ);
		cart[6]= new Carta(7, Simbolo.TREBOL);
		cart[7]= new Carta(8, Simbolo.PIKZ);
	}
	
	//
	public void listar() {
		for (Carta carta : cart) {
			carta.imprimir();
		}
	}
	
	//ar
	public void listarar() {
		int e = (int) (Math.random()*7);
		
		Carta ar = cart[e];
		System.out.println("RANDOM");
		ar.imprimir();
	}
	
	public static void main (String [] args) {
		Mazo mz = new Mazo();
		mz.listar();
		mz.listarar();
	}
	

}
