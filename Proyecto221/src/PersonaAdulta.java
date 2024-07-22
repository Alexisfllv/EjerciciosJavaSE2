
public class PersonaAdulta {

	private String nombre;
	private int edad;
	
	public PersonaAdulta(String nombre,int edad) throws Exception{
		this.nombre= nombre;
		if (edad<18) {
			throw new Exception("No es adulta la persona"+ nombre + " tiene la edad de  : "+ edad);
		}
		this.edad = edad;
	}
	
	
	public void fijarEdad (int edad) throws Exception{
		if (edad<18) {
			throw new Exception("No es adulta la persona"+ nombre + " tiene la edad de  : "+ edad);
		}
		this.edad = edad;
	}
	
	
	public void imprimir() {
		System.out.println(nombre + " tiene edad : "+edad);
	}
	
	
	
	public static void main (String [] args) {
		try {
			
			PersonaAdulta p1 =  new PersonaAdulta("Ana", 50);
			
			p1.imprimir();
			
			PersonaAdulta p2 = new PersonaAdulta("Ma", 22);
			p2.fijarEdad(13);
			p2.imprimir();
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}
