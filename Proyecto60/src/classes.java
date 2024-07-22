import java.util.Scanner;

public class classes {

	//
	 private String nombre;
	 private int edad;
	 private Scanner scan;
	
	 
	 public void iniciar() {
		 scan = new Scanner(System.in);
		 System.out.print("Ingresa nombre : ");
		 nombre = scan.next();
		 
		 System.out.print("Ingresa edad : ");
		 edad = scan.nextInt();
	 }
	 
	
	//cargar
	 public void imprimir() {
		 System.out.println(nombre);
		 System.out.println(edad);
	 }
	
	
	public void mayor() {
		if (edad>18) {
			System.out.println("Es mayor de edad");
		}else {
			System.out.println("Es menor de edad");
		}
	}
	 
	 
	public static void main(String [] lccs) {
		
		//dec
		classes c1 = new classes(); 
		
		c1.iniciar();
		c1.imprimir();
		c1.mayor();
		
		//Iniciar
		
		
		//imprimir
		
		
	}
}
