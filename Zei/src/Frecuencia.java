import java.util.HashMap;
import java.util.Map;

public class Frecuencia {
    public static void main(String[] args) {
        String texto = "DDABEBADACABAAECDCBAEACABCBAADDEAACAEAB";
        Map<Character, Integer> frecuencias = new HashMap<>();
        
        for (char letra : texto.toCharArray()) {
            if (frecuencias.containsKey(letra)) {
                frecuencias.put(letra, frecuencias.get(letra) + 1);
            } else {
                frecuencias.put(letra, 1);
            }
        }
        
        System.out.println("Frecuencias:");
        for (char letra : frecuencias.keySet()) {
            System.out.println(letra + ": " + frecuencias.get(letra));
        }
    }
}
