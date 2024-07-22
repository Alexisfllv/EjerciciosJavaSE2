import java.util.Scanner;

public class extraer {

	//
	private String nombre;
	private int monto;

	private Scanner scan;

	//
	public extraer(String nombre, int monto) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.monto = monto;
	}

	// metodos
	public void depositar(int adicion) {
		monto = monto + adicion;
	}

	public void extraer(int restar) throws Exception {
		if (restar > monto) {
			throw new Exception("No se puede quitar mas de lo que tienes ");
		}
		monto = monto - restar;

	}

	public void imprimir1() throws Exception {

	}

	// listar

	public void listar() {
		// listar
		System.out.println(nombre + " monto : " + monto);
	}

	public static void main(String[] args) {
		//
		extraer ext = new extraer("Alexis", 300);

		ext.listar();
		ext.depositar(400);
		ext.listar();
		try {
			ext.extraer(800);
			//
			ext.listar();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
