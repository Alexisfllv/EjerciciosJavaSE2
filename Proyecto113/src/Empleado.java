
public class Empleado  extends Persona{
	
	protected int sueldo;
	
	public void cargarSueldo() {
		System.out.print("Ingrese sueldo : ");
		sueldo = scan.nextInt();
	}
	
	public void imprimirSueldo() {
		System.out.println("Sueldo es : " + sueldo);
	}
	

}
