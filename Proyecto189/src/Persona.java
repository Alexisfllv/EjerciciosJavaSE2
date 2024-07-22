
public class Persona {

	private static final int MAYOREDAD = 18;
	private static int  VALOR = 20;
	
	private String nombre;
	private int edad;
	
	
	public Persona(String nombre,int edad) {
		this.nombre =  nombre;
		this.edad = edad;
	}
	
	//
	public void imprimir() {
		System.out.println(nombre + " " + edad);
	}
	//
	
	
	public String retonarNombre() {
		return nombre;
	}
	
	public boolean esMayor() {
		if (edad>= MAYOREDAD) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	public static void main(String []args) {
		
		Persona p = new Persona("A", 12);
		if (p.esMayor()) {
			System.out.println("ES MAYOR : " + p.retonarNombre());
		}else {
			System.out.println("NO ES MAYOR : "+ p.retonarNombre());
		}
		
		System.out.println(Persona.MAYOREDAD);
		System.out.println(Persona.VALOR);
				
		
	}
}
