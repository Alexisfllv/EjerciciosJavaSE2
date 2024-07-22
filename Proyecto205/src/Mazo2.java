import java.util.ArrayList;
import java.util.Collections;

public class Mazo2 {
	
	
	//fragmentos
	
	private ArrayList<Carta> ct;
	
	public Mazo2() {
		
		ct = new ArrayList<>();
		ct.add(new Carta(1, Simbolo.CORAZON));
		ct.add(new Carta(2, Simbolo.PKZ));
		ct.add(new Carta(3, Simbolo.ROMBO));
		ct.add(new Carta(4, Simbolo.TREBOL));
		ct.add(new Carta(5, Simbolo.CORAZON));
		ct.add(new Carta(6, Simbolo.PKZ));
		ct.add(new Carta(7, Simbolo.ROMBO));
		ct.add(new Carta(8, Simbolo.TREBOL));
		
		
	}
	
	public void imprimir() {
		System.out.println("Listado");
		for (Carta carta : ct) {
			
			carta.imprimir();
		}
	}
	
	public void imprimirRam() {
		System.out.println("Valor Random");
		int e = (int)(Math.random()*7);
		Carta crt =  ct.get(e);
		crt.imprimir();
	}
	
	public void barajar() {
		System.out.println("Barajar");
		Collections.shuffle(ct);
	}
	
	
	public static void main (String [] args) {
	
		Mazo2 mz2 = new Mazo2();
		mz2.imprimir();
		mz2.imprimirRam();
		mz2.barajar();
		mz2.imprimir();
	}
	

}
