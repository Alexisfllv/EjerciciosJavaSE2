import java.util.*;

public class ShannonCoding {
    public static void main(String[] args) {
        Map<Character, Double> probabilities = new HashMap<>();
        probabilities.put('A', (double) 15);
        probabilities.put('B', (double) 7);
        probabilities.put('C', (double) 6);
        probabilities.put('D', (double) 6);
        probabilities.put('E', (double) 5);
        
        double entropy = 0;
        for (double p : probabilities.values()) {
            entropy -= p * Math.log(p) / Math.log(2);
        }
        
        Map<Character, String> codes = new HashMap<>();
        List<Map.Entry<Character, Double>> list = new ArrayList<>(probabilities.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        String code = "0";
        for (Map.Entry<Character, Double> entry : list) {
            codes.put(entry.getKey(), code);
            code = increment(code);
        }
        
        double averageLength = 0;
        for (Map.Entry<Character, Double> entry : probabilities.entrySet()) {
            char symbol = entry.getKey();
            double probability = entry.getValue();
            String symbolCode = codes.get(symbol);
            averageLength += probability * symbolCode.length();
            System.out.println(symbol + ": " + symbolCode);
        }
        
        System.out.println("Entropia: " + entropy + " bits/simbolo");
        System.out.println("Largo de la serie: " + averageLength + " bits/simbolo");
    }
    
    private static String increment(String code) {
        char[] chars = code.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == '0') {
                chars[i] = '1';
                return new String(chars);
            } else {
                chars[i] = '0';
            }
        }
        return "1" + new String(chars);
    }
}
