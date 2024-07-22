
public class Club {

	private Socio socio0,socio1,socio2;
	
	public Club() {
		
		socio0 = new Socio();
		socio1 = new Socio();
		socio2 = new Socio();
	}
	
	private void imprimir() {
		int mayor;
		String mayorn;
		if (socio0.retorarAños() >socio1.retorarAños()&& socio0.retorarAños()>socio2.retorarAños()) {
			mayor = socio0.retorarAños();
			mayorn = socio0.retornarNombre();
		}else {
			if (socio1.retorarAños() > socio0.retorarAños()&& socio1.retorarAños()>socio2.retorarAños()) {
				mayor=socio1.retorarAños();
				mayorn = socio1.retornarNombre();
			}else {
				mayor=socio2.retorarAños();
				mayorn = socio2.retornarNombre();
			}
		}
		//
		System.out.println(socio0.retorarAños());
		System.out.println(socio1.retorarAños());
		System.out.println(socio2.retorarAños());
		
		
		System.out.println(mayorn + "  Mayor años : "+mayor);
	}
	
	public static void main(String [] args) {

		
		Club cl = new Club();
		cl.imprimir();
	}
}
