import java.util.Scanner;

public class matriz {
	
	//
	
	private Scanner scan;
	private int[][] combo ;
	
	
	public matriz() {
		scan = new Scanner(System.in);
		
		
		System.out.println("Numero de filas : ");
		int x = scan.nextInt();
		
		System.out.println("Numero de columnas : ");
		int y = scan.nextInt();
		
		//
		combo = new int[x][y];
		
		for (int i = 0; i < x; i++) {
			
			for (int j = 0; j < y; j++) {
				
				System.out.println("Ingrese datos : ");
				combo[i][j] = scan.nextInt();
			}
		}
	}
	
	
	public void listado() {
		
		for (int[] is : combo) {
			for (int i : is) {
				System.out.println(i);
			}
		}
	}
	
	public static void main (String [] args) {
		
		matriz m = new matriz();
		m.listado();
		
	}

}
