

public class Cadenas {

	private String text;
	
	
	private void Alop (String nom) {
		String mitad = nom.substring(0,nom.length()/2);
		System.out.println("La mitad  :" + mitad);
	}
	
	private void Blop (String nom) {
		//char x = nom.charAt(nom.length()-1);
		System.out.println(nom.charAt(nom.length()-1));
	}
	
	private void Clop (String nom) {
		for (int i = nom.length()-1; i >=0; i--) {
			System.out.print(nom.charAt(i));
		}
		System.out.println();
	}
	
	private void Dlop (String nom) {
		for (int i = 0; i < nom.length(); i++) {
			System.out.print(nom.charAt(i)+"-");
		}
		System.out.println();
	}
	
	private void Elop (String nom) {
		int can =0;
		for (int i = 0; i < nom.length(); i++) {
			if (nom.charAt(i)=='a'||nom.charAt(i)=='A'||
				nom.charAt(i)=='e'||nom.charAt(i)=='E'||
				nom.charAt(i)=='i'||nom.charAt(i)=='I'||
				nom.charAt(i)=='o'||nom.charAt(i)=='O'||
				nom.charAt(i)=='u'||nom.charAt(i)=='U') 
			{
				can = can+1;
			}
		}
		System.out.println("Cantidad vocales : "+can);
	}
	
	private void Flop(String nom) {
		int can = 0;
		for (int i = 0; i < nom.length()/2; i++) {
			if (nom.charAt(i)==nom.charAt(nom.length()-1-i)) {
				can++;
			}
		}
		if (can== nom.length()/2) {
			System.out.println("Es capicua la cadena "+nom);
		}else {
			System.out.println("No es capicua la cadena "+nom);
		}
	}
	
	public static void main(String [] args) {
			//	
		Cadenas cad = new Cadenas();
		//Metodos de (String) (int);
		cad.Alop("Alexis");
		cad.Blop("Deadmautres");
		cad.Clop("Alexiis");
		cad.Dlop("Avion");
		cad.Elop("alexuss");
		cad.Flop("AleelA");
	}
	
}
