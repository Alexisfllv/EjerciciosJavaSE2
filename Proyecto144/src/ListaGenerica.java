
public class ListaGenerica {

	class Nodo{
		int info;
		Nodo sig;
	}
	
	private Nodo raiz;
	
	public void insertarPrimero(int x ) {
		Nodo nuevo = new Nodo();
		nuevo.info=x;
		nuevo.sig=raiz;
		raiz = nuevo;
	}
	
	public void imprimir() {
		Nodo reco = raiz;
		while (reco!= null) {
			System.out.print(reco.info+" - ");
			reco = reco.sig;
		}
		System.out.println();
	}
	
	public void insertarFinal(int x) {
		
		Nodo nuevo = new Nodo();
		nuevo.info=x;
		if (raiz == null) {
			raiz= nuevo;
		}else {
			Nodo reco = raiz;
			while (reco.sig!= null) {
				reco = reco.sig;
			}
			reco.sig= nuevo;
		}
	}
	public void insertarSegundo(int x) {
		if (raiz != null) {
			Nodo nuevo = new Nodo();
			nuevo.info=x;
			if (raiz.sig==null) {
				raiz.sig=nuevo;
			}else {
				Nodo segundo = raiz.sig;
				raiz.sig = nuevo;
				nuevo.sig = segundo;
			}
		}
	}
	
	public void insertarAnteUltimo(int x) {
		if (raiz!= null) {
			Nodo nuevo = new Nodo();
			nuevo.info = x;
			if (raiz.sig == null) {
				nuevo.sig = raiz;
				raiz = nuevo;
			}else {
				Nodo atras = raiz;
				Nodo reco = raiz.sig;
				while (reco.sig!= null) {
					atras = reco;
					reco = reco.sig;
				}
				nuevo.sig = atras.sig;
				atras.sig = nuevo;
			}
		}
	}
	
	public void borrarPrimero(){
		if (raiz != null) {
			raiz = raiz.sig;
		}
	}
	
	public void borrarSegundo() {
		if (raiz != null) {
			if (raiz.sig!= null) {
				Nodo tercero = raiz.sig.sig;
				
				raiz.sig = tercero;
			}
		}
	}
	
	public void borrarUltimoNodo() {
		if (raiz != null) {
			if (raiz.sig == null) {
				raiz=null;
			}else {
				Nodo reco = raiz.sig;
				Nodo atras = raiz;
				while (reco.sig != null) {
					atras = reco;
					reco = reco.sig;
				}
				atras.sig =null;
			}
		}
	}
	
	public void borrarNodoMayor() {
		if (raiz != null) {
			int mayor = raiz.info;
			Nodo reco = raiz;
			while (reco!=  null) {
				if (reco.info>mayor) {
					mayor = reco.info;
				}
				reco = reco.sig;
			}
			reco = raiz;
			Nodo atras = raiz;
			while (reco != null) {
				if (reco.info == mayor) {
					if (reco == raiz) {
						raiz = raiz.sig;
						atras = raiz;
						reco = raiz;
					}else {
						atras.sig=reco.sig;
						reco = reco.sig;
					}
				}else {
					atras = reco;
					reco = reco.sig;
				}
			}
		}
	}
	
	public static void main(String []args) {
		ListaGenerica ls = new ListaGenerica();
		ls.insertarPrimero(200);
		ls.insertarPrimero(300);
		ls.insertarPrimero(500);
		ls.imprimir();
		ls.insertarFinal(700);
		ls.imprimir();
		ls.insertarSegundo(600);
		ls.imprimir();
		ls.insertarAnteUltimo(333);
		ls.imprimir();
		ls.borrarPrimero();
		ls.imprimir();
		ls.borrarSegundo();
		ls.imprimir();
		ls.borrarUltimoNodo();
		ls.imprimir();
		ls.borrarNodoMayor();
		ls.imprimir();
	}
}
