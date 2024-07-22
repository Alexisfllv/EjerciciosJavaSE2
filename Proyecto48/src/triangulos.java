import java.util.Scanner;

public class triangulos {

	public static void main(String[] args) {
		
		//tipo de triangulo
		//cantidad por tipo
		//cantidad del mismo tipo
		
		int a,b,c;
		int ttb=0,tta=0,ttc=0;
		int cantidad=0,valor=0;
		
		
		String menor = "";
		String tb="Isosceles";
		String ta="Equilatero";
		String tc="Escaleno";
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Cuantos triangulos va a operar : ");
		cantidad = scan.nextInt();
		
		for (int i = 1; i <= cantidad; i++) {
			
			System.out.print("Ingresar lado a : ");
			a = scan.nextInt();
			
			System.out.print("Ingresar lado b : ");
			b = scan.nextInt();
			
			System.out.print("Ingresar lado c : ");
			c = scan.nextInt();
			
			if (a == b && a != c && b != c) {
				System.out.println(tb);
				ttb = ttb+1;
			}
			
			if (a ==b && a==c && b==c) {
				System.out.println(ta);
				tta = tta+1;
			}
			
			if (a !=b && a!=c && b!=c) {
				System.out.println(tc);
				ttc = ttc+1;
			}
			
			//
			
		}

		//cantidad de triagulos
		System.out.println("Cantidad de triangulos equilateros : " + tta);
		System.out.println("Cantidad de triangulos isosceles : " + ttb);
		System.out.println("Cantidad de triangulos escaleno : " + ttc);
		
		//cantidad del menor
		if (tta<ttc) {
			menor = ta;
		}else if (ttb<tta) {
			menor = tb;
		}else if (ttc<ttb){
			menor = tc;
		}else  if (tta==ttb && tta==ttc && ttc==ttb) {
			menor = "Todos los triangulos estan con la misma cantidad";
		}else{
			menor = "Dos triangulos estan iguales";
		}
		System.out.println("Triangulo con menor cantidad   : " + menor);
		
		
	}
	
}
