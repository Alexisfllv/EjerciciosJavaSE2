import java.util.Iterator;

public class coleccion {

	public static void main (String [] args) {
		//
		
		int[] dato = { 1,2,3,4,5};
		
		int suma=0;
		
		for (int i : dato) {
			System.out.print(i+ "-");
			suma = suma+i;
		}
		System.out.println();
		System.out.println(suma);
		
		
	}
}
