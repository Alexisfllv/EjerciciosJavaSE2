
public class Cola extends Lista{

	@Override
	public void insertar(int x) {
		Nodo nuevo = new Nodo();
		nuevo.info = x;
		if (raiz == null) {
			nuevo.sig = raiz;
			raiz = nuevo;
		}else {
			
			
			Nodo reco = raiz;
			while (reco.sig != null) 
				reco = reco.sig;
				reco.sig = nuevo;
			
			
		}
		
	}
	

	@Override
	public int extraer(int x) {
		//
		if (raiz == null) {
			return Integer.MAX_VALUE;
		}else {
			int valor = raiz.info;
			raiz = raiz.sig;
			return valor;
		}
	}
	
	
	public static void main (String []ats) {
		//
		Cola co = new Cola();
		co.insertar(220);
		co.insertar(200);
		co.insertar(2);
		co.insertar(400);
		co.imprimir();
		
	}

}
