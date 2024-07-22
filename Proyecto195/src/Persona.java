
public class Persona {

	private String nombre;
	private int edad;
	public Persona(String nombre , int edad) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.edad =  edad;
	}
	
	public void imprimir() {
		System.out.println(nombre + " " +edad) ;
	}
	
}
