
public class PruebaPersona {

	public static void main(String []args) {
		
		PruebaPersona p = new PruebaPersona();
	
		Persona pe1 = new Persona("Lemon", 23);
		Persona pe2 = new Persona("Mion", 18);
		pe1.imprimir();
		pe2.imprimir();
		//
		Persona Pmayor = Persona.mayor(pe1, pe2);
		
		System.out.println(" Mayor edad : ");
		
		Pmayor.imprimir();
		
		Persona.mayor(pe1, pe2).imprimir();
		
		
	}
}
