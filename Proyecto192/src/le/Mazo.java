package le;

public class Mazo {

	
	//
	private Carta[] carta;
	
	public Mazo() {
		
		carta =  new Carta[8];
		carta[0]= new Carta(1, Valor.CORAZON);
		carta[1]= new Carta(2, Valor.PIKS);
		carta[2]= new Carta(3, Valor.ROMBO);
		carta[3]= new Carta(4, Valor.TREBOL);
		carta[4]= new Carta(5, Valor.PIKS);
		carta[5]= new Carta(6, Valor.TREBOL);
		carta[6]= new Carta(7, Valor.CORAZON);
		carta[7]= new Carta(8, Valor.PIKS);
	}
	
	//Listado de cartas
	
	public void listarCartas() {
		for (Carta car : carta) {
			car.imprimir();
		}
	}
	
	//listar carta random
	
	public void listarRandom() {
	
		int e = (int)(Math.random()*8);
		
		System.out.println("Valor aleatorio");
		Carta cate = carta[e];
		cate.imprimir();
				
		
		
	}
	
	
	
	
	
	
	public static void main (String []args) {
		
		//
		Mazo mz = new Mazo();
		
		mz.listarCartas();
		mz.listarRandom();
	}
}
