
public class MetodoFinal extends Persona{

	
	//
	
	private int sueldo;
	
	public MetodoFinal(String nombre, int edad,int sueldo) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
		this.sueldo = sueldo;
	}
	

	//
	public void imprimirSueldo() {
		System.out.println("Sueldo es :" + sueldo);
	}
	
	
	

	public static void main (String [] args) {
		Persona p= new Persona("Ded", 23);
		
		
		//
		System.out.println("Clase Persona");
		p.imprimir();
		//
		if (p.mayorEdad()) {
			System.out.println(p.nombre + " Es mayor de edad : " + p.edad);
		}else {
			System.out.println(p.nombre + " No es mayor de edad : " + p.edad);
		}
		
		System.out.println("Clase Empleado");
		MetodoFinal mt = new MetodoFinal("Alexis", 13, 1500);
		mt.imprimir();
		mt.imprimirSueldo();
		
		if (mt.mayorEdad()) {
			System.out.println(p.nombre + " Es mayor de edad : " + p.edad + " sueldo : "+mt.sueldo );
		}else {
			System.out.println(p.nombre + " No es mayor de edad : " + p.edad + " sueldo : "+mt.sueldo );
		}
		
	}
}
