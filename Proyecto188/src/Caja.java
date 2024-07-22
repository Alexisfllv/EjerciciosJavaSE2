
public class Caja {
	
	private final String documento;
	private float monto;
	
	public Caja(String documento,float monto) {
		this.documento = documento;
		this.monto = monto;
	}
	
	public Caja(String documento) {
		this.documento =  documento;
	}
	
	public void imrprimir() {
		System.out.println("Documento : " + "documento" + "Saldo : " +monto );
	}
	
	public static void main (String [] args) {
		Caja caj = new Caja("dni", 234324);
		
		Caja caj2 = new Caja("Lem");
		
		
		
		caj.imrprimir();
		caj2.imrprimir();
	}

}
