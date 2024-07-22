package yu;

public class mazo {
	
	
	private Carta[] cart;
	
	public mazo() {
		// TODO Auto-generated constructor stub
		
		cart =  new Carta[8];
		cart[0] = new Carta(1,Valor.CORAZN);
		cart[1] = new Carta(2,Valor.PIKZ);
		cart[2] = new Carta(3,Valor.ROMBO);
		cart[3] = new Carta(4,Valor.TREBOL);
		cart[4] = new Carta(5,Valor.CORAZN);
		cart[5] = new Carta(6,Valor.TREBOL);
		cart[6] = new Carta(7,Valor.ROMBO);
		cart[7] = new Carta(8,Valor.CORAZN);
		
		
	}
	
	public void listar() {
		for (Carta carta : cart) {
			carta.imprimir();
		}
	}
	
	//
	public void random() {
		int e = (int)(Math.random()*7);
		Carta ct = cart[e];
		System.out.println("RANDOM");
		ct.imprimir();
		
		
		//
		switch (ct.retornarPalo()) {
		case CORAZN: {
			System.out.println("Valor Corazon");
			break;
		}
		case ROMBO: {
			System.out.println("Valor Rombo");
			break;
		}
		case TREBOL: {
			System.out.println("Valor Trebol");
			break;
		}
		case PIKZ: {
			System.out.println("Valor Pikz");
			break;
		}
		
		}
		System.out.println(ct.retornarnumero());
		
		
	}
	
	public static void main (String [] args) {
		mazo mz = new mazo();
		mz.listar();
		mz.random();
	}
	
	

}
