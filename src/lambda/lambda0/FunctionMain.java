package lambda.lambda0;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionMain {

    public static void main(String[] args) {
        Function<String, Integer> function = s -> s.length();

        System.out.println(function.apply("Lambda"));

        List<String> names = List.of("Java", "Spring", "Boot");

        List<Integer> lengths = names.stream().map(s -> s.length()).collect(Collectors.toList());
        System.out.println(lengths);

    }
}
