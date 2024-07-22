
public class Mila {
	
	public class Nodo{
		int info;
		Nodo siguiente;
	}
	
	private Nodo raiz;
	
	public Mila() {
		raiz = null;
	}
	
	public void insertar(int x) {
		Nodo nuevo = new Nodo();
		nuevo.info = x;
		
		if (raiz == null) {
			raiz = nuevo;
			nuevo.siguiente= null;
		}else {
			nuevo.siguiente =raiz;
			raiz=nuevo;
		}
	}
	
	public void imprimir() {
		Nodo reco = raiz;
		while (reco != null) {
			System.out.print(reco.info+" - ");
			reco = reco.siguiente;
		}
		System.out.println();
	}
	
	public static void main(String [] args) {
		
		
		
		//
		Mila mil = new Mila();
		mil.insertar(44);
		mil.insertar(33);
		mil.imprimir();
	}

}
