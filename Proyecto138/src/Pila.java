
public class Pila {
	
	class Nodo{
		int info;
		Nodo sig;
	}
	
	private Nodo raiz;
	
	private Pila() {
		raiz = null;
	}
	
	public void insertar(int x) {
		Nodo nuevo = new Nodo();
		nuevo.info=x;
		if (raiz==null) {
			raiz= nuevo;
			nuevo.sig=null;
		}else {
			nuevo.sig=raiz;
			raiz=nuevo;
		}
	}
	
	public void imprimir() {
		Nodo reco = raiz;
		while (reco!= null) {
			System.out.print(reco.info+"-");
			reco = reco.sig;
		}
		
		System.out.println("");
	}
	
	//
	public int extraer() {
		 if (raiz ==null) {
			return Integer.MAX_VALUE;
		}else {
			int informacion = raiz.info;
			raiz = raiz.sig;
			return informacion;
					
		}
	}
	
	//
	public int cantidad() {
		int cant = 0;
		Nodo reco = raiz;
		while (reco!= null) {
			reco = reco.sig;
			cant++;
		}
		return cant;
	}
	
	//
	public boolean vacia() {
		if (raiz == null) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		Pila pil = new Pila();
		pil.insertar(5);
		pil.insertar(40);
		pil.insertar(45);
		pil.imprimir();
		pil.insertar(300);
		pil.imprimir();
		System.out.println("Extraemos el primer nodo de la lista "+pil.extraer());
		pil.imprimir();
		pil.extraer();
		System.out.println("Cantidad de nodos de la lista tipo pila  "+pil.cantidad());
		pil.imprimir();
		
		
		//
		if (pil.vacia()) {
			System.out.println("La pila esta vacia");
		}else {
			System.out.println("La pila no esta vacia");
		}
	}

}
