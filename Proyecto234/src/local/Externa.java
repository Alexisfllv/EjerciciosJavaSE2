package local;

public class Externa {
	
	
	public void  imprimir() {
		System.out.println("Comienzo del metodo imprimir de la clase Externa ");
		
		
		//
		class Local{
			public void imprimire() {
				System.out.println("Metodo imprimir clase Local");
			}
		}
		
		Local lo = new Local();
		lo.imprimire();
		System.out.println("Fin  del metodo imprimir de la clase Externa");
	}
	
	public static void main (String [] args) {
		//
		Externa ex = new Externa();
		ex.imprimir();
	}
	

}
