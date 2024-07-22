
public class arbol {

	//
	class Nodo {
		int info;
		Nodo izq, der;
	}

	//
	private Nodo raiz;
	private int cantidad;
	private int altura;

	public boolean existe(int x) {
		Nodo reco = raiz;
		while (reco != null) {
			if (x == reco.info) {
				return true;

			} else {
				if (x > reco.info) {
					reco = reco.der;
				} else {
					reco = reco.izq;
				}

			}
		}
		return false;
	}

	// metodo insertar

	public void insertar(int x) {
		if (!existe(x)) {
			Nodo nuevo = new Nodo();
			nuevo.info = x;
			if (raiz == null) {
				raiz = nuevo;
			} else {
				Nodo anterior = null;
				Nodo reco = raiz;
				while (reco != null) {
					anterior = reco;
					if (x > reco.info) {
						reco = reco.der;
					} else {
						reco = reco.izq;
					}
				}
				if (x > anterior.info) {
					anterior.der = nuevo;
				} else {
					anterior.izq = nuevo;
				}
			}
		}
	}

	private void recorrerEntre(Nodo reco) {
		if (reco != null) {
			recorrerEntre(reco.izq);
			System.out.print(reco.info + "-");
			recorrerEntre(reco.der);
		}
	}

	public void recorrerEntre() {
		recorrerEntre(raiz);
		System.out.println();
	}

	// Retonar cantida de nodos

	public void retornarCantidad(Nodo reco) {

		if (reco != null) {
			cantidad++;
			retornarCantidad(reco.izq);
			retornarCantidad(reco.der);
		}
	}

	public int retornarCantidad() {
		cantidad = 0;
		retornarCantidad(raiz);
		return cantidad;
	}

	// retornar cantidad de nodos hojas

	private void cantidadNodosHojas(Nodo reco) {
		if (reco != null) {
			if (reco.izq == null && reco.der == null) {
				cantidad++;
			}
			cantidadNodosHojas(reco.izq);
			cantidadNodosHojas(reco.der);
		}
	}

	public int cantidadNodosHojas() {
		cantidad = 0;
		cantidadNodosHojas(raiz);
		return cantidad;
	}

	// imprimir entre orden:

	public void imprimirEntreConNivel(Nodo reco, int nivel) {
		if (reco != null) {

			imprimirEntreConNivel(reco.izq, nivel + 1);
			System.out.print(reco.info + "(" + nivel + ") - ");
			imprimirEntreConNivel(reco.der, nivel + 1);
		}
	}

	public void imprimirEntreConNivel() {
		imprimirEntreConNivel(raiz, 1);
		System.out.println();
	}

	// RetornarAlturadeunArbol

	private void retornarAltura(Nodo reco, int nivel) {
		if (reco != null) {
			if (nivel > altura) {
				altura = nivel;
			}
			retornarAltura(reco.izq, nivel + 1);
			retornarAltura(reco.der, nivel + 1);
		}
	}

	public int retornarAltura() {
		altura = 0;
		retornarAltura(raiz, 1);
		return altura;
	}

	// imprimir mayor valor del arbol

	public void imprimirMayorValor() {
		if (raiz != null) {
			Nodo reco = raiz;
			while (reco.der != null) {
				reco = reco.der;
			}
			System.out.println("Mayor del arbol : " + reco.info);
		}
	}

	// imprimir menor valor del arbol

	public void imprimirMenorValor() {
		if (raiz != null) {
			Nodo reco = raiz;
			while (reco.izq != null) {
				reco = reco.izq;
			}
			System.out.println("Menor del arbol : " + reco.info);
		}
	}

	// Borrar menor

	public void borrarMenorValor() {
		if (raiz != null) {
			if (raiz.izq != null) {
				raiz= raiz.der;
			}else {
				Nodo atras  = raiz;
				Nodo reco =raiz.izq;
				while (reco.izq !=null) {
					atras = reco;
					reco = reco.izq;
				}
				atras.izq = reco.der;
			}
		}
	}

	public static void main(String[] args) {
		//
		arbol ar = new arbol();
		ar.insertar(20);
		ar.insertar(30);
		ar.insertar(40);
		ar.insertar(50);
		ar.insertar(10);
		ar.insertar(10);
		ar.recorrerEntre();
		System.out.println("1 : Cantidad de Nodos : " + ar.retornarCantidad());
		System.out.println("2 : Cantidad de Nodos Hojas : " + ar.cantidadNodosHojas());
		ar.imprimirEntreConNivel();
		System.out.println("La Altura del arbol es : " + ar.retornarAltura());
		ar.imprimirMayorValor();
		ar.imprimirMenorValor();
		ar.borrarMenorValor();
		ar.recorrerEntre();
	}
}
