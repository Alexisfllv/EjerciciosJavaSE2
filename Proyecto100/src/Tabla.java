
public class Tabla {

	
	private int tabla,termino;
	
	private Tabla(int ta) {
		//
		tabla = ta;
		termino = 10;
	}
	
	private Tabla(int ta , int ter) {
		tabla = ta;
		termino = ter;
	}
	
	public void Tablas() {
		for (int i = 1; i <= termino; i++) {
			int resultado = i*termino;
			System.out.println(i+" * "+termino +" = " +resultado  );
		}
	}
	
	public static void main(String[] args) {
		Tabla tab = new Tabla(5);
		tab.Tablas();
		Tabla tab2 = new Tabla(5,3);
		tab2.Tablas();
	}
}
