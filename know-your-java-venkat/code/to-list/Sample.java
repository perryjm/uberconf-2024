import java.util.*;
import static java.util.stream.Collectors.*;

public class Sample {
    public static void main(String[] args) {
        var numbers = List.of(1, 2, 3);

        var doubled = numbers.stream()
            .map(e -> e * 2)
            .toList();
            //.collect(toList());
        System.out.println(doubled);
    }
}

// Which is better, .collect(toList()) or .toList()
