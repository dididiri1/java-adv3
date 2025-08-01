package lambda.lambda3;

public class GenericMain1 {

    public static void main(String[] args) {
        StringFunction upperCase = s -> s.toUpperCase();
        String result1 = upperCase.apply("hello");

        System.out.println("result1 = " + result1);

        NumberFunction square = n -> n * n;
        int result12= square.apply(3);
        System.out.println("result12 = " + result12);

    }

    @FunctionalInterface
    interface StringFunction {
        String apply(String s);
    }

    @FunctionalInterface
    interface NumberFunction {
        int apply(Integer s);
    }
}
