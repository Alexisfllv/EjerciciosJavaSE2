
public class Genericas {
	
	public static void main (String [] args) {
		
		 Pila<Persona> pil1 = new Pila<Persona>();
		 pil1.insertar(new Persona("Juan", 23));
		 pil1.insertar(new Persona("Lccs", 12));
		 pil1.insertar(new Persona("Sccr", 32));
		 
		 
		 Persona ultimaPersona = pil1.extraer();
		 System.out.println("Extraer el primer elemento : " );
		 ultimaPersona.imprimir();
		 
		 Pila<Carta> cart1 = new Pila<Carta>();
		 cart1.insertar(new Carta(1, Simbolo.CORAZN));
		 cart1.insertar(new Carta(2, Simbolo.PKZ));
		 cart1.insertar(new Carta(3, Simbolo.TREBOL));
		 cart1.insertar(new Carta(4, Simbolo.ROMBO));
		 Carta extraerUltimaCarta =  cart1.extraer();
		 System.out.println("Extraemos el primer elemento : ");
		 extraerUltimaCarta.imprimir();
		 
		 //ingresar una variable String y 
		 //Integer
		 
		 
		 Pila<String> sp = new Pila<String>();
		 sp.insertar(new String("Alexis"));
		 sp.insertar(new String("Ferr"));
		 sp.insertar(new String("Fawcett "));
		 
		 String extracion =  sp.extraer();
		 System.out.println("Extraccion  " + extracion);
		 
		 Pila<Integer> ip = new Pila<Integer>();
		 ip.insertar(2);
		 ip.insertar(3);
		 ip.insertar(5);
		 
		 Integer extraccion2 = ip.extraer();
		 System.out.println("Extraccion " + extraccion2);
		
		 
		 
		 
		 
		 
	}

}
