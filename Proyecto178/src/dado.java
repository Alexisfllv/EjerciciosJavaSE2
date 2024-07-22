
public class dado {

	
	public static void main (String [] args) {
		
		
		//
		
		int par=0,impar=0;
		
		for (int i = 0; i < 1000; i++) {
			//
			int valor = 1+ (int)(Math.random()*6);
			
			switch (valor) {
			case 1:
			case 3:
			case 5:
				impar++;
				break;
			case 2:
			case 4:
			case 6:
				par++;
				break;

			default:
				break;
			}
		}
		
		//
		System.out.println("////////////");
		System.out.println("Valor par : " + par);
		System.out.println("Valor impar : "+impar);
	}
}
