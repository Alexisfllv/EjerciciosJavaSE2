package lu;

import java.util.ArrayList;

public class cood {

	private class demon {

		//
		int x;

		String res;

		public demon(int x) {
			// TODO Auto-generated constructor stub
			this.x = x;

		}

		public void li() {
			System.out.println(x);
		}

		

		
	}

	//
	ArrayList<demon> dem = new ArrayList<demon>();

	public void insertarNuevo(int x) {
		dem.add(new demon(x));
	}
	
	public void listar() {
		for (demon demon : dem) {
			demon.li();

		}
	}
}
