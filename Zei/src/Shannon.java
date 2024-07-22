
import java.util.Arrays;

public class Shannon {
    public static void main(String[] args) {
    	Shannon sn = new Shannon();
    	
        int[] datos = {15, 7, 6, 6, 5};
        double sumato =0;
        double sumatoentro =0;
        
        //double binario = 0;
        
        
        
        double[] res = new double[datos.length];
        double[] sentro = new double[datos.length];
        double[] bin = new double[datos.length];
        double entropia = 0;
        
        // Calcular la suma de los datos
        int suma = Arrays.stream(datos).sum();
        
        // Calcular las probabilidades de cada datocalcca
        for (int i = 0; i < datos.length; i++) {
            //probabilidades[i] = (double) datos[i] / suma;
            //sn.calcularLogartimo(suma,datos[i]);
            
            
        }
        
        //calcular probabilidad
        // Calcular las probabilidades de cada datocalcca
        for (int i = 0; i < datos.length; i++) {
           
            
            
            double logaritmoBaseDosne = Math.log(suma) / Math.log(2);
        	double logaritmoBaseDosbe = Math.log(datos[i]) / Math.log(2);
        	double resultado = logaritmoBaseDosne-logaritmoBaseDosbe;
        	 res[i] = resultado;
        	 
        	 
        	sumato = sumato + res[i];
        	sentro[i] = res[i] *datos[i];	 
        	sumatoentro = sumatoentro + sentro[i];
        	
        	
        	//
        	double binario = Double.doubleToLongBits(sentro[i]);
        	bin[i] = binario;
        	
        	 
        }
        
        //calcular en bits
        
        
        //sumatoria de la entropia
        
        
        
        System.out.println("Datos: " + Arrays.toString(datos));
        System.out.println("Probabilidades: " + Arrays.toString(res));
        System.out.println("Entropía: " + sumato);
        System.out.println("Suma  * Entro: " + Arrays.toString(sentro));
        System.out.println("suma entro: " + sumatoentro);
        System.out.println("Coleccion de  bits / Code : " + Arrays.toString(bin));
    }
    
    
    public  void calcularLogartimo(int n,int b) {
    	
    	double ne = n;
    	double be = b;
    	
    	double logaritmoBaseDosne = Math.log(ne) / Math.log(2);
    	double logaritmoBaseDosbe = Math.log(be) / Math.log(2);
    	double resultado = logaritmoBaseDosne-logaritmoBaseDosbe;
    
    	
    	System.out.println("El logaritmo en base 2 de " + ne+ " / " + be + " = " + resultado);
    }
}
