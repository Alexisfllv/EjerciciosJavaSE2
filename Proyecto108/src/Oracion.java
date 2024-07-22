import java.util.Scanner;

public class Oracion {

	Scanner scan = new Scanner(System.in);
	
	
	
	private void Oracion(String text) {
		char x ;
		for (int i = 0; i < text.length(); i++) {
			//
			x = text.charAt(i);
			if (x == ' ') {
				System.out.print("");
				System.out.println();
			}else {
				System.out.print(x);
			}
		}
	}
	
	public static void main(String[] args) {
			Oracion or = new Oracion();
			or.Oracion("Alexis come pollo como loco");
	}
}
