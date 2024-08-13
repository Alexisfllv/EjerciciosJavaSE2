import java.util.Scanner;

public class Dias{
	
	//
	
	private int num [][];
	private int dia [];
	private String nombre[];
	
	private int x,y;
	
	private void Cargar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Arreglo");
		System.out.print("");
		
		
		num = new int [3][];
		nombre = new String[3];
		
		System.out.println("Arreglo ");
		for (int i = 0; i < nombre.length; i++) {
			
			//
			System.out.print("Ingresar Nombre de la Persona : ");
			nombre[i] = scan.next();
			System.out.print("Ingresar Numero de dias que faltara : ");
			x = scan.nextInt();
			num[i] = new int [x];
			
			
			for (int j = 0; j < num[i].length; j++) {
				System.out.println("Ingrese numero del dia : ");
				num[i][j] = scan.nextInt();
			}
			
		}
		
	}
	
	private void mayor() {
		String mayorm=nombre[0];
		int mayor = num[0].length;
		for (int i = 0; i < nombre.length; i++) {
			System.out.println("|" + nombre[i]+" Dias que falto : "+num[i].length);
			
			//comparacion
			
			
			if (num[i].length<mayor) {
				mayor = num[i].length;
				mayorm =nombre[i];
			}
			
		}
		System.out.println("|" + mayorm + " falto "+mayor);
	}
	
	private void imprimir() {
		
	}
	
	public static void main (String [] args) {
		Dias dia = new Dias();
		dia.Cargar();
		dia.mayor();
	}
	
}