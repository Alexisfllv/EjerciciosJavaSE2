
public class Arbol {

	
	//
	
	class Nodo{
		int info;
		Nodo izq,der;
	}
	
	private Nodo raiz;
	
	
	//
	public void insertar(int x) {
		Nodo nuevo = new Nodo();
		nuevo.info = x;
		if (raiz == null) {
			raiz = nuevo;
		}else {
			Nodo anterior = null;
			Nodo reco = raiz;
			while (reco!= null) {
				anterior = reco;
				if (x < reco.info) {
					reco  = reco.izq;
				}else {
					reco = reco.der;
				}
			}
			
			if (x < anterior.info) {
				anterior.izq=nuevo;
			}else {
				anterior.der=nuevo;
			}
		}
	}
	
	//pre Orden
	private void recorrerPre(Nodo reco) {
		if (reco!= null) {
			System.out.print(reco.info + " - ");
			recorrerPre(reco.izq);
			recorrerPre(reco.der);
		}
	}
	
	public void recorrerPre() {
		recorrerPre(raiz);
		System.out.println();
	}
	
	
	//Entre Orden
	
	private void recorrerEntre(Nodo reco) {
		if (reco != null) {
			recorrerEntre(reco.izq);
			System.out.print(reco.info + " - ");
			recorrerEntre(reco.der);
		}
	}
	
	public void recorrerEntre() {
		recorrerEntre(raiz);
		System.out.println();
	
	}
	
	//Post Orden
	
	private void recorrerPost(Nodo reco) {
		if (reco!= null) {
			recorrerPost(reco.izq);
			recorrerPost(reco.der);
			System.out.print(reco.info+" - ");
		}
	}
	
	public void recorrerPost() {
		recorrerPost(raiz);
		
		
	}
	
	//
	public void imprimir() {
		
	}
	
	
	public static void main(String [] args) {
		Arbol ar = new Arbol();
		ar.insertar(400);
		ar.insertar(100);
		ar.insertar(200);
		ar.insertar(700);
		ar.insertar(50);
		ar.insertar(75);
		ar.insertar(850);
		ar.insertar(566);
		ar.insertar(4);
		
		
		
		ar.recorrerPre();
		ar.recorrerEntre();
		ar.recorrerPost();
	}
}
