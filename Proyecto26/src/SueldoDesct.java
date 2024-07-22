import java.util.Scanner;

public class SueldoDesct {

	
	public static void main(String [] args) {
		
		
		float s,a,ns;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ingrese Sueldo : ");
		s = scan.nextFloat();
		System.out.print("Ingrese Años de trabajo : ");
		a = scan.nextFloat();
		
		if (s <500 && a >10) {
			 ns = (float) (s * 0.2);
			 s = s+ns;
			 System.out.print("Sueldo es : " + s);
		}else {
			if (s <500 && a <10) {
				ns = (float)(s*0.05);
				s = s+ns;
				System.out.println("Sueldo es  : " + s);
			}else {
				if (s >500) {
					System.out.println("Suedlo es  : "+s );
				} 
			}
		}
		
		
		
	}
}
