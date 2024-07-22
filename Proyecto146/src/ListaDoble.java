
public class ListaDoble {

	
	
	class Nodo{
		int info;
		Nodo sig,ant;
	}
	
	private Nodo raiz;
	
	public void insertarPrimero(int x) {
		Nodo nuevo = new Nodo();
		
		nuevo.info = x;
		if (raiz == null) {
			raiz = nuevo;
		}else {
			nuevo.sig=raiz;
			raiz.ant=nuevo;
			raiz=nuevo;
					
		}
	}
	
	
	public void imprimir() {
		Nodo reco = raiz;
		while (reco != null) {
			System.out.print(reco.info+" - ");
			reco = reco.sig;
		}
		System.out.println();
	}
	
	
	public void insertarFinal(int x) {
		Nodo nuevo = new Nodo();
		nuevo.info =x;
		if (raiz ==nuevo) {
			raiz=nuevo;
		}else {
			Nodo reco = raiz;
			while (reco.sig != null) {
				reco = reco.sig;
			}
			reco.sig = nuevo;
			nuevo.ant=reco;
		}
	}
	
	public void imprimirInverso() {
		if (raiz != null) {
			Nodo reco = raiz;
			while (reco.sig!= null) {
				reco = reco.sig;
				
			}
			while (reco!=null) {
				System.out.print(reco.info+" - ");
				reco = reco.ant;
			}
			System.out.println();
		}
	}
	
	
	public int cantidad() {
		int cant =0;
		Nodo reco=raiz;
		while (reco!= null) {
			cant++;
			reco = reco.sig;
		}
		return cant;
	}
	
	public void insertar(int pos,int x) {
		if (pos<= cantidad()+1) {
			Nodo nuevo = new Nodo();
			nuevo.info = x;
			if (pos ==1) {
				nuevo.sig=raiz;
				if (raiz != null) {
					raiz.ant=nuevo;
				}
				raiz=nuevo;
			}else {
				if (pos==cantidad()+1) {
					Nodo reco = raiz;
					while (reco.sig!= null) {
						reco = reco.sig;
					}
					reco.sig = nuevo;
					nuevo.ant = reco;
				}else {
					Nodo reco = raiz;
					for (int i = 1; i <= pos-2; i++) {
						reco = reco.sig;
					}
					Nodo siguiente = reco.sig;
					reco.sig=nuevo;
					nuevo.ant=reco;
					nuevo.sig=siguiente;
					siguiente.ant = nuevo;
				}
			}
		}
	}
	
	public int extraer(int pos) {
		if (pos<= cantidad()) {
			if (pos==1) {
				int informacion = raiz.info;
				raiz = raiz.sig;
				if (raiz!= null) {
					raiz.ant=null;
				}
				return informacion;
			}else {
				Nodo reco = raiz;
				for (int i = 1; i <= pos-2; i++) {
					reco = reco.sig;
				}
				Nodo prox = reco.sig;
				reco.sig = prox.sig;
				Nodo siguiente = prox.sig;
				if (siguiente !=null) {
					siguiente.ant = reco;
				}
				return prox.info;
			}
		}else {
			return Integer.MAX_VALUE;
		}		
	}
	
	
	
	public static void main (String []args) {
		
		ListaDoble ls = new ListaDoble();
		
		ls.insertarPrimero(20);
		ls.insertarPrimero(30);
		ls.insertarPrimero(55);
		ls.imprimir();
		ls.insertarPrimero(60);
		ls.imprimir();
		ls.insertarFinal(70);
		ls.imprimir();
		ls.imprimirInverso();
		System.out.println("La cantidad es de  : "+ls.cantidad());
		ls.insertar(1,88);
		ls.imprimir();
		ls.insertar(4, 99);
		ls.imprimir();
		ls.extraer(3);
		ls.imprimir();
			
	}
}
