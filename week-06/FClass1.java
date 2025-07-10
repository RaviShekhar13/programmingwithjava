import java.util.*;

public class FClass1 {
    public static void main(String[] args) {
        Map<Integer, Character> entries = new TreeMap<Integer, Character>();
        entries.put(30, 'b');
        entries.put(40, 'a');
        entries.put(20, 'd');
        entries.put(10, 'c');
        // _______________________________________ //LINE 1
        // LinkedList<Character> values = new LinkedList<Character>(entries.values());
        TreeSet<Character> values = new TreeSet<Character>(entries.values());
        // PriorityQueue<Character> values = new
        // PriorityQueue<Character>(entries.values());
        // Collection<Character> values = entries.values();
        for (Character c : values)
            System.out.print(c + " ");
    }
}