
public class Dados {

	public static void main(String[] args) {

		int l1 = 0, l2 = 0, l3 = 0, l4 = 0, l5 = 0, l6 = 0;

		for (int i = 0; i < 1000; i++) {
			int dado = 1 + (int) (Math.random() * 6);
			if (dado == 1) {
				l1++;
			} else if (dado == 2) {
				l2++;
			} else if (dado == 3) {
				l3++;
			} else if (dado == 4) {
				l4++;
			} else if (dado == 5) {
				l5++;
			} else if (dado == 6) {
				l6++;
			}

		}

		System.out.println("Cantidad de veces que salio 1 " + l1);
		System.out.println("Cantidad de veces que salio 2 " + l2);
		System.out.println("Cantidad de veces que salio 3 " + l3);
		System.out.println("Cantidad de veces que salio 4 " + l4);
		System.out.println("Cantidad de veces que salio 5 " + l5);
		System.out.println("Cantidad de veces que salio 6 " + l6);
		
		int y1 = 0, y2 = 0, y3 = 0, y4 = 0, y5 = 0, y6 = 0;
		
		for (int i = 0; i < 1000; i++) {
			int dad = 1 + (int)(Math.random()*6);
			
			switch (dad) {
			case 1:
				y1++;
				break;
			case 2:
				y2++;
				break;
			case 3:
				y3++;
				break;
			case 4:
				y4++;
				break;
			case 5:
				y5++;
				break;
			case 6:
				y6++;
				break;
			default:
				break;
			}
		}
		
		//
		System.out.println("/////////////////////////////////////");
		System.out.println("Cantidad de veces que salio 1 " + y1);
		System.out.println("Cantidad de veces que salio 2 " + y2);
		System.out.println("Cantidad de veces que salio 3 " + y3);
		System.out.println("Cantidad de veces que salio 4 " + y4);
		System.out.println("Cantidad de veces que salio 5 " + y5);
		System.out.println("Cantidad de veces que salio 6 " + y6);
		

	}

}
