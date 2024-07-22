import java.util.Scanner;

public class Cuadrante {

	//if  , cuadrantes
	
	
	//atributos
	private int x,y;
	private int cua1=0,cua2=0,cua3=0,cua4=0;
	
	private Scanner scan;
	
	//metodos
	
	private void Iniciar() {
		
		scan = new Scanner(System.in);
		System.out.print("Ingrese valor x : ");
		x = scan.nextInt();
		
		System.out.print("Ingrese valor y : ");
		y = scan.nextInt();
	}
	
	private void Analizar() {
		if (x > 0 && y >0) {
			System.out.println("Primer cuadrante ");
		}else if (x<0 && y>0) {
			System.out.println("Segundo cuadrante ");
		}else if (x<0 && y<0) {
			System.out.println("Tercer cuadrante ");
		}else {
			System.out.println("cuarto cuadrante ");
		}
	}
	
	
	
	//main
	
	public static void main(String [] lccs) {
	
		Cuadrante cua = new Cuadrante();
		cua.Iniciar();
		cua.Analizar();
				
		
	}
}
