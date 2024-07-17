import java.util.*;
import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class Sample {
    public static void main(String[] args) {
        var numbers = Arrays.asList(10, 12, 31, 41, 44, 23, 18);

        var result = numbers.stream()
            .collect(teeing(
                        minBy(comparing(e -> e)),
                        maxBy(comparing(e -> e)),
                        (min, max) -> new MinMax(min.orElse(0), max.orElse(0))
                        ));

        var min = numbers.stream()
            .collect(minBy(comparing(e -> e)));

        var max = numbers.stream()
            .collect(maxBy(comparing(e -> e)));

        System.out.println(min + ", " + max);
        
    }
}

// HOw can we remove the duplicate calls to stream() in the above code?
