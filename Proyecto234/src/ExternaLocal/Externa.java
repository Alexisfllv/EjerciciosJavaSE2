package ExternaLocal;

public class Externa {

	
	int at = 10;
	
	public void imprimir(String parametro) {
		System.out.println("Comienzo de la clase Externa 1 ");
		
		int variablelocal = 4;
		
		//
		class Local{
			public void imrpimir() {
				System.out.println("Metodo imprimir clase Local 2");
				System.out.println(at);
				System.out.println(parametro);
				System.out.println(variablelocal);
			}
		}
		
		//
		Local lo = new Local();
		lo.imrpimir();
		System.out.println("Fin del metodo imprimir de la clase Externa 3");
	}
	
	//
	public static void main (String [] args) {
		Externa ex = new Externa();
		ex.imprimir("Prueba");
	}
}
