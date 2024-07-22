
public class Prueba {
	public static void main(String [] args) {
		
		Persona persona= new Persona();
		persona.cargarDatos();
		persona.imprimir();
		
		//	
		Empleado em = new Empleado();
		em.cargarDatos();
		em.cargarSueldo();
		em.imprimir();
		em.imprimirSueldo();
	}
	

}
