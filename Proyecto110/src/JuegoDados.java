
public class JuegoDados {

	
	private Dado dado1,dado2,dado3;
	
	public JuegoDados() {
		dado1 = new Dado();
		dado2 = new Dado();
		dado3 = new Dado();
		
	}
	
	public void Jugar() {
		dado1.tirar();
		dado1.mostrar();
		dado2.tirar();
		dado2.mostrar();
		dado3.tirar();
		dado3.mostrar();
		
		if (dado1.retornarValor()==dado2.retornarValor() &&
			dado1.retornarValor() == dado3.retornarValor()) {
			//
			System.out.println("Ganaste");
		}else {
			System.out.println("Perdiste");
		}
	}
	
	public static void main(String [] args) {
		JuegoDados jg = new JuegoDados();
		jg.Jugar();
	}
}
