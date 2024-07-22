

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
	
	boolean vacia (){
        if (raiz == null)
            return true;
        else
            return false;
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
	
	public int cantidad() {
        int cant=0;
        Nodo reco=raiz;
        while (reco!=null) {
            cant++;
            reco=reco.sig;
        }
        return cant;
    } 
}
