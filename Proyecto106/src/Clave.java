
public class Clave {

	
	private void Solteria(String nom) {
		if (nom.equals("123abc")) {
			System.out.println("La clave es correcta");
		}else {
			System.out.println("La clave no es correcta");
		}
	}
	
	//
	public static void main(String[] args) {
		Clave cl = new Clave();
		cl.Solteria("123abc");
	}
}
