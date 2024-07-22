
public class PruebaMes {

	//
	
	
	
	public static void main (String []args) {
	
		Mes ms = Mes.ABRIL;
		System.out.println(ms.toString().toLowerCase() + " y su numero es :  " + ms.retornarNumero());
		
		
		//arreglo
		
		
		Mes[] meses = Mes.values();
		
		
		// foreach
		
		System.out.println("FOREACH");
		for (Mes mes : meses) {
			
			System.out.println(mes + " " + mes.retornarNumero());
			//mes.imprimir();
		}
		
		//fortrad
		
		System.out.println("FOR");
		for (int i = 0; i < meses.length; i++) {
			System.out.println(meses[i] + " Numero de mes es : " + meses[i].retornarNumero());
		}
		
		//FOREACH.2
		
		System.out.println("FOREACH.2");
		for (Mes mes2 : Mes.values()) {
			System.out.println(mes2 + " "+mes2.retornarNumero());
		}
		
	
	}
}
