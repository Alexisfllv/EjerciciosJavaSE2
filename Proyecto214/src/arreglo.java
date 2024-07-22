
public class arreglo {

	
	public static void main (String [] args) {
		//
		
		String [] alumno = {"Juan" ,"Ana","Luis","Carla","Pedro","Laura","Maria"};
		
		int[] notas = {3,7,10,9,2,8,5};
		
		String[] res;
		
		for (int i = 0; i < notas.length; i++) {
			res =  new String[notas.length];
			String val =(notas[i]<4?"libre":"regular");
			res[i]= val;
			System.out.println(alumno[i] + " & "+ notas[i] + "estado es : " + res[i]);
					
		}
	}
}
