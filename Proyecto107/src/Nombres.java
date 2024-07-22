import java.util.Scanner;

public class Nombres {

	
	private String nombres[];
	private String email[];
	
	Scanner scan ;
	
	private Nombres() {
		scan = new Scanner(System.in);
		nombres = new String[5];
		email = new String[5];
		System.out.println("Nombres y Correos ");
		for (int i = 0; i < email.length; i++) {
			System.out.print("Ingrese Nombre : ");
			nombres[i]= scan.next();
			System.out.println("Ingrese Correo : ");
			email[i]=scan.next();
		}
	}
	
	//listado
	private void Listar() {
		for (int i = 0; i < email.length; i++) {
			System.out.println("Nombres : " + nombres[i]+" y " + "Correos : " + email[i]);
		}
	}
	
	
	//consulta
	private void Consultas() {
		String aux;
		System.out.println("Consulta de email: ");
		System.out.print("Ingrese email : ");
		aux = scan.next();
		boolean x= false;
		for (int i = 0; i < nombres.length; i++) {
			if (aux.equals(nombres[i])) {
				System.out.println("Mail de la Persona : " +email[i] );
				x = true;
			}
		}
		if (x == false) {
			
			System.out.println("email no existe: ");
		}else {
			System.out.println("email si existe: ");
		}
	}
	
	
	
	
	
	//email sin @
	private void Filtro() {
		
		System.out.println("Email sin Arroba ");
		for (int i = 0; i < email.length; i++) {
			if (email[i].indexOf("@")==-1) {
				System.out.println(email[i] + " No tiene Arroba");
			}
		}	
	}
	
	public static void main(String [] args) {
		Nombres nom = new Nombres();
		nom.Listar();
		nom.Consultas();
		nom.Filtro();
	}
}
