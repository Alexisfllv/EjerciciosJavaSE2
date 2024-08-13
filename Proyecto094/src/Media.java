import java.util.Scanner;

public class Media {

	private String paises[];
	private int mediatemp[];
	private int temp[][];
	
	private void Cargar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Medias Temperatura : ");
		
		paises = new String[4];
		temp = new int[4][3];
		for (int i = 0; i < paises.length; i++) {
			//
			System.out.print("Ingresar Nombre de Paise : ");
			paises[i] =scan.next();
			for (int j = 0; j < temp[i].length; j++) {
				System.out.print("Ingresar Temperaturas : ");
				temp[i][j] = scan.nextInt();
			}
		}
	}
	
	//
	private void Promedio() {
		mediatemp = new int[4];
		int promedio = 0;
		int suma=0;
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[i].length; j++) {
				suma = suma + temp[i][j];
				
			}
			mediatemp[i] = suma/temp[i].length;
			System.out.println("Promedio : "+mediatemp[i]);
			suma=0;
			
		}
	}
	
	private void Imprimir() {
		for (int i = 0; i < mediatemp.length; i++) {
			System.out.println(": " +paises[i]+ " - " + mediatemp[i] );
		}
	}
	
	private void PaisMayor() {
		
		int mayor = mediatemp[0];
		String nom = "";
		for (int i = 0; i < mediatemp.length; i++) {
			if (mediatemp[i]>mayor) {
				mayor = mediatemp[i];
				nom = paises[i];
			}
			
		}
		System.out.println("Pais : "+ nom+" con el Mayor promedio : "+mayor);
	}
	public static void main(String [] args) {
		Media med  = new Media();
		med.Cargar();
		med.Promedio();
		med.Imprimir();
		med.PaisMayor();
	}
}
