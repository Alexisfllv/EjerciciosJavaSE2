import java.util.HashMap;
import java.util.Map;

public class ShannonFano {
    public static void main(String[] args) {
        String message = "ABCDABCADBC";
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : message.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        int n = message.length();
        double[] probabilities = new double[4];
        for (int i = 0; i < probabilities.length; i++) {
            char symbol = "ABCD".charAt(i);
            int frequency = frequencyMap.getOrDefault(symbol, 0);
            probabilities[i] = (double) frequency / n;
        }
        double entropy = 0.0;
        for (double p : probabilities) {
            entropy -= p * log2(p);
        }
        System.out.printf("Entropy: %.2f bits\n", entropy);
        String[] codes = shannonFano(probabilities);
        double averageLength = 0.0;
        for (int i = 0; i < codes.length; i++) {
            char symbol = "ABCD".charAt(i);
            int frequency = frequencyMap.getOrDefault(symbol, 0);
            averageLength += probabilities[i] * codes[i].length();
            System.out.printf("Symbol: %c, Code: %s\n", symbol, codes[i]);
        }
        System.out.printf("Average code length: %.2f bits\n", averageLength);
    }

    private static String[] shannonFano(double[] probabilities) {
        return shannonFano(probabilities, 0, probabilities.length -
