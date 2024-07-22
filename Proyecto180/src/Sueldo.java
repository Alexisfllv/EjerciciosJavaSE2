import java.util.Scanner;

public class Sueldo {
	
	//
	private Scanner scan;
	private int[] sueldos;
	
	//
	public Sueldo() {
		scan = new Scanner(System.in);
		System.out.println("Cuantos sueldos cargara : ");
		int cant = scan.nextInt();
		sueldos =  new int [cant];
		
		for (int i = 0; i < sueldos.length; i++) {
			System.out.println("Ingrese sueldos : ");
			sueldos[i] = scan.nextInt();
			
		}
	}
	
	
	
	//
	public void imprimir() {
		System.out.println("//////");
		for (int i : sueldos) {
			System.out.println(i);
		}
	}
	
	//
	public void imprimirMayor() {
		int mayor = sueldos[0];
		for (int i : sueldos) {
			if (i>mayor) {
				mayor=i;
			}
		}
		System.out.println("Mayor :" + mayor);
	}
	
	
	public static void main (String [] args) {
		
		Sueldo su = new Sueldo();
		su.imprimir();
		su.imprimirMayor();
		
		
	}

}
