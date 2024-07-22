
public class Persona {

	protected String nombre;
	protected int edad;
	
	
	public Persona(String nombre,int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//
	
	public final boolean mayorEdad() {
		if (edad>18) {
			return true;
		}
		return false;
	}
	
	//
	public final void imprimir() {
		System.out.println(nombre + " Edad : "+edad);
	}
	
}
