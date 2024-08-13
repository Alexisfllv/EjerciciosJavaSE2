import java.awt.datatransfer.SystemFlavorMap;
import java.util.Iterator;
import java.util.Scanner;

public class Vector {

	
	private int x,y;
	private int carros[];
	private int lista[];
	
	public void Inicio() {
		
		
		carros = new int[5];
		Scanner scan = new Scanner(System.in);	
		for (int i = 0;i<5; i++) {
			System.out.print("Ingrese valores  : "+i +" : ");
			carros[i] = scan.nextInt();
			
			
		
		}
		
	}
	
	public void Mostrar() {
	
		for (int i = 0; i < 5; i++) {
			System.out.println("Valores : " + carros[i]);
			
		}
	}
	
	
	public static void main(String [] aergs) {
		
		//
		
		Vector in = new Vector();
		in.Inicio();
		in.Mostrar();
	}
}
