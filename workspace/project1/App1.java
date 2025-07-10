import java.util.*;

class Test {
    // FUNCTION HEADER for function calculateSum
    {
        // Prints the sum of the numbers in the collection
    }

    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        c.add(10);
        c.add(20);
        Collection<Double> c1 = new LinkedList<>();
        c1.add(15.5);
        c1.add(25.3);
        calculateSum(c);
        calculateSum(c1);
    }

    public static <T extends Number> void calculateSum(Collection<T> c) {
        System.out.println(c);
    }
    // public static void calculateSum(Collection<? extends Number> c) {
    // System.out.println(c);
    // }

    // public static void calculateSum(Collection<Double> c) {
    // System.out.println(c);
    // }
}