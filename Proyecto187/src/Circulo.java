
public class Circulo {

	private double radio;
	private final double pi = 3.1416;
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public double retonarPerimetro() {
		return 2*pi *radio;
	}
	
	
	
	public static void main (String []args) {
		
	
		Circulo cir = new Circulo(5);
		System.out.println("El perimetro es : "  +" valor es "+ cir.retonarPerimetro());
	}
}
