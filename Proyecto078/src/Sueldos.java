import java.util.Scanner;

public class Sueldos {

	//sueldo del trabajador menor
	
	private int sueldo[];
	private String trabajador[];
	
	private int sum=0;
	
	private void Cargar() {
		
		sueldo = new int[4];
		trabajador = new String[4];
		
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.print("Ingresar Trabajador : ");
			trabajador[i] = scan.next();
			
			System.out.print("Ingresar Sueldo : ");
			sueldo[i] = scan.nextInt();
		}
		
	}
	
	
	private void Menor() {
		int menor=0;
		String nom="";
		
		menor = sueldo[0];
		nom = trabajador[0];
		for (int i = 0; i < 4; i++) {	
			if (sueldo[i] <=menor)  {
				menor=sueldo[i];
				
				nom = trabajador[i];
				
			}
			
			
		}
		System.out.println("Sueldo menor es  :" + menor);
		System.out.println("Nombre trabajador   :" + nom);
		
		
	}
	
	public static void main(String[] lccs) {
		//
		Sueldos sue = new Sueldos();
		sue.Cargar();
		sue.Menor();
	}
}
