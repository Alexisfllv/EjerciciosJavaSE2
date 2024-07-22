package du;

public class Mazo {

	private Carta[] cart;
	
	public Mazo() {
		// TODO Auto-generated constructor stub
		
		cart = new Carta[8];
		cart[0] = new Carta(1, du.Simbolo.CORAZON);
		cart[1] = new Carta(2, du.Simbolo.PIKS);
		cart[2] = new Carta(3, du.Simbolo.ROMBO);
		cart[3] = new Carta(4, du.Simbolo.TREBOL);
		cart[4] = new Carta(5, du.Simbolo.CORAZON);
		cart[5] = new Carta(2, du.Simbolo.PIKS);
		cart[6] = new Carta(3, du.Simbolo.ROMBO);
		cart[7] = new Carta(4, du.Simbolo.TREBOL);
	}
	
	
	//listar
	
	public void listar () {
		for (Carta carta : cart) {
			carta.mostrar();
		}
	}
	//listar aleatorio
	
	public void random() {
		int e = (int)(Math.random()*7);
		Carta carr=  cart[e];
		System.out.println("RANDOM");
		carr.mostrar();
		System.out.println(e);
		
		
		
	}
	
	public static void main (String [] args) {
		Mazo maz =  new Mazo();
		
		maz.listar();
		maz.random();
	}
	
	
}
