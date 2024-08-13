import java.util.Scanner;

public class Compra {

	
	public static void main(String [] args) {
		
		float precioArticulo,cantidad,importe;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese valor del Articulo : ");
		precioArticulo = scan.nextFloat();
		System.out.print("Ingrese cantidad del Articulo : ");
		cantidad = scan.nextFloat();
		
		//valor : 
		importe = precioArticulo * cantidad;
		
		System.out.println("Valor a pagar : " + importe);
		
 		
		
	}
}
