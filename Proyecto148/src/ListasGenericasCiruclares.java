import java.util.Iterator;

public class ListasGenericasCiruclares {

	class Nodo {
		int info;
		Nodo sig, ant;
	}

	private Nodo raiz;

	//
	public void insertarPrimero(int x) {
		Nodo nuevo = new Nodo();
		nuevo.info = x;
		if (raiz == null) {
			raiz = nuevo;
			raiz.sig = raiz;
			raiz.ant = raiz;
		} else {
			Nodo ultimo = raiz.ant;
			raiz.ant = nuevo;
			nuevo.sig = raiz;
			nuevo.ant = ultimo;
			ultimo.sig = nuevo;
			raiz = nuevo;
		}
	}

	//
	public void imprimir() {
		if (raiz != null) {
			Nodo reco = raiz;
			do {
				System.out.print(reco.info + " - ");
				reco = reco.sig;
			} while (reco != raiz);
			System.out.println();
		}
	}

	//
	public boolean vacia() {
		return raiz == null;
	}

	//
	
	public void insertarUltimo(int x ) {
		Nodo nuevo = new Nodo();
		nuevo.info = x;
		if (raiz == null) {
			raiz = nuevo;
			raiz.sig = raiz;
			raiz.ant = raiz;
		} else {
			Nodo ultimo = raiz.ant;
			raiz.ant = nuevo;
			nuevo.sig = raiz;
			nuevo.ant = ultimo;
			ultimo.sig = nuevo;
			
		}
	}
	
	public int cantidad() {
		if (vacia()) {
			return 0;
		}else {
			int cant = 0;
			Nodo reco = raiz;
			do {
				cant++;
				reco = reco.sig;
			} while (reco!= raiz);
			return cant;
		}
	}
	
	public void borrar(int pos) {
		if (pos<=cantidad()) {
			if (pos==1) {
				if (cantidad()==1) {
					raiz=null;
				}else {
					Nodo ultimo = raiz.ant;
					raiz = raiz.sig;
					ultimo.sig=raiz;
					raiz.ant=ultimo;
				}
			}else {
				Nodo reco = raiz;
				for (int i = 1; i <= pos-1; i++) {
					reco = reco.sig;
				}
				Nodo anterior = reco.ant;
				reco = reco.sig;
				anterior.sig=reco;
				reco.ant=anterior;
			}
		}
	}

	public static void main(String[] args) {
		ListasGenericasCiruclares ls = new ListasGenericasCiruclares();

		if (ls.vacia()) {
			System.out.println("Lista circular vacia");
		} 

		
		ls.insertarPrimero(20);
		ls.insertarPrimero(10);
		ls.insertarPrimero(5);
		ls.imprimir();
		
		if (!ls.vacia()) {
			System.out.println("Lista circular no vacia");
		} 
		ls.insertarUltimo(99);
		ls.imprimir();
		System.out.println("Cantidad de nodos de la lista : " + ls.cantidad());
		ls.borrar(2);
		ls.imprimir();
		
		
	}
}
