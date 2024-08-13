import java.util.Scanner;

public class promedioEdades {

	public static void main (String[] args) {
		
		//Promedio de cada turno
		//Promedio menor
		//50-60-110
		
		int x,y,z;
		int mañana,tarde,noche;
		int sumam=0,sumat=0,suman=0;
		int promediom=0,promediot=0,promedion=0;
		String menor="";
		
		Scanner scan =new Scanner(System.in);
	
		for (int i = 1; i <= 5; i++) {
			System.out.print("Ingrese edad - mañana :");
			mañana = scan.nextInt();
			
			sumam = sumam+mañana;
			
			
		}
		for (int o = 1; o <= 6; o++) {
			System.out.print("Ingrese edad - tarde :");
			tarde = scan.nextInt();
			
			sumat = sumat+tarde;
			
			
		}
		
		for (int u = 1; u <= 11; u++) {
			System.out.print("Ingrese edad - noche :");
			noche = scan.nextInt();
			
			suman = suman+noche;
			
			
		}
		
		//
		promediom = sumam/5;
		promediot = sumat/6;
		promedion = suman/11;
		
		
		//
		if (promediom<promediot) {
			menor = "Mañana";
		}else if (promedion <promediom) {
			menor = "Noche";
		}else {
			menor = "Tarde";
		}
		
		System.out.println("Promedios mañana  : "+promediom);
		System.out.println("Promedios tarde  : "+promediot);
		System.out.println("Promedios noche  : "+promedion);
		
		//menor
		
		System.out.println("Promedio menor  : "+menor);
	}
}
