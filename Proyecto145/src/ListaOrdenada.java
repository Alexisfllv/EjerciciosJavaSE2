
public class ListaOrdenada {
	
	
	class Nodo{
		int info;
		Nodo sig;
	}
	
	private Nodo raiz;
	
	public void insertar(int x) {
		Nodo nuevo = new Nodo();
		nuevo.info =x;
		if (raiz == null) {
			raiz = nuevo;
		}
		else {
			if (x<raiz.info) {
				nuevo.sig = raiz;
				raiz = nuevo;
				
			}else {
				Nodo reco = raiz;
				Nodo atras = raiz;
				while (x >= reco.info && reco.sig!=null) {
					atras = reco;
					reco = reco.sig;
				}
				if (x >= reco.info) {
					reco.sig = nuevo;
					
				}else {
					nuevo.sig = reco;
					atras.sig = nuevo;
				}
			}
		}
		
		
	}
	
	public void imprimir() {
		Nodo reco = raiz;
		while (reco != null) {
			System.out.print(reco.info + " - ");
			reco = reco.sig;
		}
		System.out.println();
	}

	public static void main (String []args) {
		ListaOrdenada ls = new ListaOrdenada();
		ls.insertar(55);
		ls.insertar(88);
		ls.insertar(11);
		ls.imprimir();
		ls.insertar(100);
		ls.insertar(1);
		ls.imprimir();
		
		
	}
}
