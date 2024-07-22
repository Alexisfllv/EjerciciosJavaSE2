
public class xx2 {

	
	private int v1 ,v2;
	
	public xx2(int v1, int v2 ){
		this.v1 =  v1;
		this.v2 =  v2;

	}
	
	
	
	//1
	public int sumar(int v1, int v2) {
		return v1+v2;
	}
	
	//2
	public static int sumar2 (int v1,int v2) {
		return  v1+v2;
	}
	
	//3
	
	public void sumar3() {
		int suma =  v1+v2;
		System.out.println(suma);
		
	}
	
	
	
	
	public void dividir()  throws Exception{
		if (v2 == 0) {
			throw new Exception("No se puede divir x 0");
		}
		
		int division = v1/v2;
		System.out.println("div : " + division);
	}
	

	
	
	
	
	public static void main (String[] args) {
		//
		xx2 x2 = new xx2(25, 0);
		try {
		
			x2.dividir();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		//metodo sobrecargado
		System.out.println(x2.sumar(12, 4));
		

		//static
		System.out.println(" 2 .1 : "+sumar2(23,22));
		System.out.println(" 2 .2 : "+xx2.sumar2(1,2));
		
		//instancia
		x2.sumar3();
		
		
	}
}
