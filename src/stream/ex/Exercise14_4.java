package stream.ex;

import java.util.Arrays;

public class Exercise14_4 {
    public static void main(String[] args) {
        String[] strArr = {"aaa", "bbb", "c","ddd"};

        int sum = Arrays.stream(strArr)
                .mapToInt(String::length)
                .sum();

        System.out.println(sum);
    }
}
