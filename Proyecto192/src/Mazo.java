
public class Mazo {
	
	//int grupo [8] =  
			
	private Carta[] grupo;
	
	public Mazo() {
		grupo =  new Carta[8];
		grupo[0] = new Carta(11,Carta.Dato.CORAZON);
		grupo[1] = new Carta(2,Carta.Dato.ROMBO);
		grupo[2] = new Carta(1,Carta.Dato.PIKZ);
		grupo[3] = new Carta(2,Carta.Dato.CORAZON);
		grupo[4] = new Carta(1,Carta.Dato.TREBOL);
		grupo[5] = new Carta(2,Carta.Dato.TREBOL);
		grupo[6] = new Carta(1,Carta.Dato.CORAZON);
		grupo[7] = new Carta(2,Carta.Dato.ROMBO);
		
	}
	
	
	public void imprimir2() {
		System.out.println("Listado Completo de cartas");
		
		for (Carta carta : grupo) {
			carta.imprimir();
		}
	}
	
	public void sacarCartaAlzar() {
		System.out.println("Una carta random");
		
		int e = (int)(Math.random()*7);
		Carta carta=grupo[e];
		carta.imprimir();
		System.out.println(e);
		
	}
	
	
	public static void main (String [] args) {
		Mazo maz = new Mazo();
		maz.imprimir2();
		maz.sacarCartaAlzar();
		
	}

}
