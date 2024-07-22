package com.tutoriales.calculadora;

import com.tutoriales.rutinas.Matematica;

public class pruebaPaquete {

	
	
	public static void main (String [] args) {
	
		int x1 =  10;
		int x2 = 20;
		
		int suma = Matematica.Sumar(x1, x2);
		
		System.out.println("Suma es : " + suma);
		
		int resta = Matematica.Restar(x1, x2);
		System.out.println("Resta es : " + resta);
	}
}
