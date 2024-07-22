
public class Persona {
	
	private String nombre;
	private int edad;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	
	public void imprimir() {
		System.out.println(nombre +" Y la edad es :"+ edad);
	}
	
	//extrar la edad
	
	public int retornarEdad () {

		return edad;
	}
	
	public void imprimirEdad() {
		System.out.println(" Edad " + edad);
		
	}
	
}
