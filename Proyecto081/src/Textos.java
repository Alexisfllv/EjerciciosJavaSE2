import java.util.Scanner;

public class Textos {

	
	
	private String paises[];
	private int x,y;
	
	
	public void Cargar() {
		
		paises = new String[5];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < paises.length; i++) {
			System.out.print("Ingrese paises : ");
			paises[i] = scan.next();
			
			
		}
	}
	
	public void Ordenar() {
		String aux="";
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (paises[j].compareTo(paises[j+1])>0) {
					aux = paises[j];
					paises[j] = paises[j+1];
					paises[j+1]=aux;
					
				}
			}
		}
	}
	
	//
	
	public void Imprimir() {
		System.out.println("Textos Ordenados : ");
		for (int j = 0; j < paises.length; j++) {
			System.out.println(paises[j]);
		}
		
	}
	public static void main(String [] args) {
		
		Textos tex = new Textos();
		tex.Cargar();
		tex.Ordenar();
		tex.Imprimir();
	}
}
