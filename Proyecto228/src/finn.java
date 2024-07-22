
public final class finn {

	//
	private int x,y;
	
	public finn (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void irmprimirCuadrante() {
		System.out.println("[ "+x+","+y+"] ");
		if (x>0 && y>0) {
			System.out.println("Se encuentra en el primer cuandrante");
		}else if (x<0 && y<0) {
			System.out.println("Se encuentra en el segundo cuandrante");
		}else if (x<0 && y>0) {
			System.out.println("Se encuentra en el tercer cuandrante");
		}else if (x>0 && y<0) {
			System.out.println("Se encuentra en el cuarto cuadrante");
		}
	}
	
	public static void main (String[] args) {
		//
		finn fin ;
		fin = new finn(4, 6);
		fin.irmprimirCuadrante();
		
		fin = new finn(-5, 5);
		fin.irmprimirCuadrante();
	}
	
}
