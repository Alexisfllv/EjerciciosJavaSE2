
public class Pila <E>{
	
	
	class Nodo{
		E info;
		Nodo sig;
	}
	
	private Nodo raiz;
	
	public void insertar(E x) {
		Nodo nuevo = new Nodo();
		nuevo.info = x;
		nuevo.sig =  raiz;
		raiz=nuevo;
	}
	
	
	public E extraer() {
		if (raiz == null) {
			return null;
		}else {
			E informacion =  raiz.info;
			raiz   = raiz.sig;
			return informacion;
		}
	}
}
