import java.util.Scanner;

public class cuadrantes {

	public static void main(String [] args) {
		
		//
		int x,y;
		int number;
		int cont1=0,cont2=0,cont3=0,cont4=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ingresa cantidad de puntos : ");
		number = scan.nextInt();
		
		for (int i = 1; i <= number; i++) {

			System.out.print("Ingresa coordenada a : ");
			x = scan.nextInt();
			
			System.out.print("Ingresa coordenada b : ");
			y = scan.nextInt();
			
			if (x>0 && y>0) {
			
				cont1++;
			}
			
			if (x<0 && y>0) {
				
				cont2++;
			}
			
			if (x<0 && y<0) {
				
				cont3++;
			}
			
			if (x>0 && y<0) {
				
				cont4++;
			}
			
			
		}
		
		System.out.println("Cantidad de Cuadrantes 1 : " +cont1);
		System.out.println("Cantidad de Cuadrantes 2 : " +cont2);
		System.out.println("Cantidad de Cuadrantes 3 : " +cont3);
		System.out.println("Cantidad de Cuadrantes 4 : " +cont4);
	}
}
