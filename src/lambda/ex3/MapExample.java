package lambda.ex3;

import lambda.ex2.StringFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MapExample {

    // 고차 함수, 함수를 인자로 받아, 리스트의 각 요소를 변환
    public static List<String> map(List<String> list, UnaryOperator<String> operator) {
        List<String> result = new ArrayList<>();
        for (String s : list) {
            String str = operator.apply(s);
            result.add(str);
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> words = List.of("hello", "java", "lambda");
        System.out.println("원본 리스트: " + words);

        // 1. 모든 문자열을 대문자로 변경
        List<String> upperList = map(words, new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        });

        System.out.println("대문자 변환 결과: " + upperList);

        // 2. 앞뒤에 *** 붙이기 (람다로 작성)
        List<String> decoratedList = map(words, new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                return "***" + s + "***";
            }
        });

        System.out.println("특수문자 데코 결과: " + decoratedList);
    }
}
