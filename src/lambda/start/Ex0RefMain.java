package lambda.start;

public class Ex0RefMain {

    public static void hello(String str) {
        System.out.println("프로그램 시작");
        // 변화는 문자값
        System.out.println(str);
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        hello("Hello Java");
        hello("Hello Spring");
    }
}
