
public class Recur {

	
	class Nodo{
	
		int info;
		Nodo sig;
	}
	
	private Nodo raiz;
	
	public void insertarPrimero(int x) {
		Nodo nuevo = new Nodo();
		nuevo.info = x;
		nuevo.sig= raiz;
		raiz = nuevo;
		
	}
	
	public void imprimir() {
		Nodo reco = raiz;
		while (reco != null) {
			System.out.print(reco.info+" - ");
			reco = reco.sig;
		}
		System.out.println();
	}
	
	
	public void imprimirInverso(Nodo reco) {
		if (reco != null) {
			imprimirInverso(reco.sig);
			System.out.print(reco.info+ " - ");
			
		}
		
	}
	
	public void imprimirInverso() {
		imprimirInverso(raiz);
		System.out.println();
	}
	
	
	public static void main(String [] args) {
		
		Recur re = new Recur();
		
		re.insertarPrimero(10);
		re.insertarPrimero(20);
		re.insertarPrimero(30);
		re.imprimir();
		re.imprimirInverso();
		
	}
}
