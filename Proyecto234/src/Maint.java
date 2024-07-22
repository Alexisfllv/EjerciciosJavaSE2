interface Calculadora {
    int calcular(int a, int b);
}

public class Maint {
    public static void main(String[] args) {
        Calculadora suma = new Calculadora() {
            public int calcular(int a, int b) {
                return a + b;
            }
        };

        int resultado = suma.calcular(5, 3);
        System.out.println("El resultado de la suma es: " + resultado); // Imprime "El resultado de la suma es: 8"
    }
}
