import java.util.Scanner;

public class Porcentaes {

	
	
	public static void main(String [] args) {
	
		
		
		int totalpreguntas =0,totalrespuestas=0;
		
		int porcentaje=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese cantidad de preguntas : ");
		totalpreguntas = scan.nextInt();
		System.out.print("Ingrese cantidad de Respuesta correctas : ");
		totalrespuestas = scan.nextInt();
		
		
		///
		porcentaje = (totalrespuestas * 100 ) / totalpreguntas;
		
		if (porcentaje >=90 && porcentaje <=totalpreguntas) {
			System.out.print("Nivel maximo : " + porcentaje + "");
		}else {
			if (porcentaje >= 75 && porcentaje<90) {
				System.out.print("Nivel medio : " + porcentaje + "");
			}else {
				if (porcentaje >=50 && porcentaje <75) {
					System.out.print("Nivel regular : " + porcentaje + "");
				}else {
					if (porcentaje<50) {
						System.out.print("Fuera de nivel : " + porcentaje + "");
					}else {
						System.out.print("ERROR");
					}
				}
			}
		}
	}
}
