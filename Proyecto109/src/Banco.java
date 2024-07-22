
public class Banco {

	private Cliente cliente1,cliente2,cliente3;
	
	public Banco() {
		cliente1 = new Cliente("Ana");
		cliente2 = new Cliente("Alice");
		cliente3 = new Cliente("Luisa");
	}
	
	private void operar() {
		cliente1.depositar(200);
		cliente2.depositar(400);
		cliente3.depositar(600);
		
		cliente1.extraer(100);
		cliente2.extraer(150);
		cliente3.extraer(350);
	}
	
	public void depositosTotales() {
		int total = cliente1.reportarMonto()+
					cliente2.reportarMonto()+
					cliente3.reportarMonto();
		System.out.println("Total del dinero en el banco : "+total);
		cliente1.imprimir();
		cliente2.imprimir();
		cliente3.imprimir();
	}
	
	public static void main(String [] args) {
		Banco ban = new Banco();
		ban.operar();
		ban.depositosTotales();
		
		
	}
}
