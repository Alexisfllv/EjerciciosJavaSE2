
public enum Mes {

	ENERO(1),FEBRERO(2),MARZO(3),ABRIL(4),MAYO(5),JUNIO(6),JULIO(7),AGOSTO(8),SEPTIMEBRE(9),OCTUBRE(10),NOVIEMBRE(11),DICIEMBRE(12);
	
	private final int numero;
	
	Mes(int numero) {
		this.numero = numero;
	}
	
	public int retornarNumero() {
		return numero;
	}
	
	public Mes retornarMes() {
		return Mes.ABRIL;
	}
	
	
	public void imprimir () {
		System.out.println( +numero);
	}
	
}
