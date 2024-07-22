import java.util.Scanner;

public class Coodenadas {

	
	public static void main(String [] args) {
		//
		int x , y;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese coordenada x : ");
		x = scan.nextInt();
		
		System.out.print("Ingrese coordenada y : ");
		y = scan.nextInt();
		
		if (x > 0 && y > 0) {
			System.out.println("Valor pertenece al primer cuadrante");
		}else {
			if (x <0 && y >0) {
				System.out.println("Valor pertenece al segundo cuadrante");
			}else {
				if (x<0 && y <0) {
					System.out.println("Valor pertenece al tercer cuadrante");
				}else {
					if (x >0 && y<0) {
						System.out.println("Valor pertenece al cuarto cuadrante");
					}else {
						System.out.println("Sobre un eje");
					}
				}
			}
		}
		
	}
}
