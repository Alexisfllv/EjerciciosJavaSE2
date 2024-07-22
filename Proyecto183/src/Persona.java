
public class Persona {

	private String nombre;
	private int edad;
	public static int cantidad;
	
	//
	public Persona(String nombre , int edad) {
		//
		this.nombre = nombre;
		this.edad = edad;
		
		cantidad++;
	}
	

	//
	
	
	
	//
	public void imprimir() {
		System.out.println(nombre + " / " + edad);
	}
	
	public static void main(String [] args) {
		System.out.println("Valor del atributo cantidad = " + Persona.cantidad);
		
		Persona p = new Persona("Juan",23);
		
		p.imprimir();
		System.out.println("Valor del atributo cantidad = " + Persona.cantidad);
		
		Persona p2 = new Persona("Luo",33);
		p2.imprimir();
		
		System.out.println("Valor del atributo cantidad = " + p.cantidad);
		
		Persona p3 = new Persona("Moe",44);
		Persona p4 = new Persona("Shop",55);
		Persona p5 = new Persona("Lep",66);
		
		System.out.println("Valor del atributo cantidad = " + p.cantidad);
	}
}
