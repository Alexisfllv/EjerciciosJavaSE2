
public class ListaGenericaDoble {

	//

	class Nodo {
		int info;
		Nodo sig, ant;
	}

	private Nodo raiz;

	public void insertarPrimero(int x) {
		Nodo nuevo = new Nodo();
		nuevo.info = x;
		if (raiz == null) {
			raiz = nuevo;
		} else {
			nuevo.sig = raiz;
			raiz.ant = nuevo;
			raiz = nuevo;
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
	
	
	public void insertarUltimo(int x) {
		Nodo nuevo = new Nodo();
		nuevo.info = x;
		if (raiz == null) {
			raiz=nuevo;
		}else {
			Nodo reco = raiz;
			while (reco.sig != null) {
				reco = reco.sig;
			}
			reco.sig=nuevo;
			nuevo.ant=reco;
		}
	}
	
	public void insertarSegunda(int x) {
		if (raiz != null) {
			Nodo nuevo= new Nodo();
			nuevo.info=x;
			if (raiz.sig == null) {
				raiz.sig = nuevo;
				nuevo.ant = raiz;
			}
			else {
				Nodo segundo = raiz.sig;
				raiz.sig=nuevo;
				nuevo.ant=raiz;
				nuevo.sig = segundo;
				segundo.ant=nuevo;
			}
		}
	}
	
	public void insertarAnteultimo(int x) {
		if (raiz != null) {  //No esta vacia;
			Nodo nuevo = new Nodo();
			nuevo.info = x;
			if (raiz.sig ==null) {
				nuevo.sig=raiz;
				raiz.ant = nuevo;
				raiz = nuevo;
			}else {
				Nodo reco = raiz;
				while (reco.sig!= null) {
					reco = reco.sig;
				}
				Nodo anterior = reco.ant;
				anterior.sig=nuevo;
				nuevo.ant= anterior;
				nuevo.sig=reco;
				reco.ant=nuevo;
				
				
			}
		}
	}
	
	public void borrarPrimer() {
		if (raiz!=null) {
			raiz = raiz.sig;
			if (raiz != null) {
				raiz.ant=null;
			}
		}
	}
	
	public void borrarSegundo() {
		if (raiz != null) {
			if (raiz.sig!=null) {
				Nodo tercero = raiz.sig.sig;
				raiz.sig=tercero;
				if (tercero != null) {
					tercero.ant=raiz;
				}
			}
		}
	}
	
	public void borrarUltimo() {
		if (raiz != null) {
			if (raiz.sig==null) {
				raiz = null;
			}else {
				Nodo reco = raiz;
				while (reco.sig!= null) {
					reco = reco.sig;
				}
				Nodo anterior = reco.ant;
				anterior.sig=null;
			}
		}
	}
	
	public void borrarMayor() {
		if (raiz != null) {
			int mayor = raiz.info;
			Nodo reco = raiz;
			while (reco != null) {
				if (reco.info>mayor) {
					mayor = reco.info;
				}
				reco = reco.sig;
			}
			reco=raiz;
			while (reco!=null) {
				if (reco.info==mayor) {
					if (reco==raiz) {
						//primero
						raiz=raiz.sig;
						reco=raiz;
						if (raiz!= null) {
							raiz.ant=null;
						}
					}else {
						if (reco.sig==null) {
							//final
							reco = reco.ant;
							reco.sig=null;
							break;
						}else {
							//medio
							Nodo anterior = reco.ant;
							reco = reco.sig;
							anterior.sig=reco;
							reco.ant=anterior;
						}
					}
				}else {
					reco = reco.sig;
				}
			}
		}
	}
	

	public static void main(String[] args) {

		ListaGenericaDoble ls = new ListaGenericaDoble();
		ls.insertarPrimero(20);
		ls.insertarPrimero(30);
		ls.insertarPrimero(10);
		ls.imprimir();
		ls.insertarPrimero(50);
		ls.imprimir();
		ls.insertarUltimo(99);
		ls.imprimir();
		ls.insertarSegunda(22);
		ls.imprimir();
		ls.insertarAnteultimo(77);
		ls.imprimir();
		ls.borrarPrimer();
		ls.imprimir();
		ls.borrarPrimer();
		ls.imprimir();
		ls.borrarMayor();
		ls.imprimir();

	}

}
