
public class Persona {

	private String nombre;
	private int edad;
	
	public Persona(String nombre , int edad) {
		this.nombre= nombre;
		this.edad = edad;
	}
	
	public void imprimir() {
		System.out.println(nombre + " / " + edad);
	}
	
	
	public static Persona mayor(Persona p1, Persona p2) {
		if (p1.edad > p2.edad) {
			return p1;
		}else {
			return p2;
		}
	}
}
