
public class Prueba{

	
	public static void main (String [] arghs) {
		//
		//Aninadas ani = new Aninadas();
		
		
		//Aninadas.dead d2 = ani.new dead();
		Aninadas.dead d22= new Aninadas.dead();
		Aninadas an = new Aninadas();
		
		System.out.println( an.b+ d22.a);
		System.out.println(d22.a + an.b);
		
		System.out.println(d22.clasea());
		d22.imprmir();
	}
}
