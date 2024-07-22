package dep;

public class PruebaCoordenadas {

	
	//
	public static void main (String [] arrgs) {
		//
		Coordenadas coo = new Coordenadas();
		coo.agregarPunto(12, 12);
		coo.agregarPunto(2, -7);
		coo.agregarPunto(-3, 2);
		coo.agregarPunto(-5, -4);
		coo.agregarPunto(-9, -2);
		//
		System.out.println("Cantida de puntos en el primer cuadrante : " + coo.cantidadPuntosCuandrante(1));
		System.out.println("Cantida de puntos en el segundo cuadrante : " + coo.cantidadPuntosCuandrante(2));
		System.out.println("Cantida de puntos en el tercer cuadrante : " + coo.cantidadPuntosCuandrante(3));
		System.out.println("Cantida de puntos en el cuarto cuadrante : " + coo.cantidadPuntosCuandrante(4));
		
		coo.listar();
	}
}
