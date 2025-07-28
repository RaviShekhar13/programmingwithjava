
import java.util.*;
import java.util.stream.*;

public interface GR_08_11 {
    public static void main(String[] args) {
        String[] input = { "1,2,3", "4,5", "6,7,8,9" };

        Stream.of(input)
                .flatMap(s -> Arrays.stream(s.split(",")))
                .map(Integer::parseInt)
                .filter(n -> n % 2 == 0)
                .skip(1)
                .limit(2)
                .forEach(n -> System.out.print(n * n + " "));
    }
}