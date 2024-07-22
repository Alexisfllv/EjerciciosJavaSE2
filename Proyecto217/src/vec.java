import java.util.InputMismatchException;
import java.util.Scanner;

public class vec {

	public static void main(String[] args) {
		//
		int[] numeros = { 2, 3, 4, 1, 5, 7, 3, 2, 7, 10 };

		Scanner scan = new Scanner(System.in);
		int indice;

		try {

			System.out.println("Ingrese el indice a buscar : ");
			indice = scan.nextInt();
			indice--;
			System.out.println(numeros[indice]);
		} catch (InputMismatchException e) {
			System.out.println("Ingrese solo numeros");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Fuera de limite");

		}

	}
}
