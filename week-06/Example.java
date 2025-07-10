import java.util.*;

public class Example {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        // -----------SEGMENT 1-------------------------
        // for (Integer i : list) {
        // if (m.containsKey(i)) {
        // m.put(i, m.get(i) + 1);
        // } else {
        // m.put(i, 1);
        // }
        // }

        // --------------

        for (Integer i : list) {
            m.put(i, m.getOrDefault(i, 0) + 1);
        }

        // -------------

        // for (Integer i : list) {
        // m.merge(i, 0, m.get(i) + 1);
        // }
        // for (Integer i : list) {
        // m.put(i, m.get(i) + 1);
        // }

        for (HashMap.Entry<Integer, Integer> entry : m.entrySet()) {
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());

        }
    }
}