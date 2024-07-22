import java.util.ArrayList;

public class Mazo {

	//
	// metodo statico de lista
	public static void imprimirAr(ArrayList<Carta> sct) {
		for (Carta carta : sct) {
			carta.imprimir();
		}
		System.out.println();
	}

	public static void main(String[] args) {

		ArrayList<Carta> ct = new ArrayList<Carta>();

		ct.add(new Carta(1, Simbolo.CORAZON));
		ct.add(new Carta(2, Simbolo.PKZ));
		ct.add(new Carta(3, Simbolo.ROMBO));
		ct.add(new Carta(4, Simbolo.TREBOL));

		//
		imprimirAr(ct);

		// valor aleatorio
		System.out.println("Valor aleatorio");
		int e = (int) (Math.random() * 4);
		Carta crt = ct.get(e);
		
		ct.get(e).imprimir();
		crt.imprimir();
		
		
		

	}

}
