
public class prueba {

	
	public static void main(String [] args) {
		
		//
		int c1=0,c5=0,c10=0;
		int otros=0;
		
		for (int i = 0; i < 100; i++) {
			int valor = 1 + (int)(Math.random()*10);
			//
			switch (valor) {
			case 1:
				c1++;
				break;
			case 5:
				c5++;
				break;
			case 10:
				c10++;
				break;
			

			default:
				otros++;
				
			}
		}
		
		//
		System.out.println("///////////////");
		System.out.println("Valor 1 : " + c1);
		System.out.println("Valor 5 : " + c5);
		System.out.println("Valor 10 : " + c10);
		System.out.println("Valor otros : " + otros);
	}
}
