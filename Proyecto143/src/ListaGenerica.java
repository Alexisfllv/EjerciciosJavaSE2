
public class ListaGenerica {

	//
	class Nodo {
		int info;
		Nodo sig;
	}

	private Nodo raiz;

	//
	public boolean vacia() {
		return raiz == null;
	}

	public int cantidad() {
		int cant = 0;
		Nodo reco = raiz;
		while (reco != null) {
			cant++;
			reco = reco.sig;
		}

		return cant;
	}

	public void insertar(int pos, int x) {

		if (pos <= cantidad() + 1) {
			Nodo nuevo = new Nodo();
			nuevo.info = x;

			// valor inicial
			if (pos == 1) {
				nuevo.sig = raiz;
				raiz = nuevo;

			} else {
				// valor final
				if (pos == cantidad() + 1) {
					Nodo reco = raiz;
					while (reco.sig != null) {
						reco = reco.sig;
					}
					reco.sig = nuevo;
				} else {

					// valor intermedio
					Nodo reco = raiz;
					for (int i = 1; i < pos - 2; i++) {
						reco = reco.sig;
					}
					Nodo siguiente = reco.sig;
					reco.sig = nuevo;
					nuevo.sig = siguiente;
				}
			}

		}
	}

	public int extraer(int pos) {
		if (pos > cantidad()) {
			return Integer.MAX_VALUE;
		} else {
			if (pos == 1) {
				int informacion = raiz.info;
				raiz = raiz.sig;
				return informacion;
			} else {
				Nodo reco = raiz;
				for (int i = 1; i < pos - 2; i++) {
					reco = reco.sig;
				}
				Nodo prox = reco.sig;
				int informacion = prox.info;
				reco.sig = prox.sig;
				return informacion;
			}
		}
	}

	// borrar

	public void borrar(int pos) {
		if (pos > cantidad()) {
			return;
		} else {
			if (pos == 1) {
				raiz = raiz.sig;
			} else {
				Nodo reco = raiz;
				for (int i = 1; i < pos - 2; i++) {
					reco = reco.sig;
				}
				Nodo prox = reco.sig;
				reco.sig = prox.sig;
			}
		}

	}

	public void imprimir() {
		Nodo reco = raiz;
		while (reco != null) {
			System.out.print(reco.info + "- ");
			reco = reco.sig;
		}
		System.out.println();
	}

	public void intercambiar(int pos1, int pos2) {
		if (pos1 <= cantidad() && pos2 <= cantidad()) {
			Nodo reco1 = raiz;
			for (int i = 1; i < pos1; i++) {
				reco1 = reco1.sig;
			}
			Nodo reco2 = raiz;
			for (int i = 1; i < pos2; i++) {
				reco2 = reco2.sig;
			}
			int aux = reco1.info;
			reco1.info = reco2.info;
			reco2.info = aux;
		}
	}

	public int mayor() {
		if (vacia()) {
			return Integer.MAX_VALUE;
		} else {
			int may = raiz.info;
			Nodo reco = raiz.sig;
			while (reco != null) {
				if (reco.info > may) {
					may = reco.info;
				}
				reco = reco.sig;
			}
			return may;
		}

	}
	
	
	public int posmayor() {
		if (vacia()) {
			return Integer.MAX_VALUE;
		}else {
			int may = raiz.info;
			Nodo reco = raiz.sig;
			int pos=1;
			int c = 1;
			while (reco!= null) {
				c++;
				if (reco.info>may) {
					may = reco.info;
					pos = c;
				}
				reco = reco.sig;
						
			}
			return pos;
		}
	}
	
	public Boolean ordenada() {
		if (cantidad()>1) {
			Nodo reco1 = raiz;
			Nodo reco2 = raiz.sig;
			while (reco2!= null) {
				if (reco2.info<reco1.info) {
					return false;
				}
				reco1 = reco1.sig;
				reco2 = reco2.sig;
			}
		}
		return true;
	}
	
	public Boolean existe(int info) {
		Nodo reco = raiz;
		while (reco!= null) {
			if (reco.info==info) {
				return true;
			}
			reco= reco.sig;
		}
		return false;
	}

	public static void main(String[] argws) {

		ListaGenerica ls = new ListaGenerica();

		if (ls.vacia()) {
			System.out.println("Lista vacia");
		}
		System.out.println("Cantidad de Nodos : " + ls.cantidad());

		//
		ls.insertar(1, 100);
		ls.insertar(2, 200);
		ls.insertar(3, 300);

		ls.imprimir();

		ls.insertar(2, 150);
		ls.imprimir();

		System.out.println("Extraemos  : " + ls.extraer(3));
		ls.imprimir();

		System.out.println("Extraemos  : " + ls.extraer(1));
		ls.imprimir();

		System.out.println("Extraemos  : " + ls.extraer(2));
		ls.imprimir();

		ls.insertar(2, 300);
		ls.insertar(3, 400);
		ls.insertar(4, 500);
		ls.imprimir();

		ls.borrar(2);

		ls.imprimir();

		//ls.intercambiar(1, 3);
		System.out.println("Intercambiamos el primero con el tercero");
		ls.imprimir();
		System.out.println("Valor mayor : " + ls.mayor());
		System.out.println("Posicion mayor : " + ls.posmayor());
		
		if (ls.ordenada()) {
			System.out.println("Si esta ordenada");
		}else {
			System.out.println("No esta ordenada");
		}
		ls.insertar(4, 300);
		int a = 300;
		if (ls.existe(a)) {
			System.out.println("Si existe el valor ; "+a);
		}else {
			System.out.println("No existe el valor ; "+a);
		}
		
		ls.imprimir();

	}

}
