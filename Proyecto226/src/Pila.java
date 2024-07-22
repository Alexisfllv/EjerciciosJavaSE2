
public class Pila extends Lista{

	@Override
	public void insertar(int x) {

		Nodo nuevo = new Nodo();
		nuevo.info = x;
		nuevo.sig = raiz;
		raiz = nuevo;
		
	}

	@Override
	public int extraer(int x) {
		
		if (raiz == null) {
			return Integer.MAX_VALUE;
			
		}else {
			int valor = raiz.info;
			raiz = raiz.sig;
			return valor;
		}
		
	}

	
	//
	
	
	public static void main (String [] args) {
		//
		Pila pi = new Pila();
		pi.insertar(20);
		pi.insertar(0);
		pi.insertar(0);
		pi.imprimir();
	}
	
}
