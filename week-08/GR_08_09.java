import java.util.stream.Stream;
import java.util.*;

public class GR_08_09 {
    int j = 0;

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i < 10; i++) {
            list.add(i);
        }
        // CODE BLOCK 1
        Stream<Integer> stream = list.stream();
        List<Integer> newList = (List) stream.filter(j -> j % 2 == 0);
        newList.forEach(s -> System.out.println(s));
    }
}
