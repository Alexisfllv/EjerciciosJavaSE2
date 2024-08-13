import java.util.Scanner;

public class kg {

	
	public static void main(String [] args) {
		
		//
		
		float x,y;
		int suma=0,cant1=0,cant2=0,cant3=0,val=0;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			
			System.out.print("Ingrese pesos : ");
			x =scan.nextFloat();
			
			if (x !=0) {
				
				if (x >= 9.8 && x <=10.2) {
					cant1++;
				}else {
					if (x >10.2) {
						
						cant2++;
					}else {
						if (x<9.8) {
							cant3++;
						}
					}
				}
			}
			
			
			
			
		} while (x !=0);
		
		//suma de cantidad
		
		suma = cant1+cant2+cant3;
		
		System.out.println("de 9.8 - 10.2 : "+cant1);
		System.out.println("de mayores - 10.2 : "+cant2);
		System.out.println("de meonres - 9.8 : "+cant3);
		System.out.println("suma de piezas  : " + suma);
		//
	}
}
