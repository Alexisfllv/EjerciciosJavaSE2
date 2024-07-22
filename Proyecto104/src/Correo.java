import java.util.Scanner;

public class Correo {

	private int x,y;
	private String dep;
	Scanner scan ;
	
	private Correo() {
		scan = new Scanner(System.in);
		System.out.print("Ingrese texto : ");
		dep = scan.next();
	}
	
	private void Mostrar() {
		boolean tiene = false;
		for (int i = 0; i < dep.length(); i++) {
			if (dep.charAt(i)=='@') {
				tiene = true;
			}
		}
		if (tiene == true) {
			System.out.println(dep+ "  tiene "+tiene);
		}else {
			System.out.println(dep+" no tiene "+tiene);
		}
	}
	
	private void Mostrar2() {
		if (dep.indexOf("@")== -1) {
			System.out.println("No se encontró el @");
		}else {
			System.out.println("Si se encontró el @");
		}
	}
	
	public static void main(String [] args) {
		Correo cor = new Correo();
		cor.Mostrar();
		cor.Mostrar2();
	}
	
}
