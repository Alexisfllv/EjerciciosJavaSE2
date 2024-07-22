
public class Persona {

	
	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
		// TODO Auto-generated constructor stub
		this.nombre =  nombre;
		this.edad = edad;
		
	}
	
	public void imprimir () {
		System.out.println("Nombre :" + nombre + " La edad es : " + edad);
	}
	
	//retornar solo la edad:
	
	public String retornarNombre() {
		
		System.out.println(nombre);
		return nombre;
	}
	
}
