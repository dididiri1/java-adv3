package stream.ex;

import java.util.Comparator;
import java.util.Random;
import java.util.stream.IntStream;

public class Exercise14_6 {

    public static void main(String[] args) {
        // 기본형 스트림에 난수를 발생시키는 스트림을 저장
        IntStream intStream = new Random().ints(1, 46);

        intStream
                .distinct()
                .limit(6)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }
}
