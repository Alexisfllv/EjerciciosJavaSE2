import java.util.Scanner;

public class MayoresEdad {

	//Mayores de edad
	// 5 >18
	
	private int edad[];
	private String nombres[];
	
	private int mayor=0;
	
	private void Cargar() {
		
		edad= new int[4];
		nombres=new String[4];
		
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.print("Ingresa Nombres : ");
			nombres[i] = scan.next();
			System.out.print("Ingresa Edad : ");
			edad[i] = scan.nextInt();
			
			
			
		}
	}
	
	private void Filtro() {
		
		for (int i = 0; i < 4; i++) {
			
			if (edad[i] >=18) {
				System.out.println("Es mayor de edad : "+nombres[i]);
			}else {
				System.out.println("Es menor de edad : "+nombres[i]);
			}
		}
	}
	
	public static void main(String [] args) {
		
		
		MayoresEdad may = new MayoresEdad();
		may.Cargar();
		may.Filtro();
	}
	
}
