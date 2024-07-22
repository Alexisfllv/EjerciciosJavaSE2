package al;

public class PruebaClaseInterna {

	
		
	public static void main (String [] args) {
		//
		 
		Externa ex = new Externa();
		Externa.Interna in = ex.new Interna(); 
		
		ex.imprimir();
		in.imprimir();
		//
		
	}
}
