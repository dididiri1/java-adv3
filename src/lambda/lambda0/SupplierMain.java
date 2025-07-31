package lambda.lambda0;

import java.util.function.Supplier;

public class SupplierMain {

    public static void main(String[] args) {
        Supplier<Double> supplier = () -> Math.random();

        System.out.println("랜덤 숫자 = " + supplier.get());
    }
}
