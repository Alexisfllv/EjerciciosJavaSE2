import java.util.Scanner;

public class Cuadrado {

	//cuadrado = pe,a;
	//atributos
	int l;
	int pe=0,su=0;
	Scanner scan;
	
	//metodos
	
	private void Iniciar() {
		
		//
		scan= new Scanner(System.in);
		
		System.out.print("Ingresar lado : ");
		l = scan.nextInt();
	}
	
	private void Hallar() {
		pe = l*4;
		su = l*l;
	}
	
	private void Imprimir() {
		System.out.println("Perimetro : " + pe);
		System.out.println("Supericie : " + su);
	}
	
	//main
	
	public static void main(String [] lccs) {
		
		
		//
		
		Cuadrado cua = new Cuadrado();
		cua.Iniciar();
		cua.Hallar();
		cua.Imprimir();
	}
}
