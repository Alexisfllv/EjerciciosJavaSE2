
public final class Cuadrado {

	private int lado;
	//
	
	
	//
	public void superficie() {
		int a = lado*lado;
		System.out.println("Superficie es : "+a);
		
	}
	
	public Cuadrado(int lado) {
		super();
		this.lado = lado;
	}

	public void perimetro() {
		int p = lado*4;
		System.out.println("Perimetro : "+ p);
	}
	
	//retornar
	
	public int resuper() {
		return lado*lado;
	}
	
	public int rearea() {
		return lado*4;
	}
	
	
	public static void main (String [] args) {
		
		
		//
		Cuadrado cu ;
		cu = new Cuadrado(2);
		cu.superficie();
		cu.perimetro();
		cu =  new Cuadrado(3);
		cu.superficie();
		cu.perimetro();
		
		//
		System.out.println("return");
		System.out.println("Superficie : " + cu.resuper());
		System.out.println("Area : " +  cu.rearea());
		
	}
	
}
