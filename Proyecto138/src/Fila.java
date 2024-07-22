
public class Fila {
	
	
	//definicion
	class Nodo{
		int info;
		Nodo siguiente;
	}
	
	// valor 0 de la fila
	private Nodo raiz;
	
	//constructor
	public Fila() {
		raiz = null;
	}
	
	//Metodo de insertar un nuevo dato;
	
	public void insertar(int x) {
		Nodo nuevo = new Nodo();
		nuevo.info = x;
		
		//
		if (raiz == null ) {
			raiz = nuevo; // | |-|x|
			nuevo.siguiente=null; // |x|-|*|
		}else {
			nuevo.siguiente=raiz;
			raiz = nuevo;
		}
	}	
	
	//Mostrar datos fila
	
	public void imprimir() {
		Nodo reco= raiz;
		
		while (reco != null) {
			System.out.print(reco.info+" - ");
			reco =reco.siguiente;
		}
		System.out.println();
	}
	
	
	
	public static void main(String [] args) {
		Fila fil = new Fila();
		fil.insertar(5);
		
		fil.imprimir();
	}

}
