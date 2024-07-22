package deco;

import java.util.*;

public class ShannonEncoder {

    public static void main(String[] args) {
        String message = "Alexis";
        Map<Character, Integer> frequencyTable = buildFrequencyTable(message);
        Map<Character, String> codeTable = buildCodeTable(frequencyTable);

        System.out.println("Mensaje a codificar: " + message);
        System.out.println("Frecuencia de tabla: " + frequencyTable);
        System.out.println("Codigo Tabla: " + codeTable);
        String encodedMessage = encodeMessage(message, codeTable);
        System.out.println("Encoded : " + encodedMessage);
        String decodedMessage = decodeMessage(encodedMessage, codeTable);
        System.out.println("Decoded : " + decodedMessage);
    }

    public static Map<Character, Integer> buildFrequencyTable(String message) {
        Map<Character, Integer> frequencyTable = new HashMap<>();
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            frequencyTable.put(c, frequencyTable.getOrDefault(c, 0) + 1);
        }
        return frequencyTable;
    }

    public static Map<Character, String> buildCodeTable(Map<Character, Integer> frequencyTable) {
        List<Map.Entry<Character, Integer>> sortedEntries = new ArrayList<>(frequencyTable.entrySet());
        sortedEntries.sort(Map.Entry.comparingByValue());
        Map<Character, String> codeTable = new HashMap<>();
        String code = "";
        for (Map.Entry<Character, Integer> entry : sortedEntries) {
            codeTable.put(entry.getKey(), code);
            code = incrementCode(code);
        }
        return codeTable;
    }

    private static String incrementCode(String code) {
        StringBuilder sb = new StringBuilder(code);
        int index = sb.length() - 1;
        while (index >= 0 && sb.charAt(index) == '1') {
            sb.setCharAt(index, '0');
            index--;
        }
        if (index >= 0) {
            sb.setCharAt(index, '1');
        }
        return sb.toString();
    }

    public static String encodeMessage(String message, Map<Character, String> codeTable) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            sb.append(codeTable.get(c));
        }
        return sb.toString();
    }

    public static String decodeMessage(String encodedMessage, Map<Character, String> codeTable) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while (index < encodedMessage.length()) {
            for (Map.Entry<Character, String> entry : codeTable.entrySet()) {
                if (encodedMessage.startsWith(entry.getValue(), index)) {
                    sb.append(entry.getKey());
                    index += entry.getValue().length();
                    break;
                }
            }
        }
        return sb.toString();
    }
}
