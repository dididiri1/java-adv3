package lambda.lambda2;

import lambda.MyFunction;

public class LambdaPassMain4 {
    public static void main(String[] args) {
        MyFunction add = getOperation("add");
        System.out.println("add.apply(1, 2) = " + add.apply(1, 2));

        MyFunction sub = getOperation("sub");
        System.out.println("sub.apply(1, 2) = " + sub.apply(1, 2));

        MyFunction xxx = getOperation("xxx");
        System.out.println("xxx.apply(1, 2) = " + xxx.apply(1, 2));
    }

    // 람다를 반환하는 메서드
    static MyFunction getOperation(String operator) {
        switch (operator) {
            case "add" :
                return new MyFunction() {
                    @Override
                    public int apply(int a, int b) {
                        return a + b;
                    }
                };
            case "sub" :
                return new MyFunction() {
                    @Override
                    public int apply(int a, int b) {
                        return a -b;
                    }
                };
            default:
                return new MyFunction() {
                    @Override
                    public int apply(int a, int b) {
                        return 0;
                    }
                };
        }
    }
}
