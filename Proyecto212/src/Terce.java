
public class Terce {

	
	
	public static void main (String [] args) {
		
		//tradicional if
		
		int edad = 10;
		
		if (edad >18) {
			System.out.println("Eres mayor de edad ");
		}else {
			System.out.println("Eres menor de edad");
		}
		
		//terciario
		
		String estado = edad >18 ? "Mayor" : "Menor";
		System.out.println(estado);
		
		
		
		//
		Boolean res = edad>18 ? true:false;
		System.out.println(res);
		
		
		//Ejercicio 1:
		
		System.out.println("1 ///////////////");
	
		
		for (int i = 1; i <= 10; i++) {
			int al = 1+ (int)(Math.random()*50);
		
			String va =  (al <10) ? "Tiene 1 digito" : "Tiene 2 digitos";
			System.out.println(al + " res : "+va);
			
			
			
			System.out.println("El valor : " + al + "rpt : " + ((al<10) ? "One digito" : "Two digito"));
			System.out.println("---------");
		}
		
		
		//
		System.out.println("1 / 100");
		
		
		for (int i = 1; i <= 100; i++) {
			System.out.println("el numero " + i + " Es : " +((i%2==0)? true:"impar"));
			
		}
	}
}
