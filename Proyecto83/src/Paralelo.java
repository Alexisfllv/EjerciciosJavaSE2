import java.util.Scanner;

public class Paralelo {

	//
	
	private int nota[];
	private String alu[];
	
	private int x,y;
	
	public void Cargar() {
		
		nota = new int[5];
		alu = new String[5];
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingreso de notas");
		for (int i = 0; i < alu.length; i++) {
			System.out.print("Alumno : ");
			alu[i] = scan.next();
			System.out.print("Nota : ");
			nota[i] = scan.nextInt();
		}
	}
	
	public void Ordernar() {
		
		int auxn = 0;
		String auxa ="";
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (nota[j] > nota[j+1]) {
					auxn = nota[j];
					nota[j] = nota[j+1];
					nota[j+1] = auxn;
					//
					auxa = alu[j];
					alu[j] = alu[j+1];
					alu[j+1] = auxa;
				}
				
				
			}
		}
	}
	
	public void Imprimir() {
		System.out.println("ORDENAMIENTO");
		for (int i = 0; i < alu.length; i++) {
			System.out.println(nota[i] +" - "+ alu[i]);
		}
	}
	
	public static void main(String [] args) {
		Paralelo par = new Paralelo();
		par.Cargar();
		par.Ordernar();
		par.Imprimir();
	}
}
