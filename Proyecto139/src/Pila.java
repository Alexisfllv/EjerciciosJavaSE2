  
public class Pila {
	
	public class Nodo{
		char simbolo;
		Nodo siguiente;
	}
	
	private Nodo raiz;
	
	public Pila() {
		raiz = null;
	}
	
	public void insertar( char x) {
		Nodo nuevo = new Nodo();
		nuevo.simbolo=x;
		
		if (raiz == null) {
			raiz = nuevo;
			nuevo.siguiente = null;
		}else {
			nuevo.siguiente=raiz;
			raiz= nuevo;
		}
		
	}
	
	public void imprimir() {
		Nodo reco = raiz;
		while (reco!= null) {
			System.out.println(reco.simbolo+" - ");
			reco = reco.siguiente;
		}
		System.out.println("");
	}
	
	public char extarer() {
		if (raiz == null) {
			return Character.MAX_VALUE;
		}else {
			char informacion = raiz.simbolo;
			raiz = raiz.siguiente;
			return informacion;
		}
	}
	
	public int cantidad() {
		int cant =0;
		Nodo reco = raiz;
		while (reco != null) {
			reco=reco.siguiente;
			cant++;
		}
		return cant;
	}
	
	public boolean vacia() {
		if (raiz == null) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		
		//
		
	}

}
