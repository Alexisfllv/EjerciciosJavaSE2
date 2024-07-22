
public class dia {
	
	public static void main(String [] args) {
		//
		String[] dia = {"lunes","miercoles","sabado", "domingo"};
		int libre=0;
		int nolibre=0;
		
		for (int i = 0; i < dia.length; i++) {
			//
			switch (dia[i]) {
			case "lunes":
			case "martes":
			case "miercoles":
			case "jueves":
			case "viernes":
				nolibre++;
				break;
			case "sabado":
			case "domingo":
				libre++;
				break;

			default:
				break;
			}
		}
		System.out.println("////////////////////");
		System.out.println("no libres : " + nolibre);
		System.out.println("libres : " + libre);
		
	}

}
