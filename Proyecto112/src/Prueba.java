
public class Prueba {

	public static void main(String [] args) {
		Suma suma = new Suma();
		suma.cargar1();
		suma.cargar2();
		suma.operar();
		suma.mostrarResultado();
		
		Resta res = new Resta();
		res.cargar1();
		res.cargar2();
		res.operar();
		res.mostrarResultado();
	}
}
