
public class Cola {
	
	class Nodo{
		int info;
		Nodo sig;
	}
	
	private Nodo raiz,fondo;
	
	public Cola() {
		raiz = null;
		fondo = null;
	}
	
	void insertar(int x) {
		Nodo nuevo = new Nodo();
		nuevo.info=x;
		
		if (raiz==null) {
			raiz=nuevo;
			fondo = nuevo;
		}else {
			fondo.sig=nuevo;
			fondo=nuevo;
		}
	}
	
	void imprimir() {
		Nodo reco=raiz;
		while (reco!=null) {
			System.out.print(reco.info+" - ");
			reco = reco.sig;
		}
		System.out.println();
	}
	
	int extraer() {
		if (raiz==null) {
			return Integer.MAX_VALUE;
			
		}else {
			int informacion = raiz.info;
			if (raiz==fondo) {
				raiz=null;
				fondo = null;
			}else {
				raiz =raiz.sig;
			}
			return informacion;
		}
	}
	
	
	
	public static void main (String [] args) {
		
		Cola col = new Cola();
		
		col.insertar(10);
		col.insertar(30);
		col.imprimir();
		col.insertar(40);
		col.imprimir();
		System.out.println("Extraemos un elemento : "+col.extraer());
		col.imprimir();
		
	}

}
