package lambda.lambda0;

import java.util.List;
import java.util.stream.Collectors;

public class PredicateMain {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(-3, -2, -1, 1, 2, 3);

        List<Integer> even = numbers.stream().filter(value -> value % 2 == 0).collect(Collectors.toList());

        System.out.println(even);
    }
}
