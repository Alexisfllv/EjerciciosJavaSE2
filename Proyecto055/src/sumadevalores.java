import java.util.Scanner;

public class sumadevalores {

	public static void main(String[] args) {
		
		//
		int x,y;
		int suma=0,val=0;
		String mensaje="";
		
		Scanner scan = new Scanner(System.in);
		
		
		do {
			
			System.out.print("Ingresar valores a sumar : ");
			x = scan.nextInt();
			if (x!=9999) {
				suma = suma +x;

			}
			
		} while (x!=9999);
		
		if (suma ==0) {
			mensaje = "Valor es cero";
		}else {
			if (suma >0) {
				mensaje = "Valor mayor a cero";
			}else {
				mensaje = "Valor es negativo";
			}
		}
		
		System.out.println("Suma  : " + suma);
		System.out.println("Estado : "+mensaje);
	}
}
