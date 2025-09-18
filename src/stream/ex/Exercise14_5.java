package stream.ex;

import java.util.Arrays;

public class Exercise14_5 {
    public static void main(String[] args) {
        String[] strArr = {"aaa", "bbb", "c","dddd"};

        int max = Arrays.stream(strArr)
                .mapToInt(s -> s.length())
                .max().getAsInt();

        System.out.println("max = " + max);
    }
}
