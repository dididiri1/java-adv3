package lambda.lambda0;

import java.util.function.Consumer;

public class ConsumerMain {

    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;

        consumer.accept("Hello");
    }
}


