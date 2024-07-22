
public class Perrsona {

	
	private  String nombre;
	private  int edad;
	
	
	public Perrsona() {
		// TODO Auto-generated constructor stub
	}


	public Perrsona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//imp
	
	
	
	
	
	
	public void imprimir() {
		System.out.println(nombre + " y la edad es : "+edad);
	}
	
	
	//retornar edad
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public void retornarEdad() {
		System.out.println("Edad es : " + edad);
	}
	
}
