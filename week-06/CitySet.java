import java.util.*;

public class CitySet {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Delhi", "Mumbai", "Chennai", "Delhi");
        Set<String> set1 = new LinkedHashSet<String>();
        Set<String> set2 = new TreeSet<String>();
        for (String city : cities) {
            set1.add(city);
            set2.add(city);
        }
        for (String city : set1) {
            System.out.print(city + " ");
        }
        System.out.println();
        for (String city : set2) {
            System.out.print(city + " ");
        }
    }
}