import java.util.*;

public class Sample {
    public static void main(String[] args) {
        var numbers1 = Arrays.asList(1, 2, 3);
        var numbers2 = List.of(1, 2, 3);

        System.out.print(numbers1 == List.copyOf(numbers1));
        System.out.println(" ");
        System.out.print(numbers2 == List.copyOf(numbers2));
    }
}

// Whats the output of this code?
