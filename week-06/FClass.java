import java.util.*;

public class FClass {
    public static void main(String[] args) {
        Map<Character, Integer> frequencyTab = new LinkedHashMap<Character, Integer>();
        String str = "incomprehensibilities";
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            // __________________________________________
            frequencyTab.put(c, frequencyTab.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> e : frequencyTab.entrySet()) {
            System.out.print("[" + e.getKey() + ", " + e.getValue() + "] ");
        }
    }
}