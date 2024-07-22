import java.util.Scanner;

public class sumaprom {

	public static void main (String [] args) {
		
		//
		//
		//
		//
		float x=0,y;
		float suma =0,promedio=0,num=0;
		float cont =0;
		Scanner scan = new Scanner(System.in);
		
		
		
		
		do {
			
			System.out.println("Ingresar nota || (0) = finalizar : ");
			num = scan.nextInt();
			
			if (num !=0) {
				
				suma = suma +num;
				cont++;
			}
			
			
			
		} while (num !=0);		
		//
		
		if (cont!=0) {
			promedio = suma /cont;
			System.out.println("Promedio: "+promedio);
		}else {
			System.out.println("No se ingresarion valores : " + promedio);
		}
		
		
		
	}
}
