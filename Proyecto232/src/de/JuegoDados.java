package de;

public class JuegoDados {
	
	
	private String jugador;
	private Dado dado1;
	
	//
	private class Dado{
		private int valor =1;
		
		public void tirar() throws Exception{
			if (jugador == null) {
				throw new Exception("No hay jugador");
				//
			}valor = 1 + (int) (Math.random()*6);
		}
		
		
		//
		public void imprimir() {
			System.out.println("Jugador : "+ jugador + " con el valor dado :"+valor);
		}
	}
	
	
	//
	public JuegoDados() {
		dado1 = new Dado();
	}
	
	public void jugar() {
		try {
			jugador = "pedro";
			dado1.tirar();
			dado1.imprimir();
			jugador = "ana";
			dado1.tirar();
			dado1.imprimir();
			jugador = null;
			dado1.tirar();
			dado1.imprimir();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	//main
	public static void main (String [] args) {
		//
		JuegoDados jd = new JuegoDados();
		jd.jugar();
		

			
	}
	

}
