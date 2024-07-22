package anomy;

public class PruebaClaseAnonima {
	
	//
	abstract class A {
		public abstract void imprimir();
	}
	
	//
	interface B{
		
	}
	
	public void probar() {
		//
		(new A() {
			public void imprimir() {
				System.out.println("Clase");
			}
		}).imprimir();
		
		
		//
		(new B() {
			public void imprimir() {
				System.out.println("Interface");
			}
		}).imprimir();
	}
	
	//
	public static void main (String [] args) {
		PruebaClaseAnonima an = new PruebaClaseAnonima();
		an.probar();
	}

}
