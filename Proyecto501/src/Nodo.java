public class M {
    public int valor;
    public Nodo izquierdo, derecho;
    
    public Nodo(int valor) {
        this.valor = valor;
        izquierdo = null;
        derecho = null;
    }


    public Nodo raiz;
    

    
    public void insertar(int valor) {
        raiz = insertar(raiz, valor);
    }
    
    private Nodo insertar(Nodo nodo, int valor) {
        if (nodo == null) {
            nodo = new Nodo(valor);
        }
        else if (valor > nodo.valor) {
            nodo.izquierdo = insertar(nodo.izquierdo, valor);
        }
        else if (valor < nodo.valor) {
            nodo.derecho = insertar(nodo.derecho, valor);
        }
        return nodo;
    }
    
    public void preOrden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            preOrden(nodo.izquierdo);
            preOrden(nodo.derecho);
        }
    }
    
    public void inOrden(Nodo nodo) {
        if (nodo != null) {
            inOrden(nodo.derecho);
            System.out.print(nodo.valor + " ");
            inOrden(nodo.izquierdo);
        }
    }
    
    public void postOrden(Nodo nodo) {
        if (nodo != null) {
            postOrden(nodo.izquierdo);
            postOrden(nodo.derecho);
            System.out.print(nodo.valor + " ");
        }
    }
    
    //
    public static void main(String[] args) {
        Nodo arbol = new Nodo();
        
        arbol.insertar(9);
        arbol.insertar(7);
        arbol.insertar(5);
        arbol.insertar(4);
        arbol.insertar(3);
        arbol.insertar(2);
        arbol.insertar(1);
        
        System.out.print("Recorrido preorden: ");
        arbol.preOrden(arbol.raiz);
        System.out.println();
        
        System.out.print("Recorrido inorden: ");
        arbol.inOrden(arbol.raiz);
        System.out.println();
        
        System.out.print("Recorrido postorden: ");
        arbol.postOrden(arbol.raiz);
        System.out.println();
    }

}